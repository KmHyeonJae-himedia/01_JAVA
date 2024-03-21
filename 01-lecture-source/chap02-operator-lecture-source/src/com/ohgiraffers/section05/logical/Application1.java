package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 논리연산자에 대해 이해하고 활용할 수 있다. */
        /* 논리 연산자
         * 논리값 (true or false)을 취급하는 연산자이다.
         *
         * 논리 연산자의 종류
         * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
         *                    두 개의 논리식을 판단하여 참과 거짓을 판단한다.
         *     1.1 `&&` : 논리곱 (AND) : 두 개의 논리식이 모두 참일 때만 참을 반환
         *     1.2 `||` : 논리합 (OR) : 두 개의 논리식 중 하나라도 참이면 참을 반환
         * 2. 논리 부정 연산자 : 하나의 피연산자를 가지는 단항 연산자이다.
         *     2.1 `!` : 논리부정 (NOT) : 논리식의 결과를 반대로 반환
         */

        /* 논리 연산자의 결과값 확인 */
        System.out.println("=========== 논리 연산자의 결과값 확인 ===========");
        System.out.println("true && true : " + (true && true)); // true
        System.out.println("true && false : " + (true && false)); // false
        System.out.println("false && true : " + (false && true)); // false
        System.out.println("false && false : " + (false && false)); // false
        System.out.println("true || true : " + (true || true)); // true
        System.out.println("true || false : " + (true || false)); // true
        System.out.println("false || true : " + (false || true)); // true
        System.out.println("false || false : " + (false || false)); // false
        System.out.println("!true : " + (!true)); // false
        System.out.println("!false : " + (!false)); // true

        /* 2. 논리식에 논리연산자 활동 */
        System.out.println("=========== 논리식에 논리연산자 활동 ===========");
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("a < b && c < d : " + (a < b && c < d)); // true
        System.out.println("a < b && c > d : " + (a < b && c > d)); // false
        System.out.println("a > b && c < d : " + (a > b && c < d)); // false
        System.out.println("a > b && c > d : " + (a > b && c > d)); // true

        System.out.println("a < b || c < d : " + (a < b || c < d)); // true
        System.out.println("a > b || c > d : " + (a > b || c > d)); // false
        System.out.println("a > b || c < d : " + (a > b || c < d)); // true
        System.out.println("a < b || c > d : " + (a < b || c > d)); // true
    }
}
