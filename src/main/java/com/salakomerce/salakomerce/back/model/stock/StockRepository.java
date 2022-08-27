package com.salakomerce.salakomerce.back.model.stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    Stock getStockByProduct_Id(int idProduct);
}
