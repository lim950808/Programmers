package Lv0;

import java.util.Arrays;

class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        // count : 배열 내 요소 수
        int count = (my_str.length() + n - 1) / n;
        String[] answer = new String[count];

        for (int i = 0; i < count; i++) {
            // 시작 인덱스
            int start = n * i;
            // 마지막 인덱스
            int end = start + n >= my_str.length() ? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
        }

        // 문자열 my_str을 길이 n씩 잘라서 저장한 배열을 return
        return answer;
    }

    public static void main(String[] args) {
        String my_str1 = "abc1Addfggg4556b";
        String my_str2 = "abcdef123";

        String[] answer1 = new 잘라서배열로저장하기().solution(my_str1, 6);
        String[] answer2 = new 잘라서배열로저장하기().solution(my_str2, 3);

        System.out.println(Arrays.toString(answer1)); // [abc1Ad, dfggg4, 556b]
        System.out.println(Arrays.toString(answer2)); // [abc, def, 123]
    }
}