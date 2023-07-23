package com.posgraduacao.deliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.posgraduacao.deliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
