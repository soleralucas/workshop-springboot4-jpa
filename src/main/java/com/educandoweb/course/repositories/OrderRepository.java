package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Order;


@Repository //não e necessario pq a classe herda da interface
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
	
	
	
	

}
