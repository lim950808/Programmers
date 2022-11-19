package Lv0;

class 숫자비교하기 {
    public int solution(int num1, int num2) {
        int answer = num1 == num2 ? 1 : -1;;
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 숫자비교하기().solution(2, 3);
        int answer2 = new 숫자비교하기().solution(11, 11);
        int answer3 = new 숫자비교하기().solution(7, 99);
        System.out.println(answer1); // -1
        System.out.println(answer2); // 1
        System.out.println(answer3); // -1
    }
}
