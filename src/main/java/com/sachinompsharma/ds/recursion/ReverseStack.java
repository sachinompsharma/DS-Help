package com.sachinompsharma.ds.recursion;

import java.util.Stack;

public class ReverseStack {

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

        System.out.println(" Stack Elements before reverse");
        System.out.println(stack.toString());
        reverse(stack);
        System.out.println(" Stack Element after reverse");
        System.out.println(stack.toString());
    }

    public static void reverse(Stack<Integer> stack){

        if(stack.isEmpty())
            return;

        int top = stack.pop();
        reverse(stack);
        placement(stack,top);

    }

    public static void placement(Stack<Integer> stack, int top){

        if(stack.isEmpty()){
            stack.push(top);
            return;

        }

        int temp = stack.pop();
        placement(stack, top);
        stack.push(temp);
    }
}
