package Lv0;

class 다항식더하기 {
    public String solution(String polynomial) {
        // 덧셈으로 이루어진 다항식(한 개 이상의 항의 합으로 이루어진 식) polynomial
        String answer = "";
        String[] arr = polynomial.split(" +");
        int linear = 0; // 1차항
        int constant = 0; // 상수

        for (String s : arr) {
            if (s.equals("x")) { // x는 1x
                linear += 1;
            } else if (s.contains("x")) {
                linear += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                constant += Integer.parseInt(s);
            }
        }

        if (linear != 0 && constant == 0) {
            if (linear == 1) {
                answer += "x";
            } else {
                answer += linear + "x";
            }
        }

        if (linear != 0 && constant != 0) {
            if (linear == 1) {
                answer += "x" + " + " + constant;
            } else {
                answer += linear + "x" + " + " + constant;
            }
        }

        if (linear == 0 && constant != 0) {
            answer += constant; // 상수 더해주기
        }

        // 동류항끼리 더한 결괏값을 문자열로 return
        return answer;
    }

    public static void main(String[] args) {
        String answer1 = new 다항식더하기().solution("3x + 7 + x");
        String answer2 = new 다항식더하기().solution("x + x + x");

        System.out.println(answer1); // 4x + 7
        System.out.println(answer2); // 3x
    }
}