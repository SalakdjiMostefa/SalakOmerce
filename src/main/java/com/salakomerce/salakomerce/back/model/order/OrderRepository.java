package com.salakomerce.salakomerce.back.model.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface OrderRepository extends JpaRepository<OrderR, Integer> {
}
