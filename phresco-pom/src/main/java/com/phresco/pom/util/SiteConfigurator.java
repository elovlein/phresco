package com.phresco.pom.util;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import com.phresco.pom.model.ReportPlugin;
import com.phresco.pom.site.Reports;

/**
 * @author suresh_ma
 *
 */
public class SiteConfigurator {

	/**
	 * @param constants
	 */
	public void addReportPlugin(Reports constants,File file) {
		try {
			PomProcessor processor = new PomProcessor(file);
			ReportPlugin reportPlugin = new ReportPlugin();
			reportPlugin.setGroupId(constants.getGroupId());
			reportPlugin.setArtifactId(constants.getArtifactId());
			reportPlugin.setVersion(constants.getVersion());
			processor.siteConfig(reportPlugin);
			processor.save();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param constants
	 */
	public void addReportPlugin(Reports[] constants,File file){
		for (Reports Reports : constants) {
			addReportPlugin(Reports,file);
		}
	}
	
	/**
	 * @param constants
	 */
	public void removeReportPlugin(Reports[] constants,File file){
		
		try {
			PomProcessor processor = new PomProcessor(file);
			for (Reports Reports : constants) {
				String groupId = Reports.getGroupId();
				String artifactId = Reports.getArtifactId();
				processor.removeSitePlugin(groupId,artifactId);
				processor.save();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
