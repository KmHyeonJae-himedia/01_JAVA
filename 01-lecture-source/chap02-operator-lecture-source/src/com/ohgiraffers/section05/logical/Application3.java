package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표 : 논리연결연산자의 진리표에 대해 이해할 수 있다 */

        /* 1. `조건식 && 조건식` : 앞 조건식이 `false`면 뒤 조건식은 계산하지 않는다
         * 조건식 두 개가 모두 만족되어야 `true`를 반환하기 때문에,
         * 앞 조건식이 `false`면 뒤 조건식은 확인할 필요가 없다.
         * 따라서 연산을 줄이기 위해서 false가 나올 가능성이 높은 조건식을 앞에 배치하는 것이 좋다.
         */

        int num1 = 10;
        int result1 = (false && ++num1 > 0) ? num1 : num1;
        System.out.println("&& : " + result1); // 10

        /* 2. `조건식 || 조건식` : 앞 조건식이 `true`면 뒤 조건식은 계산하지 않는다
         * 조건식 두 개 중 하나만 만족되어도 `true`를 반환하기 때문에,
         * 앞 조건식이 `true`면 뒤 조건식은 확인할 필요가 없다.
         * 따라서 연산을 줄이기 위해서 true가 나올 가능성이 높은 조건식을 앞에 배치하는 것이 좋다.
         */

        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("|| : " + result2); // 10

    }
}
