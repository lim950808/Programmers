package Lv0;

import java.util.Stack;

class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;

        // Stack의 가장 큰 특징은 나중에 들어간 것이 먼저 나오는 (Last In First Out)의 형태
        Stack<Integer> stack = new Stack<>();

        // 숫자와 "Z"가 공백으로 구분되어 담긴 문자열 s
        // 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                stack.pop(); // .pop() : stack에 값 제거
            } else {
                stack.push(Integer.parseInt(str)); // .push() : stack에 값 추가
            }
        }

        for (int i : stack) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = new String("1 2 Z 3");
        String s2 = new String("10 20 30 40");
        String s3 = new String("10 Z 20 Z 1");
        String s4 = new String("10 Z 20 Z");
        String s5 = new String("-1 -2 -3 Z");

        int answer1 = new 컨트롤제트().solution(s1);
        int answer2 = new 컨트롤제트().solution(s2);
        int answer3 = new 컨트롤제트().solution(s3);
        int answer4 = new 컨트롤제트().solution(s4);
        int answer5 = new 컨트롤제트().solution(s5);

        System.out.println(s1 + " 중 Z 앞에 오는 숫자를 제외한 모든 수를 더한 값은 " + answer1 + "입니다."); // 4
        System.out.println(s2 + " 중 Z 앞에 오는 숫자를 제외한 모든 수를 더한 값은 " + answer2 + "입니다."); // 100
        System.out.println(s3 + " 중 Z 앞에 오는 숫자를 제외한 모든 수를 더한 값은 " + answer3 + "입니다."); // 1
        System.out.println(s4 + " 중 Z 앞에 오는 숫자를 제외한 모든 수를 더한 값은 " + answer4 + "입니다."); // 0
        System.out.println(s5 + " 중 Z 앞에 오는 숫자를 제외한 모든 수를 더한 값은 " + answer5 + "입니다."); // -3
    }
}