package com.ohgiraffers.lecture01.literal;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : 값을 직접 연산하여 출력할 수 있다. */
        /* 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다. */

        /* 1. 숫자와 숫자의 연산 */
        /* 1-1. 정수와 정수의 연산 */
        /* 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산자를 사용할 수 있다. */
        System.out.println("========== 정수와 정수의 연산 ==========");
        System.out.println(123 + 456); // 덧셈
        System.out.println(123 - 23); // 뺄셈
        System.out.println(123 * 10); // 곱셈
        System.out.println(3 / 2); // 나눗셈
        System.out.println(3 % 2); // 나머지

        /* 1-2. 실수와 실수의 연산 */
        /* 실수끼리의 연산에도 정수와 동일하게 사칙연산과 나머지 연산이 가능하다. */
        System.out.println("========== 실수와 실수의 연산 ==========");
        System.out.println(12.3 + 4.56); // 덧셈
        System.out.println(12.3 - 2.3); // 뺄셈
        System.out.println(12.3 * 10.0); // 곱셈
        System.out.println(12.3 / 10.0); // 나눗셈
        System.out.println(12.3 % 10.0); // 나머지 약간의 오차가 발생한다 (2.3000000000000007)

        /* 1-3. 정수와 실수의 연산 */
        /* 정수와 실수의 연산에도 정수와 동일하게 사칙연산과 나머지 연산이 가능하다. */
        /* 정수와 실수를 연산할 때는 정수가 실수로 변환되어 연산된다. */
        System.out.println("========== 정수와 실수의 연산 ==========");
        System.out.println(123 + 45.6); // 덧셈
        System.out.println(123 - 45.6); // 뺄셈
        System.out.println(123 * 15.9); // 곱셈
        System.out.println(123 / 15.6); // 나눗셈
        System.out.println(123 % 0.7); // 나머지

        /* 2. 문자의 연산 */
        /* 2-1. 문자와 문자의 연산 */
        /* 문자끼리도 사칙연산과 나머지 연산이 가능하다. */
        /* 계산 결과보단 연산이 가능하다는 점 자체에 집중하자 */
        System.out.println("========== 문자와 문자의 연산 ==========");
        System.out.println('A' + 'B'); // 덧셈
        System.out.println('A' - 'B'); // 뺄셈
        System.out.println('A' * 'B'); // 곱셈
        System.out.println('A' / 'B'); // 나눗셈
        System.out.println('A' % 'B'); // 나머지

        /* 2-2. 문자와 정수의 연산 */
        /* 문자에 정수를 연산하는 것도 가능하다 */
        /*
         * 아래 결과를 통해 `A`가 63과 같다는 것을 알 수 있다.
         * 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기 때문에 모든 문자에는 대응되는 숫자들이 매칭되어있다.
         * 아스키코드와 유니코드
         */
        System.out.println("========== 문자와 정수의 연산 ==========");
        System.out.println('A' + 1); // 덧셈
        System.out.println('A' - 1); // 뺄셈
        System.out.println('A' * 2); // 곱셈
        System.out.println('A' / 2); // 나눗셈
        System.out.println('A' % 2); // 나머지

        /* 2-3. 문자와 실수의 연산 */
        /* 문자에 실수를 연산하는 것도 가능하다 */
        /* 단, 결과는 실수 형태로 나오게 된다 */
        System.out.println("========== 문자와 실수의 연산 ==========");
        System.out.println('A' + 3.14); // 덧셈
        System.out.println('A' - 3.14); // 뺄셈
        System.out.println('A' * 3.14); // 곱셈
        System.out.println('A' / 3.14); // 나눗셈
        System.out.println('A' % 3.14); // 나머지

        /* 3. 문자열의 연산 */
        /* 3.1 문자열과 문자열의 연산 */
        /* 문자열끼리의 연산은 두 문자열을 이어붙이는 것이다. */
        /* 문자열은 '+'외의 다른 연산을 사용할 수 없다. */
        System.out.println("========== 문자열과 문자열의 연산 ==========");
        System.out.println("Hello, " + "World!"); // 문자열끼리의 덧셈은 두 문자열을 이어붙이는 것이다.
        // System.out.println("Hello, " - "World!"); // 문자열끼리의 뺄셈은 불가능하다.
        // System.out.println("Hello, " * "World!"); // 문자열끼리의 곱셈은 불가능하다.
        // System.out.println("Hello, " / "World!"); // 문자열끼리의 나눗셈은 불가능하다.
        // System.out.println("Hello, " % "World!"); // 문자열끼리의 나머지는 불가능하다.

        /* 3.2 문자열과 다른 형태의 값의 연산 */
        /* 문자열과 다른 형태의 값의 연산도 '+' 연산만 가능하다. */
        System.out.println("========== 문자열과 다른 형태의 값의 연산 ==========");
        System.out.println("Hello, " + 1234); // 문자열과 정수의 덧셈은 두 값을 이어붙이는 것이다.
        System.out.println("Hello, " + 12.34); // 문자열과 실수의 덧셈은 두 값을 이어붙이는 것이다.
        System.out.println("Hello, " + 'A'); // 문자열과 문자의 덧셈은 두 값을 이어붙이는 것이다.
        System.out.println("Hello, " + true); // 문자열과 논리의 덧셈은 두 값을 이어붙이는 것이다.
        /*주의*/
        System.out.println("123" + "456"); // 숫자 형태가 들어가도, 문자열 합치기 연산으로 처리된다.

        /* 4. 논리의 연산 */
        /* 4.1 논리와 논리의 연산 */
        /* 논리 형태의 값끼리는 사칙연산과 나머지 연산이 불가능하다.
        System.out.println("========== 논리와 논리의 연산 ==========");
        // System.out.println(true + true); // 논리끼리의 덧셈은 불가능하다.
        // System.out.println(true - true); // 논리끼리의 뺄셈은 불가능하다.
        // System.out.println(true * true); // 논리끼리의 곱셈은 불가능하다.
        // System.out.println(true / true); // 논리끼리의 나눗셈은 불가능하다.
        */

        /* 4.2 논리와 정수의 연산 */
        /* 논리와 정수도 연산이 불가능하다
        System.out.println("========== 논리와 다른 형태의 값의 연산 ==========");
        // System.out.println(true + 1234); // 논리와 정수의 덧셈은 불가능하다.
        // System.out.println(true - 1234); // 논리와 정수의 뺄셈은 불가능하다.
        // System.out.println(true * 1234); // 논리와 정수의 곱셈은 불가능하다.
        // System.out.println(true / 1234); // 논리와 정수의 나눗셈은 불가능하다.
        // System.out.println(true % 1234); // 논리와 정수의 나머지는 불가능하다.
        */

        /* 4.3 논리와 실수의 연산 */
        /* 논리와 실수도 연산이 불가능하다
        System.out.println("========== 논리와 실수의 연산 ==========");
        // System.out.println(true + 12.34); // 논리와 실수의 덧셈은 불가능하다.
        // System.out.println(true - 12.34); // 논리와 실수의 뺄셈은 불가능하다.
        // System.out.println(true * 12.34); // 논리와 실수의 곱셈은 불가능하다.
        // System.out.println(true / 12.34); // 논리와 실수의 나눗셈은 불가능하다.
        // System.out.println(true % 12.34); // 논리와 실수의 나머지는 불가능하다.
        */

        /* 4.3 논리와 문자의 연산 */
        /* 논리와 문자도 연산이 불가능하다
         * 문자도 결국 내부적으로 숫자로 취급하기 때문에, 논리와 정수의 연산과 동일하다.
        System.out.println("========== 논리와 문자의 연산 ==========");
        // System.out.println(true + 'A'); // 논리와 문자의 덧셈은 불가능하다.
        // System.out.println(true - 'A'); // 논리와 문자의 뺄셈은 불가능하다.
        // System.out.println(true * 'A'); // 논리와 문자의 곱셈은 불가능하다.
        // System.out.println(true / 'A'); // 논리와 문자의 나눗셈은 불가능하다.
        // System.out.println(true % 'A'); // 논리와 문자의 나머지는 불가능하다.
        */

        /* 4.4 논리와 문자열의 연산 */
        /* 논리와 문자열은 '+' 연산만 가능하다 */
        System.out.println("========== 논리와 문자열의 연산 ==========");
        System.out.println(true + "Hello, World!"); // 논리와 문자열의 덧셈은 두 값을 이어붙이는 것이다.
        // System.out.println(true - "Hello, World!"); // 논리와 문자열의 뺄셈은 불가능하다.
        // System.out.println(true * "Hello, World!"); // 논리와 문자열의 곱셈은 불가능하다.
        // System.out.println(true / "Hello, World!"); // 논리와 문자열의 나눗셈은 불가능하다.
        // System.out.println(true % "Hello, World!"); // 논리와 문자열의 나머지는 불가능하다.
    }
}
