package Lv0;

import java.util.*;

class 등수매기기 {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();

        // 영어 점수와 수학 점수를 담은 2차원 정수 배열 score
        for (int[] s : score) {
            list.add(s[0] + s[1]);
        }

        // 내림차순 정렬
        list.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }

        // 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return
        return answer;
    }

    public static void main(String[] args) {
        int[][] score1 = new int[][] {
                {80, 70}, {90, 50}, {40, 70}, {50, 80}
        };
        int[][] score2 = new int[][] {
                {80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}
        };

        int[] answer1 = new 등수매기기().solution(score1);
        int[] answer2 = new 등수매기기().solution(score2);

        System.out.println(Arrays.toString(answer1)); // [1, 2, 4, 3]
        System.out.println(Arrays.toString(answer2)); // [4, 4, 6, 2, 2, 1, 7]
    }
}