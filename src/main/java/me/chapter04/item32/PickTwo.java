package me.chapter04.item32;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class PickTwo {

    //코드 32-2 자신의 제네릭 매개변수 배열의 참조를 노출한다. -안전하지 않다(p.193)
    static <T> T[] toArray(T... args) {
        return args; //제네릭 배열을 return args-> 노출된다.
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0 : return toArray(a, b); // 여기서 toArray를 쓸 때, 컴파일러는 toArray의 리턴 타입을 Object[]로 판단한다.
            case 1 : return toArray(a, b);
            case 2 : return toArray(a, b);
        }
        throw new AssertionError(); // 도달할 수 없다.
    }

    public static void main(String[] args) {
        String[] attributes = pickTwo("좋은", "빠른", "저렴한"); // 타입 캐스팅 코드
        System.out.println(Arrays.toString(attributes));

    }
}
