package com.rjq.problem.p201_250.p232;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {

    private List<Integer> container;

    /** Initialize your data structure here. */
    public MyQueue() {
        container = new LinkedList<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        container.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return container.remove(0);
    }

    /** Get the front element. */
    public int peek() {
        return container.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return container.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */