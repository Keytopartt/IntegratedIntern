package com.internalweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internalweb.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
