package Lv0;

class 문자열안에문자열 {
    public int solution(String str1, String str2) {
        // str1 안에 str2가 있다면 1을 없다면 2를 return
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        int answer1 = new 문자열안에문자열().solution("ab6CDE443fgh22iJKlmn1o", "6CD");
        int answer2 = new 문자열안에문자열().solution("ppprrrogrammers", "pppp");

        System.out.println(answer1); // 1
        System.out.println(answer2); // 2
    }
}