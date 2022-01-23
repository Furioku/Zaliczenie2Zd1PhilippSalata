package com.philippsalata.Stosator;

import java.util.Stack;

public class Stos<S> implements Stosator {
    private Stack<Integer> stack = new Stack<> ();

    private int min;

    @Override
    public void push(int val) {
        if (stack.empty())
        {
            stack.push(val);
            min = val;
        }
        else if (val > min) {
            stack.push(val);
        }
        else {
            stack.push(2*val - min);
            min = val;
        }
    }

    @Override
    public void pop() {
        if (stack.empty()) {
            System.out.println("Stack is empty");
            System.exit(-1);
        }

        int top = stack.peek();
        if (top < min) {
            min = 2*min - top;
        }
        stack.pop();
    }

    @Override
    public void size() {
        System.out.println ("Stos size = " + stack.size ());
    }
}
