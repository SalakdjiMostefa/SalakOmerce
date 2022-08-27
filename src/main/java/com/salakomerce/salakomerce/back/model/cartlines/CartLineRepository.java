package com.salakomerce.salakomerce.back.model.cartlines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CartLineRepository extends JpaRepository<CartLine, Integer> {
}
