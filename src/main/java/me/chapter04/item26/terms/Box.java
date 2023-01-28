package me.chapter04.item26.terms;

public class Box<E> {
    private E item;

    private void add(E e) {
        this.item = e;
    }

    private E get(){
        return this.item;
    }

    public static void main(String[] args) {
        Box<Integer> box= new Box<>(); //Box<Integer> 실제 타입 매개변수화 타입 -> < >
                                       // raw타입 -> Box box = new box(); -> 사용하지 말것
        box.add(10);
        printBox(box);

        Box<String> box1 = new Box<>();
        box1.add("mfowimwdko");

    }

    private static void printBox(Box<?> box) { // Box<? extneds Obejct> == Box<?>
        System.out.println(box.get());
    }
}
