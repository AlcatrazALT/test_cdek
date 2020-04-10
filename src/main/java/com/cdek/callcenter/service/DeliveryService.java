package com.cdek.callcenter.service;

import java.util.List;

import com.cdek.callcenter.entity.Delivery;

public interface DeliveryService {

	public void save(Delivery delivery);

	public List<Delivery> findAll();
}