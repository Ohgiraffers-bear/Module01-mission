package com.ohgiraffers.basic.mission02;

import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        // 변수 선언
        Scanner sc = new Scanner(System.in);
        int number;         // 입력 숫자 (데이터 타입: int)
        boolean keepGoing = true; // 종료 여부 (데이터 타입: boolean)

        // 반복문: 음수 입력 전까지 반복
        while (keepGoing) {
            // 입력 처리
            System.out.print("양수를 입력하세요 (음수 입력 시 종료): ");
            number = sc.nextInt();

            // 조건문: 종료 조건 및 합계 계산
            if (number < 0) {
                keepGoing = false; // 종료
                System.out.println("프로그램을 종료합니다.");
            } else {
                int sum = calculateSum(number); // 함수 호출
                System.out.println("1부터 " + number + "까지의 합계: " + sum);
            }
        }
    }

    // 함수: 1부터 입력 숫자까지의 합계 계산
    public static int calculateSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i = i + 1;
        }
        return sum;
    }
}