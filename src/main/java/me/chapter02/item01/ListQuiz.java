package me.chapter02.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

 */
public class ListQuiz {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(100);
        numbers.add(200);
        numbers.add(43);
        numbers.add(3);

        System.out.println(numbers); //[100, 200, 43, 3]

        Comparator<Integer> desc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };



        // 위의 식을  람다식 변환 : Comparator<Integer> desc = (o1, o2) -> o2 - o1;
        Collections.sort(numbers, desc);
        //numbers.sort(desc); 이것대로 해도 내림차순 정렬 가능
        System.out.println(numbers);

        //질문 2) 질문1에서 만든 Comparator를 사용해서 오름차순으로 정렬하라.

        Collections.sort(numbers, desc.reversed()); // 내가 푼 답

        numbers.sort(desc.reversed()); // 썜이 푼 답
        
        System.out.println(numbers);
    }
}
