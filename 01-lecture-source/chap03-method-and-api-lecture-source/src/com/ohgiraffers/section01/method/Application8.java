package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        /* 수업목표 : 정적(static) 메소드를 호출할 수 있다. */
        /*
         * static 메소드를 호출하는 방법
         * 클래스명.메소드명(매개변수); 로 호출
         */

        /* 1. Application8 클래스의 sum 메소드 호출 */
        System.out.println("두 수를 더한 결과 : " + Application8.sum(10, 20));

        /* 2. 동일한 클래스 내부에 있는 메소드 호출 */
        System.out.println("두 수를 더한 결과 : " + sum(10, 20));
    }

    public static int sum(int first, int second) {
        return first + second;
    }
}
