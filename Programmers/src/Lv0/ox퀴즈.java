package Lv0;

import java.util.Arrays;

class ox퀴즈 {
    public String[] solution(String[] quiz) {
        // 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz
        for(int i = 0; i < quiz.length; i++) {
            // 각각의 숫자 및 부호들을 따로따로 나누어(split) 배열에 담는다. 총 4개 (arr[0], arr[1], arr[2], arr[3])
            String[] arr = quiz[i].split(" ");
            // arr[1]에 있는 부호가 "+"가 맞으면 1을, "-"면 -1을 arr[2]의 값이랑 곱한 후, arr[0]의 값과 더해줌
            int result = Integer.parseInt(arr[0]) + (Integer.parseInt(arr[2]) * (arr[1].equals("+") ? 1 : -1));
            // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return
            quiz[i] = result == Integer.parseInt(arr[4]) ? "O": "X";
        }

        return quiz;
    }

    public static void main(String[] args) {
        String[] quiz1 = new String[]{"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        String[] answer1 = new ox퀴즈().solution(quiz1);
        String[] answer2 = new ox퀴즈().solution(quiz2);

        System.out.println(Arrays.toString(answer1)); // [X, O]
        System.out.println(Arrays.toString(answer2)); // [O, O, X, O]
    }
}