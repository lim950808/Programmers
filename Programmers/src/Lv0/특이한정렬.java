package Lv0;

import java.util.Arrays;

class 특이한정렬 {
    public int[] solution(int[] numList, int n) {
        // 정수가 담긴 배열 numlist
        // 정수 n을 기준으로 n과 가까운 수부터 정렬
        // n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치
        return Arrays.stream(numList)
                .boxed() // .boxed() : int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 Stream을 생성
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer :: intValue) // .mapToInt() : 스트림을 IntStream으로 변환
                .toArray(); // .toArray() : ArrayList 타입의 String 리스트를 배열로 변환
    }

    public static void main(String[] args) {
        int[] numList1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] numList2 = new int[]{10000,20,36,47,40,6,10,7000};

        int[] answer1 = new 특이한정렬().solution(numList1, 4);
        int[] answer2 = new 특이한정렬().solution(numList2, 30);

        System.out.println(Arrays.toString(answer1)); // [4, 5, 3, 6, 2, 1]
        System.out.println(Arrays.toString(answer2)); // [36, 40, 20, 47, 10, 6, 7000, 10000]
    }
}