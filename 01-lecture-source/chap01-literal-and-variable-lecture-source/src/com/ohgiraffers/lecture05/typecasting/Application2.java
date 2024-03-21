package com.ohgiraffers.lecture05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 강제형변환
         * 바꾸려는 자료형으로 캐스트 연산자를 이용해 형변환한다.
         */

        /*
         * 자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다.
         * 1. 강제 형변환이 필요한 경우
         *     1.1 큰 자료형에서 작은 자료형으로 형변환
         *     1.2 실수 자료형을 정수 자료형으로 형변환
         *     1.3 문자 자료형을 int보다 작은 정수 자료형으로 형변환
         *     1.4 논리 자료형은 형변환 불가
         */

        /* 1.1 큰 자료형에서 작은 자료형으로 형변환 */
        long lnum = 100L;
        // int inum1 = lnum; // 컴파일 에러
        // long보다 int의 크기가 작기 떄문에 데이터가 손실될 수 있어 컴파일 에러를 발생시킨다

        int inum2 = 1000;
        byte bnum = (byte) inum2; // int -> byte로 강제 형변환
        System.out.println("bnum = (byte)num1 : " + bnum); // -24

        /* 1.2 실수 자료형을 정수 자료형으로 형변환 */
        float fnum1 = 4.0f;
        // long lnum2 = fnum1; // 컴파일 에러
        // float보다 long이 크기는 크지만, 소수점 자리 이하의 데이터가 손실 될 수 있어 컴파일 에러를 발생시킨다

        double dnum = 10.5;
        int inum = (int) dnum; // double -> int로 강제 형변환
        System.out.println("inum = (int)dnum : " + inum); // 10

        /* 1.3 문자 자료형을 int보다 작은 정수 자료형으로 형변환 */
        char ch = '가';
        // short snum = ch; // 컴파일 에러
        // char와 short의 크기는 같지만, short는 음수가 포함되어 있어 최대값이 다르기 때문에 컴파일 에러를 발생시킨다.

        short snum = (short) ch; // char -> short로 강제 형변환
        System.out.println("snum = (short)ch : " + snum); // 65
        System.out.println("(char) snum : " + (char) snum); // 65

        /* 1.4 논리 자료형은 형변환 불가 */
        // int num6 = (int)true; // 컴파일 에러
    }
}
