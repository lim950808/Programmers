package Lv0;

class 숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;

        // my_string은 소문자, 대문자, 자연수로만 구성
        // 소문자, 대문자를 모두 ""으로 변환 후 각 요소를 "" 마다 split함
        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String a : arr) { // 배열을 돌면서
            if (!a.equals("")) { // ""이 아니면 (문자가 아닌 숫자면)
                answer += Integer.valueOf(a); // Integer.valueOf() : Integer형으로 변환
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string1 = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123Z";

        int answer1 = new 숨어있는숫자의덧셈2().solution(my_string1);
        int answer2 = new 숨어있는숫자의덧셈2().solution(my_string2);

        System.out.println(answer1); // 37
        System.out.println(answer2); // 133
    }
}