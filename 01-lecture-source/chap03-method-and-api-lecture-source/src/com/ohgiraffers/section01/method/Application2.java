package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 다른 흐름의 메소드 호출 흐름에 대해 이해할 수 있다. */
        /*
         * 1. methodA(), methodB(), methodC()를 차례대로 작성한다.
         * 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 확인하고 다시 현재 위치로 돌아온다.
         * 3. 메인 메소드 시작을 확인하기 위한 출력 구분을 작성한다.
         */

        /* 1. methodA(), methodB(), methodC()를 차례대로 작성한다. */

        Application2 app = new Application2();
        app.methodA();
        app.methodB();
        app.methodC();


    }

    public void methodA() {
        System.out.println("정규수업 시작함");
        System.out.println("정규수업 끝남");
    }

    public void methodB() {
        System.out.println("취업특강 시작함");
        System.out.println("취업특강 끝남");
    }

    public void methodC() {
        System.out.println("프로젝트 수업 시작함");
        System.out.println("프로젝트 수업 끝남");
    }

}
