package me.chapter04.item29;

import me.chapter03.item13.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Origin_Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITINT_CAPINT = 16;

    public Origin_Stack() {
        elements = new Object[DEFAULT_INITINT_CAPINT];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity(){
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        Origin_Stack stack = new Origin_Stack();
        for (String arg : List.of("a", "b", "c"))
            stack.push(arg);
        while(!stack.isEmpty())
            System.out.println(((String)stack.pop()).toUpperCase());

    }
}
