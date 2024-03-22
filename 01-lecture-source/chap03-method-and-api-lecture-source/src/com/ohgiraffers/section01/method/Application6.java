package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /* 수업목표 : 메소드의 리턴값을 이해하고 활용할 수 있다. */
        /*
         * 메소드의 리턴값 테스트
         * 메소드는 항상 return을 가진다.
         * return은 현재 메소드를 종료하고 호출한 메소드로 돌아가는 역할을 한다.
         * 또한 return은 메소드 호출 시 호출한 메소드로 값을 전달할 수 있다.
         * 이때 전달하는 값을 리턴값이라고 한다.
         */

        /*
         * 리턴값을 반환받기 위해선 메소드 선언부에 리턴값을 명시해 주어야한다.
         * void는아무 반환값도 가지지 않겠다는 의미이다.
         * 리턴값을 가지는 메소드는 리턴값의 타입을 선언해주어야한다.
         * 리턴값을 가지는 메소드는 메소드 내부에서 return을 반드시 명시적으로 작성해야한다.
         * 또한, 메소드 선언부의 리턴 타입과 반환값의 자료형은 반드시 일치해야한다.
         */

        System.out.println("메인 메소드 시작");

        Application6 app = new Application6();

        app.test(); // 반환값을 받지 않아 출력되지 않음
        String result = app.test();
        System.out.println("리턴값 : " + result); // Hello, world!
        System.out.println(app.test()); // Hello, world!
    }

    public String test() {
        return "Hello, world!";
    }
}
