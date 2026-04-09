package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.queue.Queue;

class AppTest {

    @Test
    void queueEnqueue() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
    }

    @Test
    void queueIsEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }
}