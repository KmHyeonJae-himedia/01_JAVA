package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표 : java.util.Random 을 이용해 난수를 발생시킬 수 있다. */

        /* java.util.Random
         * Math.random()은 0부터 1까지의 실수 범위의 난수값을 반환한다.
         * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야하는 경우도 존재한다.
         * Random.nextInt(int bound) : 0부터 bound-1까지의 난수를 정수 형태로 반환한다.
         */

        /* random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최소값 */
        Random random = new Random();

        /* 1. 0 ~ 9까지의 난수 발생 */
        int random1 = random.nextInt(10);
        System.out.println("0 ~ 9까지의 난수 : " + random1);

        /* 2. 1 ~ 10까지의 난수 발생 */
        int random2 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10까지의 난수 : " + random2);

        /* 3. 20 ~ 45까지의 난수 발생 */
        int random3 = random.nextInt(26) + 20;
        System.out.println("20 ~ 45까지의 난수 : " + random3);

        /* 4. -128 ~ 127까지의 난수 발생 */
        int random4 = new Random().nextInt(256) - 128;
        System.out.println("-128 ~ 127까지의 난수 : " + random4);
    }
}

