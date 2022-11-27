package Lv0;

import java.util.Arrays;

class A로B만들기 {
    public int solution(String before, String after) {
        // toCharArray() : 문자열(String)을 char형 배열로 변환
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();

        // Arrays.sort() : 배열 오름차순 정렬
        Arrays.sort(b);
        Arrays.sort(a);

        // before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return
        // a와 b가 같으면 1, 다르면 0
        return new String(b).equals(new String(a)) ? 1 : 0;
    }

    public static void main(String[] args) {
        int answer1 = new A로B만들기().solution("olleh", "hello");
        int answer2 = new A로B만들기().solution("allpe", "apple");

        System.out.println(answer1); // 1
        System.out.println(answer2); // 0
    }
}