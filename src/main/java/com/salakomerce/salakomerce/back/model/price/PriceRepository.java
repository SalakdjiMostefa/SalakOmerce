package com.salakomerce.salakomerce.back.model.price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PriceRepository extends JpaRepository<Price, Integer> {
    List<Price> getPricesByProduct_Id(int idProduct);
}
