package com.cdek.callcenter.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdek.callcenter.entity.Delivery;
import com.cdek.callcenter.service.DeliveryService;

@RestController
@RequestMapping("/api")
public class DeliveryController {

	private DeliveryService deliveryService;
	
	@Autowired
	public DeliveryController(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@GetMapping("/delivery")
	public List<Delivery> findAll() {
		return deliveryService.findAll();
	}
	
	@PostMapping("/delivery")
	public Delivery addDelivery(@RequestBody Delivery delivery) {

		delivery.setId(0);

		deliveryService.save(delivery);

		return delivery;
	}
}