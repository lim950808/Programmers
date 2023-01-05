package Lv0;

import java.util.Arrays;

class 최댓값만들기2 {
    public int solution(int[] numbers) {
        // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return

        // 배열 오름차순 정렬
        Arrays.sort(numbers);
        // 음수끼리 곱해도 양수가 나와 최대치가 될 수 있기 때문에 각 배열의 제일 앞쪽 두 수나 제일 뒷쪽 두 수끼리 곱해서 더 큰 수를 출력.
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, -3, 4, -5};
        int[] numbers2 = new int[]{0, -31, 24, 10, 1, 9};
        int[] numbers3 = new int[]{10, 20, 30, 5, 5, 20, 5};

        int result1 = new 최댓값만들기2().solution(numbers1);
        int result2 = new 최댓값만들기2().solution(numbers2);
        int result3 = new 최댓값만들기2().solution(numbers3);

        System.out.println(result1); // 15
        System.out.println(result2); // 240
        System.out.println(result3); // 600
    }
}