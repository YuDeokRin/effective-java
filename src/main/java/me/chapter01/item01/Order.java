package me.chapter01.item01;

import java.util.Arrays;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;


//     에러난다. 이유 : 같은 타입에 인스턴스를 리턴해주는 생성자의 시그니쳐가 파라미터의 타입까지 보는데, 동일한 타입 생성자가 있을 수 없다.
//     타입이 같으면 매개변수 이름과 상관없이 동일하다고 보기때문에 안된다.
//    public Order(Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }

//    public Order(Product product, boolean urgent) {
//        this.product = product;
//        this.urgent = urgent;
//    }



    // 순서를 바꿔서 우회하는 방법이 있다.
    // 하지만 단점은 Order라는 것으로 명명이 같기 때문에 Order가 prime Order인지 ? urgent Order인지 헷갈린다.
//    public Order(Product product, boolean prime) {
//        this.prime = prime;
//        this.product = product;
//    }
//    public Order(boolean urgent, Product product) {
//        this.urgent = urgent;
//        this.product = product;
//    }


    // 해결방법 : 정적 팩토리 메서드를 이용하자!

    //public Order(){} // 기본생성자는 코드로 작성을 안해도 디폴트로 있다.


/*
    //enum 없이 주문을 상태를 나타내보자.
    //0 - 주문 받음
    //1 - 준비 중
    //2 - 배송 중
    //3 - 배송 완료
    private int status;

    private final int PREPARING = 0;
    private final int SHIPPED = 1;
    private final int DEILVERING = 2;
    private final int DEILVERED= 3;
 */

    private OrderStatus orderStatus ;


    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }
    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    // 특정 enum타입이 가질 수 있는 모든 값을 순회하며 출력하기
    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
    }

}
