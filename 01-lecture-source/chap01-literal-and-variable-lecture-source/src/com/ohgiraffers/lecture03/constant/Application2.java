package com.ohgiraffers.lecture03.constant;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 상수의 명명 규칙에 대해 이해할 수 있다. */
        /* 상수의 명명 규칙 중 컴파일 에러를 발생시키는 규칙은 변수와 동일하다.
         * 단, 개발자끼리의 암묵적인 규칙에서 일부 차이가 있다.
         *
         * 1. 모든 문자는 영문자 대문자와 숫자로만 구성한다.
         * 2. 단어 사이를 언더바(_)로 구분한다.
         */

        /* 1. 모든 문자는 영문자 대문자와 숫자로만 구성한다. */
        final int VERSION; // 영문자 대문자와 숫자로만 구성한다.
        final int version; // 컴파일 에러가 발생하진 않지만, 변수와의 구분이 어려워서 좋지 않다.

        /* 2. 단어 사이를 언더바(_)로 구분한다. */
        final int MAXAGE; // 컴파일 에러가 발생하진 않지만, 의미를 파악하기 어려워서 좋지 않다.
    }
}
