package Lv0;

import java.util.Arrays;

class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        // 가장 큰 수와 그 수의 인덱스를 담은 배열을 return
        return answer;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 8, 3};
        int[] array2 = new int[]{9, 10, 11, 8};

        int[] answer1 = new 가장큰수찾기().solution(array1);
        int[] answer2 = new 가장큰수찾기().solution(array2);

        System.out.println(Arrays.toString(array1) + " 중 가장 큰 수와 그 인덱스는 " + Arrays.toString(answer1) + "입니다."); // [8, 1]
        System.out.println(Arrays.toString(array2) + " 중 가장 큰 수와 그 인덱스는 " + Arrays.toString(answer2) + "입니다."); // [11, 2]
    }
}