package com.ohgiraffers.lecture03.constant;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 상수에 대해 이해하고 사용할 수 있다 */
        /* 상수란?
         * 변경될 값을 저장하기 위한 공간을 변수라고 한다면,
         * 이와 반대로 변하지 않는 값을 저장해두기 위한 공간을 상수라고 한다.
         *
         * 상수를 사용하는 이유
         * 1. 변하지 않는 값을 저장하기 위해 사용한다.
         * 2. 초기화 이후 값을 대입하면 컴파일 에러를 발생시켜 값을 수정하지 못하게 한다.
         * 3. 가독성을 높이기 위해 사용한다.
         *
         * 상수를 사용하는 방법
         * 1. 선언 : 변수와 유사하지만 final 키워드를 사용하여 선언한다.
         * 2. 할당 : 변수와 동일하게 사용한다.
         * 3. 사용 : 변수와 동일하게 사용한다. 단, 초기화 이후엔 값 대입이 불가능하다.
         */

        /* 1. 상수 선언 */
        final int MAX_AGE; // final 키워드를 사용하여 상수를 선언한다.

        /* 2. 상수 할당 */
        MAX_AGE = 20; // 상수에 값을 대입한다. 이를 초기화라고 한다.
        //MAX_AGE = 100; // 컴파일 에러가 발생한다. 상수는 초기화 이후 값을 대입할 수 없다.

        /* 3. 상수 사용 */
        // 변수와 동일하게 사용할 수 있다.
        System.out.println("나이의 최대값은 " + MAX_AGE + "입니다.");
        // 변수와 동일하게 연산도 가능하다.
        System.out.println("최대값의 두배는 " + (MAX_AGE * 2) + "입니다.");
        // 변수와 동일하게 다른 변수에 대입도 가능하다.
        int maxAge = MAX_AGE;
    }
}