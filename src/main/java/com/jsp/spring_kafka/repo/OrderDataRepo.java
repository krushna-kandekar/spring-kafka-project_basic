package com.jsp.spring_kafka.repo;

import com.jsp.spring_kafka.entity.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDataRepo extends JpaRepository<OrderData, String> {
}
