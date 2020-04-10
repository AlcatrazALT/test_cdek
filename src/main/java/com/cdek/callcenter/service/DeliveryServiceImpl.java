package com.cdek.callcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdek.callcenter.dao.DeliveryDAO;
import com.cdek.callcenter.entity.Delivery;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	
	private DeliveryDAO deliveryDAO;

	@Autowired
	public DeliveryServiceImpl(DeliveryDAO deliveryDAO) {
		this.deliveryDAO = deliveryDAO;
	}

	@Override
	@Transactional
	public void save(Delivery delivery) {
		deliveryDAO.save(delivery);
	}

	@Override
	@Transactional
	public List<Delivery> findAll() {
		return deliveryDAO.findAll();
	}
}