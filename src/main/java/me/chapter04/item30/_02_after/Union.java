package me.chapter04.item30._02_after;

import java.util.HashSet;
import java.util.Set;

public class Union {

    // 코드 30-2 제네릭 메소드(p.177)
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // 코드 30-2 제네릭 메소드를 활용하는 간단한 프로그램(p.177)
    public static void main(String[] args) {
        Set<String> guys = Set.of("톰", "딕", "해리");
        Set<String> stooges = Set.of("래리", "모애", "컬리");
//        Set stooges = Set.of(1, 2, 3);
        Set all = union(guys, stooges);

        for (Object o : all) {
            System.out.println(o); //타입케스팅 없이 출력할 수 있다.
        }
    }
}