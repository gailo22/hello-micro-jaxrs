package com.gailo22.hello.micro.business.tickets.boundary;

import java.net.URI;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.gailo22.hello.micro.business.tickets.entity.Ticket;

@Stateless
@Path("tickets")
public class TicketResource {
	
	@Inject
	private TicketBroker tb;
	
	@GET
	@Path("{id}-{name}")
	public Ticket find(@PathParam("id") int id, @PathParam("name") String name) {
		return tb.find(id);
	}
	
	@POST
	public Response save(JsonObject json, @Context UriInfo info) {
		URI uri = info.getAbsolutePathBuilder().build("/42");
		return Response.created(uri).build();
	}

}
