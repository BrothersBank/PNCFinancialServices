/**
 * 
 */
package com.pncfinancialservices.beans;

import java.io.Serializable;
import java.util.Map;


/**
 * @author Admin
 *
 */
public class WorkingHours implements Serializable {

	private Integer workingHourId;
	private Map<String,String> openingHour;  
	private Map<String,String> closingHour;
	/**
	 * @return the workingHourId
	 */
	public Integer getWorkingHourId() {
		return workingHourId;
	}
	/**
	 * @param workingHourId the workingHourId to set
	 */
	public void setWorkingHourId(Integer workingHourId) {
		this.workingHourId = workingHourId;
	}
	/**
	 * @return the openingHour
	 */
	public Map<String, String> getOpeningHour() {
		return openingHour;
	}
	/**
	 * @param openingHour the openingHour to set
	 */
	public void setOpeningHour(Map<String, String> openingHour) {
		this.openingHour = openingHour;
	}
	/**
	 * @return the closingHour
	 */
	public Map<String, String> getClosingHour() {
		return closingHour;
	}
	/**
	 * @param closingHour the closingHour to set
	 */
	public void setClosingHour(Map<String, String> closingHour) {
		this.closingHour = closingHour;
	}
	
	
	
}
