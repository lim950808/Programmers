package Lv0;

import java.util.Arrays;

class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        for(int i = 0; i <= num_list.length - 1; i++) {
            reverse[i] = num_list[num_list.length - 1 - i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 1, 1, 1, 1, 2};
        int[] arr3 = new int[]{1, 0, 1, 1, 1, 3, 5};

        int[] answer1 = new 배열뒤집기().solution(arr1);
        int[] answer2 = new 배열뒤집기().solution(arr2);
        int[] answer3 = new 배열뒤집기().solution(arr3);

        System.out.println(Arrays.toString(answer1)); // [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(answer2)); // [2, 1, 1, 1, 1, 1]
        System.out.println(Arrays.toString(answer3)); // [5, 3, 1, 1, 1, 0, 1]
    }
}