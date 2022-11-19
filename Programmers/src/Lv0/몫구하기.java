package Lv0;

class 몫구하기 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 몫구하기().solution(10, 5);
        int answer2 = new 몫구하기().solution(7, 2);
        System.out.println(answer1); // 2
        System.out.println(answer2); // 3
    }
}