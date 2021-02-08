package com.cg.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.controller.OrderController;

/**
 * @author Apala Das
 *
 */
@SpringBootTest
class Sprint2OrderApplicationTests {
	
	// Autowire Controller class
	@Autowired
	private OrderController controller;
	
	@Test
	void contextLoads() {
		assertNotNull(controller);
		}



}
