package com.ohgiraffers.lecture05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 자동 형변환 규칙에 대해 이해할 수 있다. */
        /* 데이터 형변환이 필요한 이유
         * 자바에서 연산은 피연산자들이 모두 같은 타입일 경우에만 가능하다.
         * 따라서 서로 다른 타입의 피연산자를 연산하려면 둘 중 하나의 타입을 다른 쪽에 맞춰야 한다.
         */

        /* 형변환의 종류와 규칙
         * 1. 자동 형변환 (묵시적 형변환) : 컴파일러가 자동으로 형변환을 수행하는 것
         *    1.1. 작은 크기의 자료형에서 큰 크기의 자료형으로 형변환
         *    1.2. 정수 -> 실수 (double)
         *    1.3. 문자 -> 정수 (int)
         *    1.4. 논리 -> X (자동 형변환 불가)
         * 2. 강제 형변환 (명시적 형변환) : 개발자가 직접 형변환을 수행하는 것
         *    2.1. 자동 형변환이 되지 않는 경우 강제 형변환을 사용한다.
         */

        /* 1. 자동 형변환 */
        /* 1.1. 작은 크기의 자료형에서 큰 크기의 자료형으로 형변환 */
        /* 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에, 컴파일러가 자동으로 처리한다. */
        byte bnum = 10;
        int inum = bnum; // byte -> int로 자동 형변환
        System.out.println("inum = bnum : " + inum); // 10

        /* 1.1.1 정수끼리의 자동 형변환 */
        inum = 10000;
        long lnum = 9999999999L;
        lnum = inum + lnum; // inum이 int애서 long으로 자동 형변환
        System.out.println("inum + lnum : " + lnum); // 10000009999

        /* 1.1.2 실수끼리의 자동 형변환 */
        float fnum = 10.0f;
        double dnum = 10.0;
        dnum = fnum + dnum; // fnum이 float에서 double로 자동 형변환
        System.out.println("fnum + dnum : " + dnum); // 20.0

        /* 1.2. 정수 -> 실수 (double) */
        inum = 10;
        dnum = inum; // inum이 int -> double로 자동 형변환
        System.out.println("dnum = inum : " + dnum); // 10.0

        /* 1.3. 문자 -> 정수 (int) */
        char ch = 'A';
        inum = ch; // ch가 char -> int로 자동 형변환
        System.out.println("inum = ch : " + inum); // 65

        /* 1.4. 논리 -> X (자동 형변환 불가) */
        boolean flag = true;
        //int num6 = flag; // 컴파일 에러 발생
    }
}
