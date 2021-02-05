/**
 * 
 */
package com.nareshit.medilab;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * @author nsanda
 *
 */
@Component
@Endpoint(id="medilab-actuator",enableByDefault=true)
public class MedilabActuator {

	String message = "medilab-actuator customization";
	
	@ReadOperation
	public String viewMedilab() {
		return message;
	}
	
}
