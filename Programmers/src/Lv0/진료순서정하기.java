package Lv0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class 진료순서정하기 {
    public int[] solution(int[] e) {
        // 응급도가 높은 순서대로 진료 순서를 정한 배열을 return
        return Arrays
                .stream(e) // 스트림 생성
                .map(i -> Arrays
                        .stream(e) // 스트림 생성
                        .boxed() // int요소, long요소, double요소를 Integer, Long, Double요소로 박싱해서 Stream을 생성
                        .sorted(Comparator.reverseOrder()) // reverse 정렬
                        .collect(Collectors.toList()) // Stream을 List로 변환
                        .indexOf(i) + 1 // 각 인덱스 값이랑 1을 더함
                )
                .toArray(); // 배열로 변환
    }

    public static void main(String[] args) {
        int[] e1 = new int[]{3, 76, 24};
        int[] e2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] e3 = new int[]{30, 10, 23, 6, 100};

        int[] answer1 = new 진료순서정하기().solution(e1);
        int[] answer2 = new 진료순서정하기().solution(e2);
        int[] answer3 = new 진료순서정하기().solution(e3);

        System.out.println(Arrays.toString(answer1)); // [3, 1, 2]
        System.out.println(Arrays.toString(answer2)); // [7, 6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(answer3)); // [2, 4, 3, 5, 1]
    }
}