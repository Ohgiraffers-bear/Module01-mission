package com.ohgiraffers.basic.mission01;

/*
 * [숫자 맞추기 게임 코드]
 * 1) 1부터 10 사이 난수를 생성한다.
 * 2) 사용자가 입력한 숫자가 정답인지 확인한다.
 * 3) 맞추면 종료, 틀리면 반복한다.
 */
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 변수 선언
        Scanner sc = new Scanner(System.in);
        int number;         // 입력 숫자 (데이터 타입: int)
        boolean keepGoing = true; // 종료 여부 (데이터 타입: boolean)

        // 반복문: 0 입력 전까지 반복
        while (keepGoing) {
            // 입력 처리
            System.out.print("숫자를 입력하세요 (0 입력 시 종료): ");
            number = sc.nextInt();

            // 조건문: 숫자 판별 및 종료
            if (number == 0) {
                keepGoing = false; // 종료
                System.out.println("프로그램을 종료합니다.");
            } else {
                boolean isEven = checkEven(number); // 함수 호출
                if (isEven) {
                    System.out.println(number + "는 짝수입니다.");
                } else {
                    System.out.println(number + "는 홀수입니다.");
                }
            }
        }
    }

    // 함수: 홀수/짝수 판별코드는 아래에 작성
    public static boolean checkEven(int num) {
        if (num % 2 == 0) {
            return true; // 짝수면 true
        } else {
            return false; // 홀수면 false
        }
    }
}