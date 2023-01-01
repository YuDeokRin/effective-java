package me.chapter03.item13;

import java.util.HashMap;
import java.util.Map;

// PhoneNumber에 toString 메서드 추가 (75쪽)
public final class PhoneNumber implements Cloneable{
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix   = rangeCheck(prefix,   999, "프리픽스");
        this.lineNum  = rangeCheck(lineNum, 9999, "가입자 번호");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;
    }

//    @Override public String toString() {
//        return String.format("%03d-%03d-%04d",
//                areaCode, prefix, lineNum);
//    }


    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // 일어날 수 없는 일.
        }
    }

//    기본적인 모습의 clone()
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber(707, 867, 5309);
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(pn, "제니");
        PhoneNumber clone = pn.clone(); // clone() 호출 ->clone()으로 만들어진 인스턴스는 새로운 인스턴스이다. ->생성자를 사용하지않는다.
        System.out.println(m.get(clone));

        System.out.println(clone != pn); //인스턴스 다르다.
        System.out.println(clone.getClass() == pn.getClass());// 반드시 true
        System.out.println(clone.equals(pn)); //true가 아닐수도 있음


    }
}