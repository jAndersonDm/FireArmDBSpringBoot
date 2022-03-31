/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${3/28/2022}
 */
package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class guns {

	private String company;
	private String type;
	
	
	
	public guns() {
		super();
	}
	public guns(String company, String type) {
		super();
		this.setCompany(company);
		this.setType(type);
		
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String gunDetails() {
		return "Company: " + this.company + ", Type: " + this.type;
	}
}
