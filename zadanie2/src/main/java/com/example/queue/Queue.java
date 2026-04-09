package com.example.queue;

public class Queue<A> {
    
    private Node<A> head;
    private Node<A> tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void enqueue(A value) {
        Node<A> newNode = new Node<>(value);
        if (isEmpty()) {

            head = tail = newNode;
            
        } else{

            tail.next = newNode;
            tail = newNode;
        }
    }
    public A dequeue() {
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        
        A value = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }
        return value;
    }    
}
