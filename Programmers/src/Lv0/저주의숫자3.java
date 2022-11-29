package Lv0;

class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        // 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
        // n을 3x 마을에서 사용하는 숫자로 바꿔 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 저주의숫자3().solution(15);
        int answer2 = new 저주의숫자3().solution(40);

        System.out.println(answer1); // 25
        System.out.println(answer2); // 76
    }
}