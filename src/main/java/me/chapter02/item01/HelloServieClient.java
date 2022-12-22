package me.chapter02.item01;

public class HelloServieClient {
    public static void main(String[] args) {
        HelloService ko = HelloServiceFactory.of("ko");
        System.out.println(ko.hello());

        HelloService en = HelloServiceFactory.of("En");
        System.out.println(en.hello());
    }
}
