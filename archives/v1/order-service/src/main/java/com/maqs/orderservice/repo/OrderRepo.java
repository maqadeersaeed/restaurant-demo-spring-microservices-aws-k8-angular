package com.maqs.orderservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maqs.orderservice.entity.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer>{
 }

