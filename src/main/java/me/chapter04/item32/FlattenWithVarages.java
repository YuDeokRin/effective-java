package me.chapter04.item32;

import java.util.ArrayList;
import java.util.List;


// 코드 32-3 제네릭 varargs 매개변수를 안전하게 사용하는 메소드(p.195)
public class FlattenWithVarages {

    @SafeVarargs // 가변인자는 안전하게 사용되고 잇다는 것을 컴파일에게 알려준다.
    //@SuppressWarnings("unchecked") // -> 이걸 쓰면 문제는 메소드 전체(모든 코드)가 SuppresWarnings이 되기 때문이다. 범위가 넓음
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;

    }
    public static void main(String[] args) {
        List<Integer> flatList = flatten(List.of(1, 2), List.of(3, 4, 5), List.of(6, 7));
        System.out.println(flatList);

    }
}
