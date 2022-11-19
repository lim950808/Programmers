package Lv0;

class 편지 {
    public int solution(String message) {
        // 글자 한 자 한 자를 가로 2cm 크기로 적는다.
        int answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] args) {
        int answer = new 편지().solution("happy birthday!"); // 30
//        int answer = new 편지().solution("I love you~"); // 22

        System.out.println(answer);
    }
}