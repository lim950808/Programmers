package Lv0;

class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c); // 대문자는 소문자로 변환
            } else {
                answer += Character.toUpperCase(c); // 소문자는 대문자로 변환
            }
        }

        // 대문자는 소문자로, 소문자는 대문자로 변환한 문자열을 return
        return answer;
    }

    public static void main(String[] args) {
        String my_String1 = new 대문자와소문자().solution("cccCCC");
        String my_String2 = new 대문자와소문자().solution("abCdEfghIJ");

        System.out.println(my_String1); // CCCccc
        System.out.println(my_String2); // ABcDeFGHij
    }
}
