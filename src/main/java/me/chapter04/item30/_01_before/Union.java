package me.chapter04.item30._01_before;

import java.util.HashSet;
import java.util.Set;


// 제네릭 union 메소드와 테스트 프로그램(p.177)
public class Union {

    // 코드 30-2 제네릭 메소드(p.177)
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // 코드 30-2 제네릭 메소드를 활용하는 간단한 프로그램(p.177)
    public static void main(String[] args) {
        Set guys = Set.of("톰", "딕", "해리");
//        Set<String> stooges = Set.of("래리", "모애", "컬리");
        Set stooges = Set.of(1, 2, 3);
        Set all = union(guys, stooges);

//        for (Object o : all) {
//            System.out.println((String)o);
//
//        }
    }

}
