package com.ohgiraffers.section01.arithmetic;

public class Application1 {

    public static void main(String[] args) {
        /* 수업목표 : 산술 연산자에 대해 이해하고 활용할 수 있다. */
        /* 산술연산자
         * 산술연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서 많이 사용되는 연산자이다.
         * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두개인 이상 연산자로 분류되며
         * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
         *
         */

        /*
         * 산술연산자의 종류
         * + : 왼쪽의 피연산자에서 오른쪽의 피연산자를 더한다.
         * - : 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀다.
         * * : 왼쪽의 피연산자에서 오른쪽의 피연산자를 곱한다.
         * / : 왼쪽의 피연산자에서 오른쪽의 피연산자를 나눈다.
         * % : 왼쪽의 피연산자에서 오른쪽의 피연산자를 나눈 나머지를 구한다.
         *
         * 산술연산자의 우선순위
         * 수학의 개념과 유사하게 *, /, %가 +, -보다 높은 우선순위를 가진다.
         * 우선 순위가 같은 경우 왼쪽에서 오른쪽으로 연산이 진행된다.
         *
         */

        int num1 = 20;
        int num2 = 7;
        System.out.println("num1 + num2 = " + (num1 + num2)); // 27
        System.out.println("num1 - num2 = " + (num1 - num2)); // 13
        System.out.println("num1 * num2 = " + (num1 * num2)); // 140
        System.out.println("num1 / num2 = " + (num1 / num2)); // 2
        System.out.println("num1 % num2 = " + (num1 % num2)); // 6

    }
}
