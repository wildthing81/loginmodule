/**
 * 
 */
package com.rest;

import java.security.Principal;
import java.util.Iterator;
import java.util.Set;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.authentication.PageLoginCallBackHandler;

/**
 * @author asus
 *
 */
@Path("/")
public class RESTLogin {


	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("login")
	public String login(@FormParam("username")String username
							,@FormParam("password")String password) throws LoginException
	
	{
		System.out.println("RESTLogin "+password);
		PageLoginCallBackHandler cbHandler=new PageLoginCallBackHandler(username,password);
		LoginContext context=new LoginContext("TEST", cbHandler);
		context.login();
		
		Set<Principal> principalSet =context.getSubject().getPrincipals();
		StringBuilder sb=new StringBuilder();
		
		for(Principal p:principalSet)
			sb.append(p.getName()).append(':');
		
		return sb.toString();
	
	}
}
