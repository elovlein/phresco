<%@page import="java.util.ArrayList"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ page import="org.apache.commons.collections.CollectionUtils"%>
<%@ page import="org.apache.commons.lang.StringUtils"%>
<%@ page import="java.util.List" %>

<%@ page import="com.photon.phresco.model.Technology"%>
<%@ page import="com.photon.phresco.commons.FrameworkConstants"%>
<%@ page import="com.photon.phresco.model.Server"%>
<%@ page import="com.photon.phresco.model.Database"%>

<%
	String fromPage = (String) request.getAttribute(FrameworkConstants.REQ_FROM_PAGE);
	List<Server> servers = (List<Server>) request.getAttribute(FrameworkConstants.REQ_TEST_SERVERS);
	List<Database> databases = (List<Database>) request.getAttribute(FrameworkConstants.REQ_DATABASES);

	List<String> tempListSelectedServers = (List<String>) request.getAttribute(FrameworkConstants.REQ_TEMPLIST_SELECTEDSERVERS);
	List<String> tempListSelectedDatabases = (List<String>) request.getAttribute(FrameworkConstants.REQ_TEMPLIST_SELECTEDDATABASES);
	
	List<Integer> listSelectedServerIds = (List<Integer>) request.getAttribute(FrameworkConstants.REQ_LISTSELECTED_SERVERIDS);
	List<Integer> listSelectedDatabaseIds = (List<Integer>) request.getAttribute(FrameworkConstants.REQ_LISTSELECTED_DATABASEIDS);
	
	List<String> listSelectedVersions = (List<String>) request.getAttribute(FrameworkConstants.REQ_LISTSELECTED_VERSIONS);
	String projInfoDbVersions = (String) request.getAttribute("projectInfoDbVersions");
	String selectedVersions = "";
	
	if (listSelectedVersions != null && CollectionUtils.isNotEmpty(listSelectedVersions)) {
		for (String listSelectedVersion : listSelectedVersions) {
			if (StringUtils.isEmpty(selectedVersions)) {
				selectedVersions = selectedVersions + listSelectedVersion;
			} else {
				selectedVersions = selectedVersions + "," + listSelectedVersion;
			}
		}
	}
	
	String header = (String)request.getAttribute(FrameworkConstants.REQ_HEADER);
	String headerType = (String)request.getAttribute(FrameworkConstants.REQ_HEADER_TYPE);
	String from = (String)request.getAttribute(FrameworkConstants.REQ_FROM);
	String divTobeUpdated = (String)request.getAttribute(FrameworkConstants.REQ_ATTRNAME);
%>

<form method="post" autocomplete="off" id="appinfoAttr">
<div class="popup_Modal">
	<div class="modal-header">
		<h3 id="generateBuildTitle"><%= headerType %> <%= header %></h3>
		<a class="close" href="#" id="close">&times;</a>
	</div>

	<div class="modal-body">
		<!-- Server -->
		<div class="clearfix">
			<label for="xlInput" style="color: #000000"><%= header %></label>
			<div class="input">
				<div class="app_type_float_left">
					<% if ("Server".equals(header)) { %>
						<select id="allServers" name="servers" class="xlarge">
							<%
								if(servers != null) {
									for(Server server : servers) {
							%>
										<option value="<%= server.getId() %>"> <%= server.getName() %> </option>
							<%
									}
								}
							%>
						</select>
					<% } else { %>
						<select id="allDatabases" name="databases" class="xlarge">
							<%
								if(databases != null) {
									for(Database database : databases) {
							%>
										<option value="<%= database.getId() %>"> <%= database.getName() %> </option>
							<%
									}
								}
							%>
						</select>
					<% } %>
				</div>
			</div>
		</div>
		
		<div class="clearfix" style="height: 60px;">
			<label for="xlInput" style="color: #000000"><span class="red">*</span> <s:text name="label.version"/></label>
			<div class="input">
				<div class="app_type_float_left" id="type_field">
					<% if ("Server".equals(header)) { %>
						<ul id="serverVersion" class="open_attr_version_select">
						 	
						</ul>
					<% } else { %> 
						<ul id="databaseVersion" class="open_attr_version_select">
							
						</ul>
					<% } %>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal-footer">
		<input type="hidden" id="selectedVersions" value="<%= selectedVersions %>">
		<input type="hidden" id="projInfoDbVersions" value="<%= projInfoDbVersions %>">
		
		<div class="action popup-action">
			<div id="errMsg"></div>
			<input type="button" class="btn primary" value="<s:text name="label.cancel"/>" id="cancel">
			<input type="button" class="btn primary" value="<s:text name="label.add"/>" id="add">
		</div>
	</div>
