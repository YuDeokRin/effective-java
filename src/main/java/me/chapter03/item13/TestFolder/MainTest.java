package me.chapter03.item13.TestFolder;

class Rabbit implements Cloneable{
    String name;

    Rabbit(String name){
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MainTest{
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("흰토끼");
        try {
            Rabbit rabbit1Copy = (Rabbit) rabbit1.clone();
            System.out.println(rabbit1Copy);
            System.out.println(rabbit1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}