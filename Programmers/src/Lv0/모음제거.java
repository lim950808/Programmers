package Lv0;

class 모음제거 {
    public String solution(String my_string) {
        // 영어 모음(aeiou)들을 모두 빈 문자열로 replace
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        String my_string1 = new 모음제거().solution("bus");
        String my_string2 = new 모음제거().solution("nice to meet you");

        System.out.println(my_string1); // bs
        System.out.println(my_string2); // nc t mt y
    }
}