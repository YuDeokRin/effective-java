package me.chapter04.item32;

import java.util.ArrayList;
import java.util.List;

//안좋게 쓰인 예시

// 제네릭 varargs 배열 매개변수에 값을 저장하는 것은 안전하지 않다.(p191 ~ 192)
public class Dangerous {
    static void dangerous(List<String>... stringLists){
        // 코드 32-1 제네릭과 varargs를 혼용하면 타입 안전성이 깨진다.(p191 ~ 192)

        List<Integer> intList = List.of(42); //오염이 생기는 이유 ?
        Object[] objects = stringLists; // List<String>의 배열을 Object[]에 할당  -> 배열은 공변이니깐.
        objects[0] = intList; // 힙 오염 발생 -> Object[] 이기 때문에 intList를 할당 -> 오염된다.
        String s = stringLists[0].get(0);  // ClassCastException -> 이 코드를 컴파일할 때 문자열로 캐스팅한 코드를 넣어준다. 왜? 제네릭 타입을 String으로 알고 있으니깐
    }

    public static void main(String[] args) {
        dangerous(List.of("There be drangous!"));
    }

}
