package com.kksk.kumuluzee.sample.jaxrs.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("sample")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
	@Inject
	SampleEntity sampleEntity;

	@GET
	@Path("{id}")
	public Response get(@PathParam("id") String id) {
		return Response.ok(sampleEntity.get(id)).build();
	}

	@GET
	public Response getAll() {
		return Response.ok(sampleEntity.getAll()).build();
	}
}
