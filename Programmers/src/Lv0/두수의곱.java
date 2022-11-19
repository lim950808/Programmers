package Lv0;

class 두수의곱 {
    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 두수의곱().solution(4, 3);
        int answer2 = new 두수의곱().solution(27, 19);
        System.out.println(answer1); // 12
        System.out.println(answer2); // 513
    }
}