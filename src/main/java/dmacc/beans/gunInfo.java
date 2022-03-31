/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${3/28/2022}
 */
package dmacc.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class gunInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String company;
	private String type;
	private String ammo;
	
}
