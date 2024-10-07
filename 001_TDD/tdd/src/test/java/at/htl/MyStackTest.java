package at.htl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void givenNewStack_thenStackIsEmpty() {

        var myStack = new MyStack();
        assertTrue(myStack.isEmpty());

    }
}