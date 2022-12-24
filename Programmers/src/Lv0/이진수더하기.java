package Lv0;

class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        // 이진수를 의미하는 두 개의 문자열 bin1과 bin2
        // 두 이진수의 합을 return
        // .toBinaryString() : 정수를 2진수로 변환
        // Integer.parseInt(bin1, 2) : 2진수인 문자열 bin2를 정수로 변환
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }

    public static void main(String[] args) {
        String answer1 = new 이진수더하기().solution("10", "11");
        String answer2 = new 이진수더하기().solution("1001", "1111");

        System.out.println(answer1); // 101
        System.out.println(answer2); // 11000
    }
}