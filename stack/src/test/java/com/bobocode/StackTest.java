package com.bobocode;

import org.junit.jupiter.api.BeforeEach;

public class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new LinkedStack<>();
    }

}
