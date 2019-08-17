package br.com.ninq.delivery.order.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.ninq.delivery.order.model.Pedido;

public interface OrderRepository extends CrudRepository<Pedido, Integer> {
}