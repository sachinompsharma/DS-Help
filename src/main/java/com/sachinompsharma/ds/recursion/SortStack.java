package com.sachinompsharma.ds.recursion;

import java.net.SocketOption;
import java.util.Stack;

public class SortStack {
    public static void main(String []args){
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(0);
        stack.push(7);
        stack.push(9);
        stack.push(6);
        stack.push(5);
        stack.push(3);
        stack.push(2);

        System.out.println(" Stack Element before sorting");
        System.out.println(stack.toString());
        sort(stack);
        System.out.println(" Stack Element after sorting");
        System.out.println(stack.toString());
    }
    public static void sort(Stack<Integer> stack){

        if (stack.isEmpty())
            return;

        int top = stack.pop();
        sort(stack);
        insert(stack,top);
    }

    public static void insert(Stack<Integer> stack, int top){
        if( stack.isEmpty() || stack.peek() <= top){
            stack.push(top);
            return;
        }

        int temp = stack.pop();
        insert(stack,top);
        stack.push(temp);
    }
}
