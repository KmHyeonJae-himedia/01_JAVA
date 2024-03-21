package com.ohgiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {
        /* 수업목표 : 대입연산자의 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */
        /* 대입 연산자와 산술 복합 대입 연산자
         * - `=` : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입
         * - `+=` : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽 피연산자에 대입
         * - `-=` : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽 피연산자에 대입
         * - `*=` : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽 피연산자에 대입
         * - `/=` : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽 피연산자에 대입
         * - `%=` : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지를 왼쪽 피연산자에 대입
         */

        int num = 12;
        System.out.println("num = " + num);

        num += 3; // num = num + 3와 같은 의미
        System.out.println("num += 3 : " + num);

        num -= 5; // num = num - 3와 같은 의미
        System.out.println("num -= 5 : " + num);

        num *= 7; // num = num * 3와 같은 의미
        System.out.println("num *= 7 : " + num);

        num /= 6; // num = num / 3와 같은 의미
        System.out.println("num /= 6 : " + num);

        num %= 4; // num = num % 3와 같은 의미
        System.out.println("num %= 4 : " + num);

        /* 주의사항
         * 산술 복합 대입 연산자의 작성 순서에 주의해야 한다. (오타 주의!)
         */
        num =- 5; // num = -5와 같은 의미
        System.out.println("num =- 5 : " + num);
    }
}
