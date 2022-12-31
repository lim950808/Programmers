package Lv0;

import java.util.Arrays;

class 이차원으로만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        answer = new int[num_list.length/n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i/n][i%n] = num_list[i];
        }

        // 배열 num_list 내 요소들을 n의 크기만큼 묶어서 2차원 배열로 바꿔 return
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] num_list2 = new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948};

        int[][] answer1 = new 이차원으로만들기().solution(num_list1, 2);
        int[][] answer2 = new 이차원으로만들기().solution(num_list2, 3);

        // 다차원 배열 : deepToString
        System.out.println(Arrays.deepToString(answer1)); // [[1, 2], [3, 4], [5, 6], [7, 8]]
        System.out.println(Arrays.deepToString(answer2)); // [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
    }
}