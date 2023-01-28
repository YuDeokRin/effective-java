package me.chapter04.item26;

import java.util.ArrayList;

// java는 raw타입을 왜 허용할까?
//        List numbers = new ArrayList(); // 로타입으로 할 경우 Obejct 타입으로 된다.
//        numbers.add(10);
//        numbers.add("Dante");
public class GenericBasic2 {

    public static void main(String[] args) {

        // Generic 사용 전
//        List numbers = new ArrayList(); // 로타입으로 할 경우 Obejct 타입으로 된다.
//        numbers.add(10);
//        numbers.add("Dante");
//
//        for (Object number : numbers) {
//            System.out.println((Integer)number); // Object 타입에서 꺼낼 때 형변환을 해준다.
//        }

        //Generic 사용 후
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
//        numbers.add("Dante");

        for (Integer number : numbers) {
            System.out.println(number); // 꺼낼때 형변환을 하지 않아도 된다.(Integer)
        }


    }
}
