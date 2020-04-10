package com.cdek.callcenter.dao;

import java.util.List;

import com.cdek.callcenter.entity.Delivery;

public interface DeliveryDAO {
	
    public void save(Delivery delivery);

    public List<Delivery> findAll();
}