</div>

</form>

<script type="text/javascript">
$(document).ready(function() {
	
	if(!isiPad()){
		/* JQuery scroll bar */
		$("#type_field").scrollbars();
	}
	
	var typeRemoveFlag;
	
	/** To remove the already added options from the select box **/
	/** For add **/
	<% if(listSelectedServerIds != null && StringUtils.isEmpty(from)) {
			for(Integer listSelectedServerId : listSelectedServerIds) {
	%>
				$("#allServers option[value='<%= listSelectedServerId %>']").remove();
	<% 		
			}
		}
	%>
	
	/** For edit **/
	<% if(listSelectedServerIds != null && StringUtils.isNotEmpty(from)) { %>
			<% for(Server server : servers) {
					for(Integer listSelectedServerId : listSelectedServerIds) {
						if(server.getId() != listSelectedServerId) {
			%>
							$("#allServers option[value='<%= server.getId() %>']").remove();
			<%	
						}
					}
			%>
	<% 		
			}
		}
	%>
	
	/** For add **/
	<% if(listSelectedDatabaseIds != null && StringUtils.isEmpty(from)) {
			for(Integer listSelectedDatabaseId : listSelectedDatabaseIds) {
	%>
				$("#allDatabases option[value='<%= listSelectedDatabaseId %>']").remove();
	<% 		
			}
		}
	%>

	/** For edit **/
	<% if(listSelectedDatabaseIds != null && StringUtils.isNotEmpty(from)) { %>
		<% for(Database database : databases) {
				for(Integer listSelectedDatabaseId : listSelectedDatabaseIds) {
					if(database.getId() != listSelectedDatabaseId) {
		%>
						$("#allDatabases option[value='<%= database.getId() %>']").remove();
		<%	
					}
				}
		%>
	<% 		
		}
	}
	%>
	
	/** To get the versions of the default option **/
	var serverSelectBox = $("#allServers").val();
	var databaseSelectBox = $("#allDatabases").val();
	if(serverSelectBox != undefined || serverSelectBox == "") {
		getAllVersions("Server", serverSelectBox);
	} else if(databaseSelectBox != undefined || serverSelectBox == "") {
		getAllVersions("Database", databaseSelectBox);
	}
	
	/** To get the versions of the selected server **/
	$("#allServers").change(function() {
		var selectedServerId = $("#allServers").val();
		getAllVersions("Server", selectedServerId);
	});
	
	/** To get the versions of the selected database **/
	$("#allDatabases").change(function() {
		var selectedDbId = $("#allDatabases").val();
		getAllVersions("Database", selectedDbId);
	});
	
	$('form').submit(function() {
		if (typeRemoveFlag) {
			continueAdd();
		}
		return false;
    });
	
	/** For add and edit **/
	$("#add").click(function() {
		var serverVersion = $('input[name=serverVersion]:checkbox:checked').val();
		var databaseVersion = new Array();
		$('input[name=databaseVersion]:checkbox:checked').each(function(index) {
			databaseVersion.push($(this).val());
		});
		if(serverVersion == undefined && databaseVersion == "") {
			$("#errMsg").html("Select version");
			return false;
		} else {
			if(<%= from.equals("edit") && header.equals("Database") && StringUtils.isNotEmpty(fromPage) %>) {
				var available = true;
				var projInfoDbVersions = $("#projInfoDbVersions").val();
				var arrayProjInfoDbVersions = new Array();
				arrayProjInfoDbVersions = projInfoDbVersions.split(",");
				for(var i=0; i < arrayProjInfoDbVersions.length; i++) {
					var availableSelectedVersion = false;
					for (var j=0; j < databaseVersion.length; j++) {
						if (jQuery.trim(databaseVersion[j]) == jQuery.trim(arrayProjInfoDbVersions[i])) {
							availableSelectedVersion = true;
							break;
						}
					}
					if (!availableSelectedVersion) {
						available = false;
						break;
					}
				}
				
				if (available) {
					continueAdd();
				} else {
					$('.popup_div').hide();
					$("#confirmationText").html("Corressponding database SQL files will also be deleted. Do you like to continue ?");
					dialog('block');
				    escBlockPopup();
				    typeRemoveFlag = true;
				}
			} else {
				continueAdd();
			}
		}
	});

	$("#cancel , #close").click(function() {
		showParentPage();
	});
});

