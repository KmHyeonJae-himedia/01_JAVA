package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /* 수업목표 : 매개변수와 반환값을 복합적으로 활용할 수 있다. */
        /*
         * 매개변수와 반환값 복합 활용
         * 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
         */

        Application7 app = new Application7();
        int first = 10;
        int second = 20;
        System.out.println("두 수를 더한 결과 : " + app.plus(first, second));
        System.out.println("두 수를 뺀 결과 : " + app.minus(first, second));
        System.out.println("두 수를 곱한 결과 : " + app.multiply(first, second));
        System.out.println("두 수를 나눈 결과 : " + app.divide(first, second));

    }

    public int plus(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }

    public int remainder(int first, int second) {
        return first % second;
    }
}
