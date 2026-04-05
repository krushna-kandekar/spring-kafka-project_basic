package com.jsp.spring_kafka.controller;

import com.jsp.spring_kafka.entity.OrderData;
import com.jsp.spring_kafka.service.OrderDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class OrderDataContoller {

    @Autowired
    private OrderDataService service;

    @PostMapping("/order")
    public OrderData save(@RequestBody OrderData data) {
        return service.save(data);
    }
}
