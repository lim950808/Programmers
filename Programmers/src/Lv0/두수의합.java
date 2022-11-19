package Lv0;

class 두수의합 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 두수의합().solution(2, 3);
        int answer2 = new 두수의합().solution(100, 2);
        System.out.println(answer1); // 5
        System.out.println(answer2); // 102
    }
}