package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 삼항연산자의 사용법을 익힐 수 있다 */

        /* 삼항연산자(ternary operator)
         * 자바에서 유일하게 피연산자가 3개인 연산자이다.
         * 문법 : `조건식 ? 참일때값 : 거짓일때값`
         * 조건식은 반드시 결과가 `boolean`이어야 한다.
         * 비교/논리 연산자가 주로 사용된다.
         *
         *
         * 삼항연산자는 if-else문을 간결하게 표현할 수 있어서 코드의 가독성을 높일 수 있다.
         */

        /* 1. 삼항연산자  단독 사용 */
        int num1 = 10;
        String result1 = (num1 > 0) ? "양수입니다" : "음수입니다";
        System.out.println("num1은 " + result1); // 양수입니다

        int num2 = -10;
        String result2 = (num2 > 0) ? "양수입니다" : "음수입니다";
        System.out.println("num2은 " + result2); // 음수입니다

        /* 2. 삼항연산자 중첩 사용 */
        int num3 = 10;
        int num4 = 0;
        int num5 = -10;

        String result3 = (num3 > 0) ? "양수입니다" : (num3 == 0) ? "0입니다" : "음수입니다";
        String result4 = (num4 > 0) ? "양수입니다" : (num4 == 0) ? "0입니다" : "음수입니다";
        String result5 = (num5 > 0) ? "양수입니다" : (num5 == 0) ? "0입니다" : "음수입니다";

        System.out.println("num3은 " + result3); // 양수입니다
        System.out.println("num4은 " + result4); // 0입니다
        System.out.println("num5은 " + result5); // 음수입니다


    }
}
