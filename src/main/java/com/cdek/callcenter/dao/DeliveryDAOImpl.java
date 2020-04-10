package com.cdek.callcenter.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdek.callcenter.entity.Delivery;

@Repository
public class DeliveryDAOImpl implements DeliveryDAO {

	private EntityManager entityManager;

	@Autowired
	public DeliveryDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void save(Delivery delivery) {

		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(delivery);
	}

	@Override
	public List<Delivery> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);

				
		Query<Delivery> query = currentSession.createQuery("select delivery"
				+ " from Delivery delivery"
				+ " where (delivery.date between '2000-01-01' and '2005-01-01')"
				+ " and (delivery.status = false) and (delivery.time is not null)", Delivery.class);

		List<Delivery> deliveries = query.getResultList();

		return deliveries;
	}
}