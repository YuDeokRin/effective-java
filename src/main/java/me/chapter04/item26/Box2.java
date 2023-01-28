package me.chapter04.item26;

public class Box2<E> {
    private E item;

    private void add(E e) {
        this.item = e;
    }

    private E get(){
        return this.item;
    }

    public static void main(String[] args) {
        Box2<Integer> box= new Box2<>(); //Box<Integer> 실제 타입 매개변수화 타입 -> < >
                                       // raw타입 -> Box box = new box(); -> 사용하지 말것 
        box.add(10);
        System.out.println(box.get() * 100);


        printBox(box);
    }

    private static void printBox(Box2<?> box) { // Box<? extneds Obejct> == Box<?>
        System.out.println(box.get());
    }
}
