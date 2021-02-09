#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.web.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class WelcomeController {
	public String getWelcomeMessage() {
		return "Welcome to Java EE 8 (Tomee 8.0.9)";
	}
}
