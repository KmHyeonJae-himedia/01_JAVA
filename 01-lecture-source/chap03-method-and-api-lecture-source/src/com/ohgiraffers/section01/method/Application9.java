package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 수업목표 : 다른 클래스에 접근해서 메소드를 호출할 수 있다. */

        /* 최대값, 최소값을 비교할 두 정수 */
        int first = 10;
        int second = 20;

        /* non-static 메소드 호출 */
        /* 클래스가 다르더라도 사용하는 방법은 동일하다.
         * 클래스명 사용할이름 = new 클래스명();
         * 사용할이름.메소드명();
         */
        Calculator calculator = new Calculator();
        System.out.println("최소값 : " + calculator.min(first, second));

        /* static 메소드 호출 */
        /* 클래스명.메소드명(); */
        // max(first, second); // 다른 클래스의 static 메소드는 클래스명을 생략할 수 없다.
        System.out.println("최대값 : " + Calculator.max(first, second));

        /*
         * static 메소드를 객체를 통해 호출할 순 있지만, 권장하지 않는다.
         * static 요소는 메모리에 로딩되어있는 상태이므로 객체를 통해 호출할 필요가 없다는 경고가 표시된다.
         */
        calculator.max(first, second);
    }
}
