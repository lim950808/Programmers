package Lv0;

class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000; // 산술 변환
        return (int)answer;
    }

    public static void main(String[] args) {
        int answer1 = new 두수의나눗셈().solution(3, 2);
        int answer2 = new 두수의나눗셈().solution(7, 3);
        int answer3 = new 두수의나눗셈().solution(1, 16);
        System.out.println(answer1); // 1500
        System.out.println(answer2); // 2333
        System.out.println(answer3); // 62
    }
}