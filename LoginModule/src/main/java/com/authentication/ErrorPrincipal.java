package com.authentication;

import java.security.Principal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorPrincipal implements Principal {

	@Override
	@XmlElement
	public String getName() {
		// TODO Auto-generated method stub
		return "UserName or Password is Incorrect";
	}


}
