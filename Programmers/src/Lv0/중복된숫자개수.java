package Lv0;

import java.util.Arrays;

class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = 0;

        // 정수가 담긴 배열 array와 정수 n
        for (int num : array) {
            if (num == n) answer++;
        }

        // array에 n이 몇 개 있는 지를 return
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2, 3, 4, 5};
        int[] arr2 = new int[]{0, 2, 3, 4};

        int answer1 = new 중복된숫자개수().solution(arr1, 1);
        int answer2 = new 중복된숫자개수().solution(arr2, 1);

        System.out.println(Arrays.toString(arr1) + "에는 1이 " + answer1 + "개 있습니다."); // 2
        System.out.println(Arrays.toString(arr2) + "에는 1이 " + answer2 + "개 있습니다."); // 0
    }
}