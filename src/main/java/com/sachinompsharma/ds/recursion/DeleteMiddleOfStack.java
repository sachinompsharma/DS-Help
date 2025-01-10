package com.sachinompsharma.ds.recursion;

import java.util.Stack;

public class DeleteMiddleOfStack {
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

        System.out.println(" Stack Elements before deletion");
        System.out.println(stack.toString());
        int middle = stack.size() / 2 + 1;
        delete(stack, middle);
        System.out.println(" Stack Element after sorting");
        System.out.println(stack.toString());
    }
    public static void delete(Stack<Integer> stack , int middle){

        if (middle  ==  1){
            stack.pop();
            return;
        }


        int top = stack.pop();
        delete(stack, middle - 1);
        stack.push(top);
    }

}