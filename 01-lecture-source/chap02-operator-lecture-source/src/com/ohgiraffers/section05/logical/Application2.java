package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 논리 연산자의 우선순위에 대해 이애하고 이를 활용할 수 있다. */
        /* 논리연산자의 우선순위와 활용
         *
         * 논리곱(`&&`)연산자가 논리합(`||`)연산자보다 우선순위가 높다.
         */

        /* 1. 1부터 100 사이의 값인지 확인 */
        int num1 = 55;
        System.out.println("1부터 100 사이의 값인지 확인 : " + (num1 >= 1 && num1 <= 100)); // true

        int num2 = 134;
        System.out.println("1부터 100 사이의 값인지 확인 : " + (num2 >= 1 && num2 <= 100)); // false

        /* 2. 영어의 대문자인지 확인 */
        char ch1 = 'A';
        System.out.println("영어의 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z')); // true

        char ch2 = 'a';
        System.out.println("영어의 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z')); // false

        /* 3. 대소문자 상관없이 영문자 y인지 확인 */
        char ch3 = 'y';
        System.out.println("대소문자 상관없이 영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y')); // true

        char ch4 = 'Y';
        System.out.println("대소문자 상관없이 영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y')); // true

        /* 4. 영문자인지 확인 */
        /* A : 65, Z : 90, a : 97, z : 122 */
        char ch5 = 'A';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z'))); // true
        System.out.println("영문자인지 확인 : " + ((ch5 >= 95 && ch5 <= 122) || (ch5 >= 65 && ch5 <= 90))); // true
    }
}
