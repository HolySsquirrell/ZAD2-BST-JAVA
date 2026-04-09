package com.example.bst;

import java.util.ArrayList;
import java.util.List;

import com.example.queue.Queue;

public class Binary {

    private Node root;

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.value) {
            node.left = insert(node.left, key);
        } else if (key > node.value) {
            node.right = insert(node.right, key);
        }

        return node;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node node, int key) {
        if (node == null) return null;

        if (key < node.value) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.value) {
            node.right = deleteRec(node.right, key);
        } else {
            if (node.left == null && node.right == null) return null;

            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            int min = findMinimum(node.right);
            node.value = min;
            node.right = deleteRec(node.right, min);
        }

        return node;
    }

    private int findMinimum(Node node) {
        while (node.left != null) node = node.left;
        return node.value;
    }

    public List<Integer> bfs() {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Queue<Node> queue = new Queue<>();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node current = queue.dequeue();
            result.add(current.value);

            if (current.left != null) queue.enqueue(current.left);
            if (current.right != null) queue.enqueue(current.right);
        }

        return result;
    }
}