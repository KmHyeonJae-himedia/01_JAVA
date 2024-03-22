package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표 : 여러개의 전달인자를 이용한 메소드를 호출할 수 있다. */
        /* 전달인자로 여러개의 값을 전달할 수 있습니다. */
        /* 전달인자의 값은 매개변수의 타입과 순서에 맞게 전달해야 합니다. */

        Application4 app = new Application4();

        /* 1-1. 여러개의 전달인자를 이용한 메소드 호출 */
        app.test(27, "홍길동", '남');
        app.test(20, "홍길순", '여');

        /* 1-2. 전달인자의 값이 매개변수의 타입과 순서에 맞지 않는 경우 */
        // app.test(27, '남', "홍길동"); // 전달인자의 타입이 매개변수의 타입과 순서에 맞지 않아서 컴파일 에러 발생
        // app.test(27, "홍길동"); // 전달인자의 수가 매개변수의 수보다 적어서 컴파일 에러 발생
        // app.test(27, "홍길동", '남', "서울"); // 전달인자의 수가 매개변수의 수보다 많아서 컴파일 에러 발생
    }

    public void test(int age, String name, final char gender) {
        /*
         * 매개변수도 일종의 지역변수로 분류된다.
         * 매개변수도 finial 키워드를 사용할 수 있다.
         * 지역변수에서 final 키워드를 붙여 상수를 만드는 것과 동일하다.
         * 상수인 매개변수는 상수 명명 규칙을 따르지 않는 경향이 있다.
         */
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");
    }
}
