package com.example.demo.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PHeader;
import com.example.demo.service.HeaderService;

@RequestMapping("/head")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@RestController
public class HeadController {

	@Autowired
	private HeaderService headerService;

	@POST
	@Path("save")
	public PHeader create(PHeader head) {
		return headerService.saveHeader(head);

	}

	@PUT()
	@Path("update")
	public PHeader update(PHeader head) {
		return headerService.updateHeader(head);

	}

}