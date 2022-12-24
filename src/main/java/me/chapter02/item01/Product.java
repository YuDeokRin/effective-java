package me.chapter02.item01;

import java.util.EnumSet;

public class Product {
    public static void main(String[] args) {
        //여러 개의 인스턴스를 만들 수 없다.  단 하나만 존재
        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();

        System.out.println(settings1); // 주소값 :@35f983a6
        System.out.println(settings2); // 주소값 : @35f983a6

        Boolean.valueOf(false); //
        EnumSet.allOf(Difficulty.class);

    }
}
