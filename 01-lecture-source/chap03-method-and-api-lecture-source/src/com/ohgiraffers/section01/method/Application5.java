package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /* 수업목표 : 메소드의 반환(return)에 대해 이해하고 사용할 수 있다. */
        /* 반환이란?
         * 모든 메소드 내부에는 리턴이 존재한다.
         * void 메소드의 경우 리턴값이 없는 것으로 간주하고 컴파일러가 자동으로 return;을 추가한다.
         * return은 현재 메소드를 종료하고 호출한 메소드로 돌아가는 역할을 한다.
         */

        System.out.println("메인 메소드 시작");

        Application5 app = new Application5();
        app.test();
    }

    public void test() {
        System.out.println("테스트 메소드 동작 확인");

        /*
         * void 메소드는 컴파일러에 의해 자동으로 return;이 추가되기 때문에 직접 작성하진 않아도 된다.
         * return이 가장 마지막이 아니면 컴파일 에러가 발생합니다.
         */

        return;

        // System.out.println("테스트 메소드 종료"); // return이 가장 마지막이 아니기 때문에 컴파일 에러 발생
    }
}
