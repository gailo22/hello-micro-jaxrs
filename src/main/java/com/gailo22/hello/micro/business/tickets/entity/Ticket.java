package com.gailo22.hello.micro.business.tickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {
	
	@Id
    @GeneratedValue
    private long id;
	private int amount;
	
	public Ticket() {
	}
	
	public Ticket(long id, int amount) {
		this.id = id;
		this.amount = amount;
	}

}
