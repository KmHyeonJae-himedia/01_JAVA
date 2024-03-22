package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.max;


public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 임포트(import)에 대해 이해하고 사용할 수 있다. */
        /* 임포트란?
         * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 전체이름을 사용해야한다.
         * 하지만 패키지명을 계속해서 사용하면 코드가 길어지고 가독성이 떨어지게 된다.
         * 그래서 자바에서는 import문을 사용하여 패키지명을 생략할 수 있게 해준다.
         *
         * import는 package 선언문과 class 선언문 사이에 작성하며,
         * 어떤 패키지의 클래스를 사용할 것인지 명시하는 역할을 한다.
         */

        /* 1. 외부 패키지에 위치한 클래스의 non-static 메소드 호출 */
        /* import com.ohgiraffers.section01.method.Calculator; 를 작성해서 패키지명을 생략할 수 있다. */
        Calculator cal = new Calculator();
        System.out.println("30과 20 중 더 작은 값은? : " + cal.min(30, 20));

        /* 2. 외부 패키지에 위치한 클래스의 static 메소드 호출 */
        int result = Calculator.max(30, 20);
        System.out.println("30과 20 중 더 큰 값은? : " + result);

        /* 3. 외부 패키지에 위치한 클래스의 static 메소드 호출 2 */
        /* import static com.ohgiraffers.section01.method.Calculator.max; 를 작성해서 특정 static method만 임포트 할 수도 있다. */
        System.out.println("30과 20 중 더 큰 값은? : " + max(30, 20));
    }
}
