package Lv0;

class 나머지구하기 {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 나머지구하기().solution(3, 2);
        int answer2 = new 나머지구하기().solution(10, 5);
        System.out.println(answer1); // 1
        System.out.println(answer2); // 0
    }
}
