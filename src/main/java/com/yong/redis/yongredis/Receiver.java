package com.yong.redis.yongredis;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
@AllArgsConstructor
public class Receiver {

    private CountDownLatch latch;

    public void receiveMessage(String message) {
        log.info("Received: {}", message);
        latch.countDown();

    }

}
