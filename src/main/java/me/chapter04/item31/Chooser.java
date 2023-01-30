package me.chapter04.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Chooser<T> {
    private final List<T> choiceList;
    private final Random rnd = new Random();

    //before
//    public Chooser(Collection<T> choices) {
//        choiceList = new ArrayList<>(choices);
//    }

    //after
    public Chooser(Collection<? extends T> choices) {
        choiceList = new ArrayList<>(choices);
    }


    public T choose(){
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
        Chooser<Number> chooser = new Chooser<>(intList); //Integer(구체) -> Number(추상)
        for (int i = 0; i < 10; i++) {
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }
}
