package Lv0;

import java.util.Arrays;

class 배열회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (direction.equals("right")) { // 오른쪽
                if (i < numbers.length - 1) { // 배열주소를 맞추기 위해 -1
                    answer[i + 1] = numbers[i]; // 첫번쨰 배열 값을 비우고 두번째부터 차례로 채움
                } else {
                    answer[0] = numbers[i]; // 제일 오른쪽 값을 기존 0번째 배열 값에 넣음
                }
            } else { // 왼쪽
                if (i == 0) {
                    answer[numbers.length - 1] = numbers[0]; // 배열주소를 맞추기 위해 -1
                } else {
                    answer[i - 1] = numbers[i]; // 제일 왼쪽 값을 기존 배열의 제일 오른쪽에 넣음
                }
            }
        }

        // 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 455, 6, 4, -1, 45, 6};

        int[] answer1 = new 배열회전시키기().solution(numbers1, "right");
        int[] answer2 = new 배열회전시키기().solution(numbers2, "left");

        System.out.println(Arrays.toString(answer1)); // [3, 1, 2]
        System.out.println(Arrays.toString(answer2)); // [455, 6, 4, -1, 45, 6, 4]
    }
}