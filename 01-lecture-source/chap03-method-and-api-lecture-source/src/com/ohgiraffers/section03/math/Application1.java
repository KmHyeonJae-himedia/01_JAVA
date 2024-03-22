package com.ohgiraffers.section03.math;

import static java.lang.Math.abs;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /* API란?
         * Application Programming Interface의 약자로, 응용 프로그램에서 사용할 수 있도록,
         * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
         * 쉽게말해 우리가 구현할 수 없거나, 구현하기 번거로운 기능들을 JDK를 설치하면 사용할 수 있도록 제공해놓은 소스 코드들을 의미한다.
         * 모든 코드를 우리가 외울 수는 없기 때문에, API 문서도 같이 제공되어 우리가 필요한 기능을 찾아서 사용할 수 있도록 도와준다.
         */

        /* java.lang.Math
         * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
         * 모든 메소드는 static 메소드로 작성되어있다.
         * (객체의 상태를 관리하지 않고 기능만을 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법이다)
         */


        /* 1. 절대값 출력 */
        /* 1.1. 클래스의 전체이름을 다 적은 경우 */
        System.out.println(java.lang.Math.abs(-3)); // 3

        /* 1.2. 클래스의 전체이름을 생략한 경우 */
        System.out.println(Math.abs(-3)); // 3

        /* 1.3. static import를 사용한 경우 */
        System.out.println(abs(-3)); // 3

        /* 2. 최대값, 최소값 출력 */
        System.out.println("10과 20 중 더 작은 것은? : " + Math.min(10, 20)); // 10
        System.out.println("20과 30 중 더 큰 것은? : " + Math.max(20, 30)); // 30

        System.out.println("원주율 : " + Math.PI); // 3.141592653589793

        /* 3. 난수 출력 */
        System.out.println("0과 1 사이의 난수 : " + Math.random()); // 0.0 <= x < 1.0
    }
}

