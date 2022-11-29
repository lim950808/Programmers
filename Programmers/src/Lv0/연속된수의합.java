package Lv0;

import java.util.Arrays;

class 연속된수의합 {
    public int[] solution(int num, int total) {
        // num의 숫자만큼의 길이의 배열을 가지고 있는 answer
        int[] answer = new int[num];

        // 배열 중 첫번째 정수 first
        // 연속된 수 num개를 더한 값이 total
        int first = total / num + (1 - num) / 2;

        // num만큼 loop을 돌면서 첫번째 정수 first에 하나씩 더함
        for(int i = 0; i < num; i++) {
            answer[i] = first++;
        }

        // 정수 배열을 오름차순으로 담아 return
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 4;
        int num4 = 5;

        int total1 = 12;
        int total2 = 15;
        int total3 = 14;
        int total4 = 5;

        int[] answer1 = new 연속된수의합().solution(3, 12);
        int[] answer2 = new 연속된수의합().solution(5, 15);
        int[] answer3 = new 연속된수의합().solution(4, 14);
        int[] answer4 = new 연속된수의합().solution(5, 5);

        System.out.println(num1 + "번 연속으로 더해서 " + total1 + "가 되는 오름차순 배열은 " + Arrays.toString(answer1) + "입니다."); // 3번 연속으로 더해서 12가 되는 오름차순 배열은 [3, 4, 5]입니다.
        System.out.println(num2 + "번 연속으로 더해서 " + total2 + "가 되는 오름차순 배열은 " + Arrays.toString(answer2) + "입니다."); // 5번 연속으로 더해서 15가 되는 오름차순 배열은 [1, 2, 3, 4, 5]입니다.
        System.out.println(num3 + "번 연속으로 더해서 " + total3 + "가 되는 오름차순 배열은 " + Arrays.toString(answer3) + "입니다."); // 4번 연속으로 더해서 14가 되는 오름차순 배열은 [2, 3, 4, 5]입니다.
        System.out.println(num4 + "번 연속으로 더해서 " + total4 + "가 되는 오름차순 배열은 " + Arrays.toString(answer4) + "입니다."); // 5번 연속으로 더해서 5가 되는 오름차순 배열은 [-1, 0, 1, 2, 3]입니다.
    }
}