package Lv0;

class 제곱수판별하기 {
    public int solution(int n) {
        // 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
        // n이 제곱수라면 1을, 아니라면 2를 return
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        int answer1 = new 제곱수판별하기().solution(144);
        int answer2 = new 제곱수판별하기().solution(976);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 2
    }
}