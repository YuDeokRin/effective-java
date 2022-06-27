package me.chapter01.item01;

public enum OrderStatus {
    PREPARING(0), SHIPPED(1), DEILVERING(2), DEILVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }


}
