package Lv0;

import java.util.Arrays;

class 배열원소의길이 {
    public int[] solution(String[] strList) {
        // strlist 각 원소의 길이를 담은 배열을 retrun
        return Arrays
                .stream(strList) // 스트림 생성
                .mapToInt(String::length) // 스트림 객체를 String 타입 스트림으로 변환
                .toArray(); // 배열로 변환
    }

    public static void main(String[] args) {
        String[] strList1 = new String[] {"We", "are", "the", "world!"};
        String[] strList2 = new String[] {"I", "Love", "Programmers."};

        int[] answer1 = new 배열원소의길이().solution(strList1);
        int[] answer2 = new 배열원소의길이().solution(strList2);

        System.out.println(Arrays.toString(answer1)); // [2, 3, 3, 6]
        System.out.println(Arrays.toString(answer2)); // [1, 4, 12]
    }
}