package me.chapter01.item01;
/**
 * 이 클래스의 인스턴스는 #getInstacne()를 통해 사용한다
 * @see #getInstance()
 */
public class Settings {
    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;
/*
    public static void main(String[] args) {
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());
    }

 */

    // 위와 같이 Settings 인스턴스를 오직 하나의 인스턴스만 만들어서 사용해야한다면, 그때는 생성자가 아니라 정적 팩토리 메서드를 이용해서 통제한다.


    //기본 생성자를 private으로 선언
    //그렇다면 다른 클래스(Product)로는 private 생성자로 접근하지 못한다.
    //그렇다면 인스턴스를 어떻게 만들 수 있을까 ?
    private Settings(){} // 기본 생성자


    //방법1. 미리 만들어  놓는다.
    private static final Settings SETTINGS = new Settings(); // 정적 팩토리 메서드를  미리 만듬


    //정적팩토리 제공
    public static Settings newInstance(){
        return SETTINGS; // 미리 만든 SETTINGS를 return 할 수 있다.
    }
}
