package Lv0;

import java.util.Scanner;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        // 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력
        // 만약 n이 3이면 첫째 줄에 * 1개, 둘째 줄에 * 2개, 셋째 줄에 * 3개를 출력합니다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}