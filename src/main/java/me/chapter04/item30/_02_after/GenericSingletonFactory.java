package me.chapter04.item30._02_after;

import java.util.function.Function;
import java.util.function.UnaryOperator;

//제네릭 싱글턴 팩토리 패턴(p.178)
public class GenericSingletonFactory {


    //코드 30-4 제네릭 싱글턴 팩터리 패턴 (p.178)
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t; // 항등함수,  IDENTITY_FN -> 싱글톤 객체


    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }


    public static void main(String[] args) {
        String[] strings = {"삼배", "대마", "나일론"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s: strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }

    }
}


