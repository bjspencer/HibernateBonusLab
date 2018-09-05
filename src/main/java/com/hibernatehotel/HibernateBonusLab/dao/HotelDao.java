package com.hibernatehotel.HibernateBonusLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernatehotel.HibernateBonusLab.entity.Hotel;

@Repository
@Transactional
public class HotelDao {
	@PersistenceContext
	EntityManager eManager;
	
	public Hotel findById(Long id) {
		return eManager.find(Hotel.class, id);
	}
	
	public Hotel findByCity(String city) {
		return eManager.find(Hotel.class, city);
	}
}
