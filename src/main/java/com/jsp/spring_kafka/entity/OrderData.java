package com.jsp.spring_kafka.entity;

import com.google.gson.Gson;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;


@Getter
@Setter

//@Service
//@RequiredArgsConstructor
//@Component
@Entity
public class OrderData {

    @Id
    @NotBlank
    private String orderID;

    private String addressLine;

    private String city;

    private String state;

    private String pincode;

    private String country;

    private Timestamp createdTimestamp;

    private Double  latitude;

    private Double longitude;


    public String toJson() {
        return new Gson().toJson(this);
    }
//    public void setCreatedTimestamp(Instant now) {
//
//    }
}
