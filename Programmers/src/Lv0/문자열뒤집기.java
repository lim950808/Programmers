package Lv0;

class 문자열뒤집기 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String answer1 = new 문자열뒤집기().solution("jaron");
        String answer2 = new 문자열뒤집기().solution("bread");
        System.out.println(answer1); // noraj
        System.out.println(answer2); // daerb
    }
}
