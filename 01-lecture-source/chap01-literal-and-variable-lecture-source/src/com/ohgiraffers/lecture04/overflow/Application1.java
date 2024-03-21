package com.ohgiraffers.lecture04.overflow;

public class Application1 {

    public static void main(String[] args) {
        /* 수업목표 : 오버플로우에 대해 이해할 수 있다. */
        /* 오버플로우란?
         * 자료형이 표현할 수 있는 범위를 넘어서는 경우를 말한다.
         * 발생한 carry 값을 버림 처리하고, sing bit를 반전시켜 최소값으로 순환시킴
         */

        /* 1. 오버플로우가 발생하는 경우 */
        /* 1.1. 최대값을 넘어서 오버플로우 발생 */
        byte num1 = 127; // byte 자료형의 최대값
        System.out.println("num1 : " + num1); // 127

        num1++; // 128을 예상하고 값을 증가시킴
        System.out.println("num1 + 1: " + num1); // 실제론 -128가 출력됨 (오버플로우 발생)

        /* 1.2. 최소값을 넘어서 오버플로우 발생 */
        byte num2 = -128; // byte 자료형의 최소값
        System.out.println("num2 : " + num2); // -128

        num2--; // -129를 예상하고 값을 감소시킴
        System.out.println("num2 + 1 : " + num2); // 127 (오버플로우 발생)

        /* 1.3. 큰 수끼리의 연산에서 오버플로우 발생 */
        int a = 1000000;
        int b = 700000;
        int c = a * b;
        System.out.println("[1] 100만 * 70만 : " + c); // -79669248

        /* 2. 오버플로우를 방지하는 방법 */
        long bigNum = a * b;
        System.out.println("[2] 100만 * 70만 : " + bigNum); // -79669248
        // a와 b를 계산할 때 이미 오버플로우가 발생했기 때문에 long으로 형변환해도 이미 발생한 오버플로우를 방지할 수 없다.

        bigNum = (long)a * b; // a 혹은 b 둘 중 하나를 강제로 형변환해 오버플로우를 방지할 수 있다.
        System.out.println("[3] 100만 * 70만 : " + bigNum); // 70000000000
    }
}
