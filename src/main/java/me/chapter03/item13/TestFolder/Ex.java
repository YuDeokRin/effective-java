package me.chapter03.item13.TestFolder;

import java.util.Arrays;

public class Ex {
    private int[] data;
    // makes a shallow copy of values
    public Ex(int[] values) {
        data = values;
    }
    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}