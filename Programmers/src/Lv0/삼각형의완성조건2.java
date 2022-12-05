package Lv0;

import java.util.Arrays;

class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
        int answer = Math.min(sides[0], sides[1]) + (sides[0] + sides[1]) - Math.max(sides[0], sides[1]) - 1;

        // 나머지 한 변이 될 수 있는 정수의 개수를 return
        return answer;
    }

    public static void main(String[] args) {
        int[] sides1 = new int[]{1, 2};
        int[] sides2 = new int[]{3, 6};
        int[] sides3 = new int[]{11, 7};

        int answer1 = new 삼각형의완성조건2().solution(sides1);
        int answer2 = new 삼각형의완성조건2().solution(sides2);
        int answer3 = new 삼각형의완성조건2().solution(sides3);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 5
        System.out.println(answer3); // 13
    }
}