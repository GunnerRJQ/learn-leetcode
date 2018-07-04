package com.rjq.problem.p201_250.p225;

import java.util.LinkedList;
import java.util.List;

public class MyStack {

    private List<Integer> container;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        container = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        container.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return container.remove(container.size() - 1);
    }

    /**
     * Get the top element.
     */
    public int top() {
        return container.get(container.size() - 1);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return container.isEmpty();
    }
}