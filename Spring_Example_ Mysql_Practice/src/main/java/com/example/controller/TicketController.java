package com.example.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	
	private TicketController service;

	@PostMapping("/bookTickets")
	
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return service.createTicket(ticket);
	}
	//get a ticket
	@GetMapping("/ticket/{ticketId}")
	public Optional<Ticket>getTicket(@PathVariable("amount")Integer id) {
		
		return service.getTicket(id);
	}
//	
	//Delete a ticket
	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("amount")Integer id) {
		service.deleteTicket(id);
	}
	//update a ticket 
	@PutMapping("/ticket/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("amount") Integer ticketId,@PathVariable("catagory")String catagory) {
		return service.updateTicket(ticketId,catagory);
	}
	

}
