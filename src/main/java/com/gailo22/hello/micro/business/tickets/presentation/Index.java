package com.gailo22.hello.micro.business.tickets.presentation;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.gailo22.hello.micro.business.tickets.boundary.TicketBroker;

@Model
public class Index {
	
	@Inject
	private TicketBroker tb;
	
	public String getMessage() {
		return "Hello";
	}

}
