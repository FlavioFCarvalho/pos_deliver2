package com.posgraduacao.deliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.posgraduacao.deliver.dtos.OrderDTO;
import com.posgraduacao.deliver.entities.Order;
import com.posgraduacao.deliver.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findAll();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
    
	
}
