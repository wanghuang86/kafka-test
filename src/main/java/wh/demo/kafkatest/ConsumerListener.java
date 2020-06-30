package wh.demo.kafkatest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Frank
 * @Date: 2020/6/30 20:33
 */
@Slf4j
@Component
public class ConsumerListener {

    @KafkaListener(id = "foo", topics = "kafka-boot")
    public void listen1(String foo) {
        log.info("message content [{}]", foo);
    }
}
