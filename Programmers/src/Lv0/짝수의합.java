package Lv0;

class 짝수의합 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 짝수의합().solution(10);
        int answer2 = new 짝수의합().solution(4);
        System.out.println(answer1); // 30
        System.out.println(answer2); // 6
    }
}