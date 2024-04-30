package org.example;

import java.util.ArrayList;


public class CustomStack {

    private ArrayList<Integer> stack;

    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        return stack.removeLast();
    }

    public int peek() {
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }

    public void insertElementAt(int element, int index) {
        if (index < 0 || index > stack.size()) {
            System.out.println("Invalid index");
        } else {
            stack.add(index, element);
        }
    }

    public void removeElementAt(int index) {
        if (index < 0 || index > stack.size()) {
            System.out.println("Invalid index");
        } else {
            stack.remove(index);
        }
    }

    public void updateElementAt(int element, int position) {
        if (position <= 0 || position > stack.size()) {
            System.out.println("Invalid index");
        } else {
            stack.set(position, element);
        }
    }


}
