package com.salakomerce.salakomerce.back.model.discount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface DiscountRepository extends JpaRepository<Discount, Integer> {

    List<Discount> findAllByPrice_Id(int idPrice);
}
