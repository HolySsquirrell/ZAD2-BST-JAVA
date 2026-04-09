package com.example;

import com.example.bst.Binary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void shouldInsertAndTraverseBFS() {
        Binary tree = new Binary();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);

        assertEquals(List.of(5, 3, 7), tree.bfs());
    }

    @Test
    void shouldDeleteNode() {
        Binary tree = new Binary();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);

        tree.delete(3);

        assertEquals(List.of(5, 7), tree.bfs());
    }
}