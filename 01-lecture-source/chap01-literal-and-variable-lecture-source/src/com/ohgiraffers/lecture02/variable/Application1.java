package com.ohgiraffers.lecture02.variable;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : 변수의 사용 목적을 알 수 있다. */
        /* 변수의 사용 목적
         * 1. 값을 의미를 부여하기 위한 목적 (의미 전달이 쉬워야 코드가 읽혀지고, 협업 및 유지보수에 유리하기 때문)
         * 2. 한 번 저장해둔 값을 재사용하기 위한 목적 (변수를 이용해 코드를 작성하면, 값을 변경할 때도 보다 편하게 가능)
         * 3. 시간에 따라 변하는 값을 저장하고 사용하기 위한 목적 (변하는 값을 저장하는 공간)
         */

        /* 1. 값에 의미부여를 하기 위한 목적 */

        System.out.println("========== 값에 의미부여를 하기 위한 목적 ==========");

        System.out.println("보너스를 포함한 급여" + (1800000 + 2000000) + "원");
        // 두 숫자 중 어떤게 보너스인지 애매하다

        int salary = 2500000;
        int bonus = 2000000;
        System.out.println("보너스를 포함한 급여" + (salary + bonus) + "원");
        // 두 숫자 중 어떤게 보너스인지 명확하다
        // 월글이 70만원이 올랐을 때, 변수명을 보고 바로 찾아 변경할 수 있다.


        /* 2. 값을 재사용하기 위한 목적 */
        System.out.println("========== 값을 재사용하기 위한 목적 ==========");
        int point = 1000;
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");
        System.out.println("1번 고객님에게 포인트를 " + point + "점 지급하였습니다.");

        /* 3. 시간에 따라 변하는 값을 저장하고 사용하기 위한 목적 */
        System.out.println("========== 시간에 따라 변하는 값을 저장하고 사용하기 위한 목적 ==========");

        int sum = 0;
        sum += 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은? : " + sum);
        sum += 20;
        System.out.println("sum에 20을 더하면 현재 sum의 값은? : " + sum);
        sum += 30;
        System.out.println("sum에 30을 더하면 현재 sum의 값은? : " + sum);
        sum += 40;
        System.out.println("sum에 40을 더하면 현재 sum의 값은? : " + sum);
        sum += 50;
        System.out.println("sum에 50을 더하면 현재 sum의 값은? : " + sum);
    }
}
