package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 비교연산자에 대해 이해하고 활용할 수 있다. */
        /* 비교연산자
         * 비교연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
         * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
         */

        /*
         * 비교 연산자의 종류
         * - `==` : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true, 다르면 false를 반환
         * - `!=` : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true, 같으면 false를 반환
         * - `>` : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true, 작으면 false를 반환
         * - `<` : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true, 크면 false를 반환
         * - `>=` : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true, 작으면 false를 반환
         * - `<=` : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true, 크면 false를 반환
         */

        /* 1. 숫자값 비교 */
        /* 1.1 정수 비교 */
        System.out.println("=========== 1.1 정수 비교 ===========");
        int inum1 = 10;
        int inum2 = 20;
        System.out.println(inum1 + " == " + inum2 + " : " + (inum1 == inum2)); // false
        System.out.println(inum1 + " != " + inum2 + " : " + (inum1 != inum2)); // true
        System.out.println(inum1 + " > " + inum2 + " : " + (inum1 > inum2)); // false
        System.out.println(inum1 + " < " + inum2 + " : " + (inum1 < inum2)); // true
        System.out.println(inum1 + " >= " + inum2 + " : " + (inum1 >= inum2)); // false
        System.out.println(inum1 + " <= " + inum2 + " : " + (inum1 <= inum2)); // true

        /* 1.2 실수 비교 */
        System.out.println("=========== 1.2 실수 비교 ===========");
        double dnum1 = 10.0;
        double dnum2 = 20.0;
        System.out.println(dnum1 + " == " + dnum2 + " : " + (dnum1 == dnum2)); // false
        System.out.println(dnum1 + " != " + dnum2 + " : " + (dnum1 != dnum2)); // true
        System.out.println(dnum1 + " > " + dnum2 + " : " + (dnum1 > dnum2)); // false
        System.out.println(dnum1 + " < " + dnum2 + " : " + (dnum1 < dnum2)); // true
        System.out.println(dnum1 + " >= " + dnum2 + " : " + (dnum1 >= dnum2)); // false
        System.out.println(dnum1 + " <= " + dnum2 + " : " + (dnum1 <= dnum2)); // true

        /* 2. 문자값 비교 */
        System.out.println("=========== 2. 문자값 비교 ===========");
        char c1 = 'A';
        char c2 = 'a';
        System.out.println(c1 + " == " + c2 + " : " + (c1 == c2)); // false
        System.out.println(c1 + " != " + c2 + " : " + (c1 != c2)); // true
        System.out.println(c1 + " > " + c2 + " : " + (c1 > c2)); // false
        System.out.println(c1 + " < " + c2 + " : " + (c1 < c2)); // true
        System.out.println(c1 + " >= " + c2 + " : " + (c1 >= c2)); // false
        System.out.println(c1 + " <= " + c2 + " : " + (c1 <= c2)); // true

        /* 3. 논리값 비교 */
        /* 논리값은 `==`와 `!=`만 사용 가능하다. */
        System.out.println("=========== 3. 논리값 비교 ===========");
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 + " == " + b2 + " : " + (b1 == b2)); // false
        System.out.println(b1 + " != " + b2 + " : " + (b1 != b2)); // true
        // System.out.println(b1 + " > " + b2 + " : " + (b1 > b2)); // 컴파일 에러


        /* 4. 문자열 비교 */
        /* 문자열도 `==`와 `!=`만 사용 가능하다. */
        System.out.println("=========== 4. 문자열 비교 ===========");
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " == " + str2 + " : " + (str1 == str2)); // false
        System.out.println(str1 + " != " + str2 + " : " + (str1 != str2)); // true
        // System.out.println(str1 + " > " + str1 + " : " + (str1 > str1)); // 컴파일 에러


    }
}
