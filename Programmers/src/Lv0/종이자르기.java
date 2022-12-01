package Lv0;

class 종이자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;

        // M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 종이자르기().solution(2, 2);
        int answer2 = new 종이자르기().solution(2, 5);
        int answer3 = new 종이자르기().solution(1, 1);

        System.out.println(answer1); // 3
        System.out.println(answer2); // 9
        System.out.println(answer3); // 0   // 이미 1 * 1 크기이므로 0을 return
    }
}