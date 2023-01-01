package me.chapter03.item13.TestFolder;

public class DeepTest2 implements Cloneable {
    int a;
    int b;

    DeepTest c = new DeepTest();

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
