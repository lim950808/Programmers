package Lv0;

import java.util.Arrays;

class 문자열정렬하기1 {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")) // 알페벳 제거
                .sorted() // 정렬
                .mapToInt(Integer::parseInt) // int 배열로 변환
                .toArray(); // 배열(array)로 변환
    }

    public static void main(String[] args) {
        String myString1 = new String("hi12392");
        String myString2 = new String("p2o4i8gj2");
        String myString3 = new String("abcde0");

        int[] answer1 = new 문자열정렬하기1().solution(myString1);
        int[] answer2 = new 문자열정렬하기1().solution(myString2);
        int[] answer3 = new 문자열정렬하기1().solution(myString3);

        System.out.println(Arrays.toString(answer1)); // [1, 2, 2, 3, 9]
        System.out.println(Arrays.toString(answer2)); // [2, 2, 4, 8]
        System.out.println(Arrays.toString(answer3)); // [0]
    }
}