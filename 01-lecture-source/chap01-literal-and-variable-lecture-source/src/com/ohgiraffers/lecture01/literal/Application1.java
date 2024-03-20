package com.ohgiraffers.lecture01.literal;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 여러가지 값의 형태를 출력할 수 있다. */

        /* 1. 숫자 형태의 값 */
        /* 1.1 정수 형태의 값 */
        System.out.println(1234); //정수는 그냥 입력한다

        /* 1.2 실수 형태의 값 */
        System.out.println(1.234); //실수도 그냥 입력한다

        /* 2. 문자 형태의 값 */
        System.out.println('A'); // 문자 형태의 값은 홑따옴표(single quote)로 감싼다.
        //System.out.println('A2'); // 문자 형태에 두글자 이상이 들어가면 오류가 발생한다. Too many characters in character literal
        //System.out.println(''); // 문자 형태에 아무 글자가 없으면 오류가 발생한다. Empty character literal
        System.out.println('1'); // 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 형태로 취급한다. (문자 '1')


        /* 3. 문자열 형태의 값 */
        System.out.println("Hello, World!"); // 문자열은 쌍따옴표(double quote)로 감싼다.
        System.out.println("1234"); // 숫자 값이지만 쌍따옴표로 감싸져 있는 경우 문자열 형태로 취급한다.
        System.out.println(""); // 아무 글자가 없어도 된다.
        System.out.println("A"); // 한 개의 문자도 쌍따옴표로 감싸져 있으면 문자열 형태로 취급한다. (문자 `a`와는 다르다)

        /*
         * 4. 논리 형태의 값
         * 참 혹은 거짓
         * true 혹은 false
         */
        System.out.println(true); // 뱀은 파충류인가요? 참
        System.out.println(false); // 뱀은 식물인가요? 거짓
    }
}
