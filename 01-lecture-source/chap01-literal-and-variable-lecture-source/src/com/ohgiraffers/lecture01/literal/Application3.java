package com.ohgiraffers.lecture01.literal;

public class Application3 {

    public static void main(String[] args) {
        /* 수업목표 : 문자열 합치기 결과를 예측하고 사용할 수 있다 */
        /* 목차 1. 두개의 문자열 합치기 */
        System.out.println("========== 두개의 문자열 합치기 ==========");
        System.out.println(9 + 9); // 18
        System.out.println("9" + "9"); // 99
        System.out.println("9" + 9); // 99
        System.out.println(9 + "9"); // 99

        /* 목차 2. 세개의 문자열 합치기 */
        System.out.println("========== 세개의 문자열 합치기 ==========");
        System.out.println("9" + "9" + "9"); // 999
        System.out.println(9 + "9" + 9); // 999
        System.out.println(9 + 9 + "9"); // 189 : 연산 방향은 왼쪽부터 오른쪽이라서, 왼쪽의 정수 9+ 정수9 연산이 먼저 수행됐다.
        System.out.println("9" + (9 + 9)); // 918 : 괄호를 사용하여 연산의 우선순위를 변경할 수 있다.

        /* 목차 3. 문자열 합치기 응용 */
        /* 10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("========== 10과 20의 사칙연산 결과 ==========");
        System.out.println("10 + 20 = " + (10 + 20)); // 괄호를 묶지 않으면 10 + 20 = 1020이 출력된다.
        System.out.println("10 - 20 = " + (10 - 20));
        System.out.println("10 * 20 = " + (10 * 20));
        System.out.println("10 / 20 = " + (10 / 20));
        System.out.println("10 % 20 = " + (10 % 20));

        System.out.println("기차"); // 기차
        System.out.println("기차" + "칙칙폭폭"); // 기차칙칙폭폭
        System.out.println("기차" + 123 + 456 + "칙칙폭폭"); // 기차123456칙칙폭폭
        System.out.println(123 + 456 + "기차출발"); // 579기차출발

    }
}
