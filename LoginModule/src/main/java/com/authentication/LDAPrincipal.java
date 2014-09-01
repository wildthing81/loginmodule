/**
 * 
 */
package com.authentication;

import java.security.Principal;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author asus
 *
 */
@XmlRootElement
public class LDAPrincipal implements Principal {

	/* (non-Javadoc)
	 * @see java.security.Principal#getName()
	 */
	@Override
	@XmlElement
	public String getName() {
		
		return "TestPrincipal";
	}

}
