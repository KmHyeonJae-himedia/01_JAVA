package com.ohgiraffers.lecture02.variable;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 변수를 선언하고 값을 할당하여 사용할 수 있다 */
        /* 변수를 사용하는 방법
         * 1. 선언 : 변수의 이름을 정하고, 어떤 타입의 값을 저장할지 결정한다.
         * 2. 할당 : 변수에 값을 대입한다. (값 대입 및 초기화)
         * 2. 사용 : 변수에 저장된 값을 사용한다.
         */

        /* 1. 자료형이란?
         * 다양한 값의 형태 별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드이다.
         * 예시) 앞에서 사용한 int 자료형은 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
         *     이러한 자료형은 기본 자료형(Primary Type)과 참조 자료형(Reference Type)으로 나뉜다.
         */


        /* 1.1. 기본 자료형 8가지 */
        /* 1.1.1 숫자를 저장하는 자료형 */
        byte byteNumber; // 1byte 크기의 정수를 저장하는 자료형
        short shortNumber; // 2byte 크기의 정수를 저장하는 자료형
        int intNumber; // 4byte 크기의 정수를 저장하는 자료형
        long longNumber; // 8byte 크기의 정수를 저장하는 자료형

        /* 1.1.2 실수를 저장하는 자료형 */
        float floatNumber; // 4byte 크기의 실수를 저장하는 자료형
        double doubleNumber; // 8byte 크기의 실수를 저장하는 자료형

        /* 1.1.3 문자를 저장하는 자료형 */
        char charValue; // 2byte 크기의 문자를 저장하는 자료형
        char charValue2; // 2byte 크기의 문자를 저장하는 자료형

        /* 1.1.4 논리값을 저장하는 자료형 */
        boolean booleanTrue; // 1byte 크기의 논리값을 저장하는 자료형
        boolean booleanFalse; // 1byte 크기의 논리값을 저장하는 자료형

        /* 1.2 참조 자료형 */
        /* 1.2.1 문자열을 저장하는 자료형 */
        String stringValue; // 문자열을 저장하는 자료형


        /* 2. 변수에 값을 할당하기 */
        /* 2.1 정수를 취급하는 자료형에 값 대입 */
        byteNumber = 127; // byte 자료형은 -128 ~ 127까지의 값을 저장할 수 있다.
        shortNumber = 32767; // short 자료형은 -32768 ~ 32767까지의 값을 저장할 수 있다.
        intNumber = 2147483647; // int 자료형은 -2147483648 ~ 2147483647까지의 값을 저장할 수 있다.
        longNumber = 9223372036854775807L; // long 자료형은 뒤에 l을 붙여야하고, -9223372036854775808 ~ 9223372036854775807까지의 값을 저장할 수 있다.
        // 추가적으로 long 자료형을 표시할 떄 소문자 l은 다른 문자와 혼동될 수 있기 때문에 대문자 L을 사용하는 것이 좋다.

        /* 2.2 실수를 취급하는 자료형에 값 대입 */
        floatNumber = 3.14f; // float 자료형은 뒤에 f를 붙여야하고, 1.4E-45 ~ 3.4E38까지의 값을 저장할 수 있다.
        doubleNumber = 3.14d; // double 자료형은 4.9E-324 ~ 1.8E308까지의 값을 저장할 수 있다.
        // 실수 값은 기본적으로 double 자료형이기 때문에 d를 꼭 붙이지 않아도 된다.

        /* 2.3 문자를 취급하는 자료형에 값 대입 */
        charValue = 'A'; // char 자료형은 0 ~ 65535까지의 값을 저장할 수 있다.
        charValue2 = 65; // char 자료형에는 정수를 대입할 수 있다.

        /* 2.4 논리값을 취급하는 자료형에 값 대입 */
        booleanTrue = true; // boolean 자료형은 true 또는 false 값을 저장할 수 있다.
        booleanFalse = false;

        /* 2.5 문자열을 취급하는 자료형에 값 대입 */
        stringValue = "Hello, World!"; // String 자료형은 문자열을 저장할 수 있다.


        /*
         * 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표 자료형이라고 하며,
         * 정수는 int, 실수는 double 이 대표 자료형이다.
         */



        /* 3. 변수에 저장된 값을 사용하기 */
        System.out.println("========== 변수에 저장한 값을 출력 ==========");
        System.out.println("byteNumber : " + byteNumber);
        System.out.println("shortNumber : " + shortNumber);
        System.out.println("intNumber : " + intNumber);
        System.out.println("longNumber : " + longNumber);
        System.out.println("floatNumber : " + floatNumber);
        System.out.println("doubleNumber : " + doubleNumber);
        System.out.println("charValue : " + charValue);
        System.out.println("charValue2 : " + charValue2);
        System.out.println("booleanTure : " + booleanTrue);
        System.out.println("booleanFalse : " + booleanFalse);
        System.out.println("stringValue : " + stringValue);
    }
}
