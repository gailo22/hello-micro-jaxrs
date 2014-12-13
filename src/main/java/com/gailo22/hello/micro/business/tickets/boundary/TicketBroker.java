package com.gailo22.hello.micro.business.tickets.boundary;

import javax.ejb.Stateless;

import com.gailo22.hello.micro.business.tickets.entity.Ticket;

@Stateless
public class TicketBroker {

	public void buy(int amount) {
		System.out.println("amount: " + amount);
	}

	public Ticket find(int id) {
		return new Ticket(id, 42);
	}
}
