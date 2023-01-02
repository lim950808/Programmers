package Lv0;

class 암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";

        // 암호화된 문자열 cipher
        // 그 문자열에서 code의 배수 번째 글자만 진짜 암호

        // int i = code이므로 i = i + code를 통해 code의 배수 번째 글자만 가져옴
        for (int i = code; i <= cipher.length(); i = i + code) {
            // .substring(x, y) : 배열의 x번째에서 y번째까지의 값을 가져옴
            answer += cipher.substring(i - 1, i);
        }

        // 해독된 암호 문자열을 return
        return answer;
    }

    public static void main(String[] args) {
        String cipher1 = "dfjardstddetckdaccccdegk";
        String cipher2 = "pfqallllabwaoclk";

        int code1 = 4;
        int code2 = 2;

        String answer1 = new 암호해독().solution(cipher1, code1);
        String answer2 = new 암호해독().solution(cipher2, code2);

        System.out.println(answer1); // attack
        System.out.println(answer2); // fallback
    }
}