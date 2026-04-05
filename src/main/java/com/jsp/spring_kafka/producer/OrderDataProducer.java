package com.jsp.spring_kafka.producer;

import com.jsp.spring_kafka.entity.OrderData;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderDataProducer {

    private final KafkaTemplate<String, String> kafkaOrderDataProducerTemplate;
    private final String topic = "OrderDataTopic";

    public OrderDataProducer(KafkaTemplate<String, String> kafkaOrderDataProducerTemplate) {
        this.kafkaOrderDataProducerTemplate = kafkaOrderDataProducerTemplate;
    }

    public void sentMessage(OrderData orderData){
        kafkaOrderDataProducerTemplate.send(topic,orderData.toJson());
    }
}
