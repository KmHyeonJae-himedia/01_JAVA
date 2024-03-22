package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 패키지에 대해 이해할 수 있다. */
        /* 패키지란?
         * 서로 관련된 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 말한다.
         * 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스르 만들 수도 있다.
         * 클래스명은 원래 패키지명을 포함한 전체 이름이기 떄문이다. ex) 전 수업에 사용한 Calcualtor는 com.ohgiraffers.section01.method.Calculator 이 원래 이름이다.
         *
         * 지금까지 클래스명에 패지키명을 함꼐 사용하지 않은 이유는 동일한 패키지 내에서 사용했기 때문이다.
         * 그렇기 때문에 다른 패키지의 클래스를 사용하는 경우에는 클래스명 앞에 패키지명을 명시해서 전체이름(`Fullqualified name`)을 사용해야 한다.
         */

        /* 1. 외부 패키지에 위치한 클래스의 non-static 메소드 호출 */
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();
        System.out.println("30과 20 중 더 작은 값은? : " + cal.min(30, 20));

        /* 2. 외부 패키지에 위치한 클래스의 static 메소드 호출 */
        int result = com.ohgiraffers.section01.method.Calculator.max(30, 20);
        System.out.println("30과 20 중 더 큰 값은? : " + result);
    }
}
