package me.chapter04.item26.object;

import java.util.ArrayList;
import java.util.List;

public class Raw {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0);
    }

    private static void unsafeAdd(List list, Object o) { // List<String> list , String o
        list.add(o);
    }
}
