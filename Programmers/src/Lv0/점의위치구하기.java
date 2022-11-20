package Lv0;

import java.util.Arrays;

class 점의위치구하기 {
    public int solution(int[] dot) {
        int answer = 0;

        // x 좌표 (x, y)를 차례대로 담은 정수 배열 dot
        // dot[0]은 x좌표, dot[1]은 y좌표
        // dot의 길이 = 2
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                answer = 1; // x 좌표와 y 좌표가 모두 양수이면 제1사분면
            } else {
                answer = 4; // x 좌표가 양수, y 좌표가 음수이면 제4사분면
            }
        } else {
            if (dot[1] > 0) {
                answer = 2; // x 좌표가 음수, y 좌표가 양수이면 제2사분면
            } else {
                answer = 3; // x 좌표와 y 좌표가 모두 음수이면 제3사분면
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4};
        int[] arr2 = new int[]{-7, 9};

        int answer1 = new 점의위치구하기().solution(arr1);
        int answer2 = new 점의위치구하기().solution(arr2);

        System.out.println(Arrays.toString(arr1) + "는 제 " + answer1 + "사분면에 속합니다."); // 1
        System.out.println(Arrays.toString(arr2) + "는 제 " + answer2 + "사분면에 속합니다."); // 2
    }
}