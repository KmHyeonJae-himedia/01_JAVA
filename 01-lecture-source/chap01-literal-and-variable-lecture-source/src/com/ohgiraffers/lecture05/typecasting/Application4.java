package com.ohgiraffers.lecture05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표 : 형변환 시 주의할 점을 이해하고 사용할 수 있다. */
        /* 1. 데이터 손실에 주의해서 사용해야한다. */
        /* 1.1 의도하지 않은 데이터 손실 */
        int inum1 = 1000;
        byte bnum1 = (byte) inum1; // int -> byte로 강제 형변환
        System.out.println("inum1 : " + inum1); // 1000
        System.out.println("bnum1 = (byte)inum1 : " + bnum1); // -24
        // 비트 앞부분 손실로 예측이 어렵다

        /* 1.2 의도한 데이터 손실 */
        double height = 180.1;
        int floorHeight = (int) height; // double -> int로 강제 형변환
        System.out.println("height : " + height); // 180.1
        System.out.println("floorHeight = (int)height : " + floorHeight); // 180
        // 소수점 이하 데이터를 제거하는 데에 의도적으로 사용할 수 있다

        
    }
}
