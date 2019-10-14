package com.ilegra.npshealth.restapi;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/laaa")
public class HealthRestAPI {
	
	private static final Logger logger = Logger.getLogger(HealthRestAPI.class.getName());
	
	@Path("/health")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response testServer() {
		try {
			return Response.status(Response.Status.OK).build();
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Error while trying to access the server",e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}
