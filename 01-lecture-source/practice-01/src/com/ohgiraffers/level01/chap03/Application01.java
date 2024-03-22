package com.ohgiraffers.level01.chap03;

public class Application01 {

    public static void main(String[] args) {
        /* 다음 조건을 만족하는 프로그램을 작성하시오.
         *   Application01
         *   - main(args:String[]): void 설명 : 모든 메소드는 main 함수에서 호출하여 출력한다.
         *
         *   // 메소드 호출 확인용 메소드 호출
         *   // 10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
         *   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
         *   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 곱을 구하는 메소드 호출 후 리턴값 출력
         *   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 몫을 구하는 메소드 호출 후 리턴값 출력
         *   실행 결과
         *   - 메소드 호출 확인
         *   - 10과 20의 합 : 30
         *   - 10과 5의 차 : 5
         *   - 10과 5의 곱 : 50
         *   - 10과 5의 나눈 후 몫 : 2
         *  */

        Calculator calc = new Calculator();

        calc.checkMethod();
        System.out.println("10과 20의 합 : " + calc.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차 : " + calc.minusTwoNumber(10, 5));
        System.out.println("10과 5의 곱 : " + calc.multiTwoNumber(10, 5));
        System.out.println("10과 5의 나눈 후 몫 : " + calc.divideTwoNumber(10, 5));
    }
}