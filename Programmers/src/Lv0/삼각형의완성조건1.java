package Lv0;

import java.util.Arrays;

class 삼각형의완성조건1 {
    public int solution(int[] sides) {
        // sides 배열 오름차순 정렬
        Arrays.sort(sides);

        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 함.
        // 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }

    public static void main(String[] args) {
        int[] sides1 = new int[]{1, 2, 3};
        int[] sides2 = new int[]{3, 6, 2};
        int[] sides3 = new int[]{199, 72, 222};

        int answer1 = new 삼각형의완성조건1().solution(sides1);
        int answer2 = new 삼각형의완성조건1().solution(sides2);
        int answer3 = new 삼각형의완성조건1().solution(sides3);

        System.out.println(answer1); // 2
        System.out.println(answer2); // 2
        System.out.println(answer3); // 1
    }
}