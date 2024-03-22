package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 메소드의 호출 흐름을 이해할 수 있다. */
        /* 메소드란?
         * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합
         *
         * 메소드의 사용 목적
         * 1. 코드의 재사용 : 중복되는 코드를 메소드로 만들어 코드 반복 작성을 줄일 수 있다.
         * 2. 가독성 : 메소드를 사용하면 코드의 가독성이 높아진다.
         * 3. 유지보수 : 메소드를 사용하면 코드의 유지보수가 쉬워진다.
         */

        System.out.println("main() 시작");

        /* 1. main 메소드 밖에 methodA라는 메소드를 추가한다. */
        /* 2. 추가한 methodA 메소드를 main 메소드에서 호출한다. */
        /* 메소드의 호출 방법
         * 클래스명 사용할이름 = new 클래스명(); // 객체 생성
         * 사용할이름.메소드명(); // 메소드 호출
         */

        Application1 app = new Application1(); // 객체 생성
        app.methodA(); // 메소드 호출

        System.out.println("main() 끝");
    }

    public void methodA() {
        System.out.println("뱀 선생님 출근!");

        methodB();

        System.out.println("뱀 선생님 퇴근!");
    }

    public void methodB() {
        System.out.println("09:30 수업을 시작합니다.");

        methodC();

        System.out.println("18:30 수업을 종료합니다.");
    }

    public void methodC() {
        System.out.println("13:20 점심시간입니다.");
        System.out.println("14:30 점심시간이 끝났습니다.");
    }
}
