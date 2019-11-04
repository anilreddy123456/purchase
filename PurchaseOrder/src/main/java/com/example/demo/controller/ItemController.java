package com.example.demo.controller;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PLineItem;
import com.example.demo.service.LineItemService;




@RequestMapping("/item")
@RestController
public class ItemController {

	@Autowired
	private LineItemService itemService;
	
	@POST
	@Path("saveItem")
	public PLineItem createItem(PLineItem item) {
		return itemService.saveItem(item);
		
	}
	
	@PUT
	@Path("updateItem")
	public PLineItem udate(PLineItem item) {
		return itemService.udateItem(item);
		
	}
}
