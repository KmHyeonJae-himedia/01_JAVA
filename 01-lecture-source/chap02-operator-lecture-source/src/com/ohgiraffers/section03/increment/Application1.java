package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 증감연산자에 대해 이해하고 활용할 수 있다. */
        /* 증감연산자
         * 피연산자에 앞 or 뒤에 사용 가능하다.
         * ++ : 피연산자의 값을 1 증가시킨다.
         * -- : 피연산자의 값을 1 감소시킨다.
         */

        /* 1. 증감연산자를 단독으로 사용 */
        /* 단항으로 사용할 때는 1증가/1감소의 의미를 가진다. */
        int num1 = 10;
        System.out.println("num1 = " + num1);

        num1++; // num1 = num1 + 1과 같은 의미
        System.out.println("num1++ : " + num1);

        ++num1; // num1 = num1 + 1과 같은 의미
        System.out.println("++num1 : " + num1);

        num1--; // num1 = num1 - 1과 같은 의미
        System.out.println("num1-- : " + num1);

        --num1; // num1 = num1 - 1과 같은 의미
        System.out.println("--num1 : " + num1);

        /* 2. 증감연산자를 다른 연산자와 함께 사용 */
        /* 주의사항
         * 증감연산자는 다른 연산자와 함께 사용될 때 전위 연산자와 후위 연산자가 다르게 동작한다.
         * 전위 연산자 : 먼저 증감연산을 수행한 후 다른 연산을 수행한다.
         * 후위 연산자 : 다른 연산을 먼저 수행한 후 증감연산을 수행한다.
         */

        /* 후위 연산자 */
        int firstNum = 20;
        int firstResult = firstNum++ * 3; // firstResult = firstNum * 3 후 firstNum = firstNum + 1을 의미
        System.out.println("firstNum: " + firstNum); // firstNum = 21
        System.out.println("firstResult : " + firstResult); // firstResult = 60

        /* 전위 연산자 */
        int secondNum = 20;
        int secondResult = ++secondNum * 3; // secondNum = secondNum + 1 후 secondResult = secondNum * 3을 의미
        System.out.println("secondNum: " + secondNum); // secondNum = 21
        System.out.println("secondResult : " + secondResult); // secondResult = 63
    }
}
