package com.jsp.spring_kafka.service;

import com.jsp.spring_kafka.entity.OrderData;
import com.jsp.spring_kafka.producer.OrderDataProducer;
import com.jsp.spring_kafka.repo.OrderDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OederDataServiceImpl implements OrderDataService{

    @Autowired
    private OrderDataRepo repo;

    @Autowired
    private OrderDataProducer pro;

    @Override
    public OrderData save(OrderData data) {
        pro.sentMessage(data);
        return repo.save(data);
    }
}
