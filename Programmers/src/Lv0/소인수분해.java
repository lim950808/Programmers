package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 소인수분해 {
    public int[] solution(int n) {
        // 리스트 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            // n이 그 자신과 1로 밖에 안 나눠질 때 "소수"이므로 소인수분해 불가
            if (n % i == 0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // .mapToInt(): 스트림을 IntStream으로 변환해주는 메서드
        // .toArray(): List를 Array로 바꿔주는 메서드
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        // n의 소인수를 오름차순으로 담은 배열을 return
        return answer;
    }

    public static void main(String[] args) {
        int[] answer1 = new 소인수분해().solution(12);
        int[] answer2 = new 소인수분해().solution(17);
        int[] answer3 = new 소인수분해().solution(420);

        System.out.println(Arrays.toString(answer1)); // [2, 3]
        System.out.println(Arrays.toString(answer2)); // [17]
        System.out.println(Arrays.toString(answer3)); // [2, 3, 5, 7]
    }
}