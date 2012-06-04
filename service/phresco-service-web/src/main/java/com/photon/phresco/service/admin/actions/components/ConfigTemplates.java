package com.photon.phresco.service.admin.actions.components;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.photon.phresco.service.admin.actions.ServiceBaseAction;

public class ConfigTemplates extends ServiceBaseAction { 
	
	private static final long serialVersionUID = 6801037145464060759L;
	private static final Logger S_LOGGER = Logger.getLogger(ConfigTemplates.class);
	
	private String name = null;
	private String nameError = null;
	private String applies = null;
	private String applyError = null;
	private boolean errorFound = false;

	public String list() {
		S_LOGGER.debug("Entering Method ConfigTemplates.list()");
		return COMP_CONFIGTEMPLATE_LIST;
	}
	
	public String add() {
		S_LOGGER.debug("Entering Method ConfigTemplates.add()");
		return COMP_CONFIGTEMPLATE_ADD;
	}
	
	public String save() {
		S_LOGGER.debug("Entering Method ConfigTemplates.save()");
		if (validateForm()) {
			setErrorFound(true);
			return SUCCESS;
		}
		return  COMP_CONFIGTEMPLATE_LIST;
	}
	
	private boolean validateForm() {
		boolean isError = false;
		if (StringUtils.isEmpty(name)) {
			setNameError(getText(KEY_I18N_ERR_NAME_EMPTY ));
			isError = true;
		}
		
		if (StringUtils.isEmpty(applies)) {
			setApplyError(getText(KEY_I18N_ERR_APPLIES_EMPTY ));
			isError = true;
		}
		return isError;
	}
	
	public String cancel() {
		S_LOGGER.debug("Entering Method ConfigTemplates.cancel()");
		return COMP_CONFIGTEMPLATE_CANCEL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameError() {
		return nameError;
	}

	public void setNameError(String nameError) {
		this.nameError = nameError;
	}

	public String getApplies() {
		return applies;
	}

	public void setApplies(String applies) {
		this.applies = applies;
	}

	public String getApplyError() {
		return applyError;
	}

	public void setApplyError(String applyError) {
		this.applyError = applyError;
	}

	public boolean isErrorFound() {
		return errorFound;
	}

	public void setErrorFound(boolean errorFound) {
		this.errorFound = errorFound;
	}
	
}
