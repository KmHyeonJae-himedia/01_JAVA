package com.ohgiraffers.level01.chap02;

public class Application1 {

    public static void main(String[] args) {
        /* 아래 출력의 결과를 예상하고 이유를 말하시오 */
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

		System.out.println(y >= 5 || x < 0 && x > 2); // true
		// y >= 5가 true이므로 뒤의 조건은 계산하지 않는다.
		// 따라서 바로 true가 출력된다.

        System.out.println(y += 10 - x++); // 13
		// y = y + (10 - x); x = x + 1; 두줄의 코드와 같다.
		// y = 5 + (10 - 2)이므로 y = 13이다.
		// x++이므로 x는 3이 된다.

        System.out.println(x += 2); // 5
		// x = x + 2;와 같다.
		// x = 3 + 2이므로 x = 5이다.

        System.out.println(!('A' <= c && c <= 'Z')); // false
		// 'A' <= c && c <= 'Z'는 c가 'A'이므로 둘 다 참이기 떄문에 true이다.
		// !true는 false이므로 false가 출력된다.

        System.out.println('C' - c); // 2
		// 'C'의 문자코드는 67이다.
		// c에 담긴 'A'의 문자코드는 65이다.
		// 67 - 65 = 2이므로 2가 출력된다.

        System.out.println('5' - '0'); // 5
		// '5'의 문자코드는 53이다.
		// '0'의 문자코드는 48이다.
		// 53 - 48 = 5이므로 5가 출력된다.

        System.out.println(c + 1); // 66
		// c에 담긴 'A'의 문자코드는 65이다.
		// 65 + 1 = 66이므로 66이 출력된다.

        System.out.println(++c); // B
		// c = c + 1;와 같다.
		// c = 'A' + 1이므로 c = 'B'이다.

        System.out.println(c++); // B
		// c++를 출력할 땐 그냥 c를 입력한 것과 같기 때문에 B가 출력된다.
		// 그 후 c = c + 1이므로 c = 'C'가 된다.

        System.out.println(c); // C
		// 위에서 c = 'C'가 되었으므로 C가 출력된다.
    }
}