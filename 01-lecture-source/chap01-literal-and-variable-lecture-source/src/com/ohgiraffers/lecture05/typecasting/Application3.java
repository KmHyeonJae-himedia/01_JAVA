package com.ohgiraffers.lecture05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표 : 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다 */
        /*
         * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
         * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.
         */

        int inum = 10;
        long lnum = 100L;

        /* 1. 두 수의 연산 결과를 int 형으로 강제 형변환한다. */
        //int result = inum + lnum; // 컴파일 에러
        int result1 = (int) (inum + lnum);
        System.out.println("result1 : " + result1); // 110

        /* 2. 연산 하기 전에 long 형 값을 int로 강제 형변환한다. */
        int result2 = inum + (int) lnum;
        System.out.println("result2 : " + result2); // 110

        /* 3. 결과값을 자동병변환을 통해 long 형 변수에 담는다. */
        long result3 = inum + lnum;
        System.out.println("result3 : " + result3); // 110

        /* 4. 주의사항 : int보다 작은 정수 자료형의 연산 결과는 int로 자동 형변환된다. */
        byte bnum1 = 10;
        byte bnum2 = 20;
        // short result4 = bnum1 + bnum2; // bnum1 + bnum2의 결과가 int 이므로, short보다 커서 컴파일 에러

        short result4 = (short) (bnum1 + bnum2); // bnum1 + bnum2의 결과를 short로 강제 형변환
        System.out.println("result4 : " + result4); // 30

    }
}
