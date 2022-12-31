package Lv0;

class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            // 한자리 자연수만 다 더함.
            if (Character.digit(my_string.charAt(i), 10) > 0) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }

        // 문자열 my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
        // my_string 안의 모든 자연수들의 합을 return
        return answer;
    }

    public static void main(String[] args) {
        String my_string1 = new String("aAb1B2cC34oOp");
        String my_string2 = new String("1a2b3c4d123");

        int answer1 = new 숨어있는숫자의덧셈1().solution(my_string1);
        int answer2 = new 숨어있는숫자의덧셈1().solution(my_string2);

        System.out.println(my_string1 + " 안에 있는 한자리 자연수들의 합은 " + answer1 + "입니다."); // 10
        System.out.println(my_string2 + " 안에 있는 한자리 자연수들의 합은 " + answer2 + "입니다."); // 16
    }
}