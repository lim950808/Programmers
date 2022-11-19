package Lv0;

import java.util.Arrays;

class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0; // 짝수
        int odd = 0; // 홀수

        for(int num : num_list) {
            if ((num % 2) == 0) {
                even++;
            } else {
                odd++;
            }
        }

        answer[0] = even;
        answer[1] = odd;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 3, 5, 7};

        int[] answer1 = new 짝수홀수개수().solution(arr1);
        int[] answer2 = new 짝수홀수개수().solution(arr2);

        System.out.println(Arrays.toString(answer1)); // [2, 3]
        System.out.println(Arrays.toString(answer2)); // [0, 4]
    }
}