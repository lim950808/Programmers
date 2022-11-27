package Lv0;

import java.util.Arrays;

class 가까운수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        // Integer.MAX_VALUE : 정수의 최댓값(2147483647)을 출력
        int num = Integer.MAX_VALUE;
        // Arrays.sort(array) : array 배열 오름차순 정렬
        Arrays.sort(array);

        for (int i : array) {
            // Math.abs() : 인자값의 대한 절댓값 반환
            if (num > Math.abs(i-n)) {
                answer = i;
                num = Math.abs(i-n);
            }
        }

        // 배열 array에 들어있는 정수 중 n과 가장 가까운 수를 return
        return answer;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{3, 10, 28};
        int[] array2 = new int[]{10, 11, 12};

        int n1 = 20;
        int n2 = 13;

        int answer1 = new 가까운수().solution(array1, n1);
        int answer2 = new 가까운수().solution(array2, n2);

        System.out.println(Arrays.toString(array1) + " 중 " + n1 + "과 가장 가까운 수는 " + answer1 + "입니다."); // [3, 10, 28] 중 20과 가장 가까운 수는 28입니다.
        System.out.println(Arrays.toString(array2) + " 중 " + n2 + "과 가장 가까운 수는 " + answer2 + "입니다."); // [10, 11, 12] 중 13과 가장 가까운 수는 12입니다.
    }
}