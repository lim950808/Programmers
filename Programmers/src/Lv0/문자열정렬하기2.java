package Lv0;

import java.util.Arrays;

class 문자열정렬하기2 {
    public String solution(String my_string) {
        // my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        String my_string1 = new String("Bcad");
        String my_string2 = new String("heLLo");
        String my_string3 = new String("Python");

        String answer1 = new 문자열정렬하기2().solution(my_string1);
        String answer2 = new 문자열정렬하기2().solution(my_string2);
        String answer3 = new 문자열정렬하기2().solution(my_string3);

        System.out.println(answer1); // abcd
        System.out.println(answer2); // ehllo
        System.out.println(answer3); // hnopty
    }
}