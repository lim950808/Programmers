package Lv0;

import java.util.Arrays;

class 약수구하기 {
    public int[] solution(int n) {
        int[] arr = new int[10000]; // 1 <= n <= 10,000
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                arr[index] = i;
                index++;
            }
        }
        int[] answer = new int [index];
        for(int i = 0; i < index; i++) {
            if(arr[i] != 0) {
                answer[i] = arr[i];

            }
        }
        // n의 약수를 오름차순으로 담은 배열을 return
        return answer;
    }

    public static void main(String[] args) {
        int n = 24; // [1, 2, 3, 4, 6, 8, 12, 24]
//        int n = 29; // [1, 29]
        int[] answer = new 약수구하기().solution(n);

        System.out.println(n + "의 약수는 " + Arrays.toString(answer) + " 입니다.");
    }
}