package controllers;

import java.util.Date;
import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.inject.Inject;

import dtos.MessageResponseDto;
import infrastructure.IConfiguration;
import infrastructure.Services.ILoggingService;


@Path("/message")
public class MessageController {

		private IConfiguration _configuration;
	private ILoggingService _loggingService;

	@Inject
	public MessageController(IConfiguration configuration, ILoggingService loggingService) {
		_configuration=configuration;
		_loggingService=loggingService;
		loggingService.setClass(MessageController.class);
	}

	@GET
	@Path("getlast")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLastMessage() throws Throwable {
		return "test";
	}

	@GET
	@Path("send")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sendMessage() throws Throwable {

		_loggingService.info("sending message");
		Properties topologyConfig = _configuration.getProperties();
		String topicName = topologyConfig.getProperty("test.name");
		String message = topicName + "test message at " + new Date();
		_loggingService.info(message);
		return Response.ok(new MessageResponseDto("success", new Date()), MediaType.APPLICATION_JSON).build();
	}


}