function continueAdd() {
	var selectedServers = $("#tempSelectedServer").val();
	var selectedDatabases = $("#tempSelectedDatabase").val();
	var paramName = "";
	
	if(<%= "Server".equals(header) %>) {
		paramName = $("#allServers option:selected").text();
	} else {
		paramName = $("#allDatabases option:selected").text();
	}
	
	if(<%= from.equals("edit") %>) {
		var param = "&type=" + '<%= header %>' + "&paramName=" + paramName + "&divTobeUpdated=" + '<%= divTobeUpdated %>';
	} else {
		var param = "&type=" + '<%= header %>' + "&paramName=" + paramName;
	}
	
	$.ajax({
        url : "addDetails",
        type : "POST",
        data : $('#appinfoAttr').serialize() + param,
        success : function(data) {
			var	eleAttr = (data.selectedParamName).replace(/\s+/g, '');
			showParentPage();
        	var type = '<%= header %>';
        	if(<%= from.equals("edit") %>) {
        		$("." + data.divTobeUpdated).html(data.selectedParamName + " [ " + data.selectedVersions + " ] ");
        		$("." + eleAttr).prop("id", data.selectedVersions);
        	} else {
            	if(data.selectedAttrType == "Server") {
            		$("#Server").css("margin-left", "320px");
            		$("#tempSelectedServer").val(selectedServers + data.selectedParamName + ",");
            		$("#dispServer").append('<div id="'+eleAttr+'" style="background-color: #bbbbbb; width: 40%; margin-bottom:2px; height: auto; border-radius: 6px; padding: 5px 0 0 10px; position: relative"><a name="' + type + '" class="deleteThis" href="#" id="' 
											+ eleAttr +'" style="text-decoration: none; margin-right: 10px; color: #000000; margin-left: 95%;" title="'+ data.selectedParamName +'" onclick="deleteEle(this);">&times;</a><div id="'+data.selectedVersions+'" class="'+eleAttr+'" title="'+type+'" onclick="openAttrPopup(this);" style="cursor: pointer; color: #000000; height: auto; position: relative; width: 90%; line-height: 17px; margin-top: -14px; padding: 0 0 6px 1px;">' 
            								+ data.selectedParamName + " [ " + data.selectedVersions + " ] " + '</div></div>');
            	} else {
            		$("#Database").css("margin-left", "320px");
            		$("#tempSelectedDatabase").val(selectedDatabases + data.selectedParamName + ",");
            		$("#dispDatabase").append('<div id="'+eleAttr+'" style="background-color: #bbbbbb; width: 40%; margin-bottom:2px; height: auto; border-radius: 6px; padding: 5px 0 0 10px; position: relative"><a name="' + type + '" class="deleteThis" href="#" id="' 
											+ eleAttr +'" style="text-decoration: none; margin-right: 10px; color: #000000; margin-left: 95%;" title="'+ data.selectedParamName +'" onclick="deleteEle(this);">&times;</a><div id="'+data.selectedVersions+'" class="'+eleAttr+'" title="'+type+'" onclick="openAttrPopup(this);" style="cursor: pointer; color: #000000; height: auto; position: relative; width: 90%;  line-height: 17px; margin-top: -14px; padding: 0 0 6px 1px;">' 
											+ data.selectedParamName + " [ " + data.selectedVersions + " ] " + '</div></div>');
            	}
        	}
        	updateHiddenFields(type, data.selectedParamName, data.selectedVersions, '<%= from %>');
        }
    }); 
}

function makeVersionsSelected() {
	<% if(listSelectedVersions != null && CollectionUtils.isNotEmpty(listSelectedVersions)) { %>
			$("input[name='serverVersion']").each(function() {
				<% 
					for (String listSelectedVersion : listSelectedVersions) { 
				%>
						if ($(this).val() == '<%= listSelectedVersion %>') {
							$(this).attr("checked", "checked");	
						}
				<% 
					}
				%>
			});
			
			$("input[name='databaseVersion']").each(function() {
				<%
					for (String listSelectedVersion : listSelectedVersions) { 
				%>
						if ($(this).val() == '<%= listSelectedVersion %>') {
							$(this).attr("checked", "checked");						
						}
				<% 
					}
				%>
			});
	<% 
		}
	%>
}
</script>