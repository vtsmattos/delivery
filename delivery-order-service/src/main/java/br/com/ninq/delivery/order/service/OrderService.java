package br.com.ninq.delivery.order.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.ninq.delivery.order.model.Pedido;
import br.com.ninq.delivery.order.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Pedido save(@Validated Pedido order) {
        return orderRepository.save(order);
    }

    public Pedido findById(Integer id){
        return orderRepository.findOne(id);
    }

    public Iterable<Pedido> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.delete(id);
    }
}