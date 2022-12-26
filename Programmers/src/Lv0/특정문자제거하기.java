package Lv0;

class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        // my_string에서 letter를 제거한 문자열을 return
        return my_string.replaceAll(letter, "");
    }

    public static void main(String[] args) {
        String my_string1 = new String("abcdef");
        String my_string2 = new String("BCBdbe");

        String answer1 = new 특정문자제거하기().solution(my_string1, "f");
        String answer2 = new 특정문자제거하기().solution(my_string2, "B");

        System.out.println(answer1); // abcde
        System.out.println(answer2); // Cdbe
    }
}