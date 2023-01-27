package me.chapter04.item29;

import me.chapter03.item13.EmptyStackException;
import me.chapter03.item13.Stack;

import java.util.Arrays;
import java.util.List;

public class Generic_Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITINT_CAPINT = 16;


    //코드 29-3 배열을 사용한 코드를 제네릭으로 만드는 방법 1(172쪽)
    // 배열 elements는 push(E)로 넘어온 E 인스턴스만 담는다.
    // 따라서 타입 안전성을 보장하지만,
    // 이 배열의 런타임 타입은 E[]가 아닌 Object[]다.
    @SuppressWarnings("unchecked")
    public Generic_Stack() {
        elements = (E[]) new Object[DEFAULT_INITINT_CAPINT];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if(size == 0)
            throw new EmptyStackException();

        E result = elements[--size];
        elements[size] = null;
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
        Generic_Stack<String> stack = new Generic_Stack<>();
        for (String arg : List.of("a", "b", "c"))
            stack.push(arg);
        while(!stack.isEmpty())
            System.out.println((stack.pop()).toUpperCase());
    }
}
