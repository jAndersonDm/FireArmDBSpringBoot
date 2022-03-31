/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${3/22/2022}
 */

package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.gunInfo;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public gunInfo info() {
		gunInfo bean = new gunInfo();
		return bean;
	}
}
