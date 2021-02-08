/**
 * 
 */
package com.cg.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.model.Order;
import com.cg.main.service.IOrderService;

/**
 * @author Apala Das
 *
 */

@RestController
@RequestMapping("/nursery")
public class OrderController {
	@Autowired
	IOrderService service;
	
	@PostMapping("/addOrder")
	public Order addOrder(@Valid @RequestBody Order order) {
		return service.addOrder(order);
		
	}
	
	@PutMapping("/updateOrder")
	public ResponseEntity<Order> updatePlanter(@RequestBody Order order ){
		Order o=service.updateOrder(order);
		return new ResponseEntity<>(o,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public ResponseEntity<List<Order>> deleteOrder(@PathVariable("id") int id){
		List<Order> list=service.deleteOrder(id);
		return new ResponseEntity<>(list,HttpStatus.OK );
	}
	
	@GetMapping("/viewOrder/{orderId}")
	public ResponseEntity<Order> viewOrder(@PathVariable("orderId") int orderId){
		Order o=service.viewOrder(orderId);
		return new  ResponseEntity<>(o,HttpStatus.OK);
	}
	
	@GetMapping("/viewAllOrders")
	public ResponseEntity<List<Order>> viewAllOrders(){
		List<Order> list = service.viewAllOrders();
		return new  ResponseEntity<> (list,HttpStatus.OK);
	}
	
}
