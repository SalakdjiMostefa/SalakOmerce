package com.salakomerce.salakomerce.back.model.modepayment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ModePaymentRepository extends JpaRepository<ModePayment, Integer> {
}
