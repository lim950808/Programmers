package Lv0;

class 세균증식 {
    public int solution(int n, int t) {
        // 처음 세균의 마리수 n
        // 경과한 시간 t
        // 세균은 1시간에 두배만큼 증식
        // t시간 후 세균의 수를 return

        // 비트 시프트 연산자 << : 피연산자의 비트열을 왼쪽으로 이동시키며 이동에 따른 빈공간은 0으로 채움.
        return n << t;
    }

    public static void main(String[] args) {
        int answer1 = new 세균증식().solution(2, 10);
        int answer2 = new 세균증식().solution(7, 15);

        System.out.println(answer1); // 2048
        System.out.println(answer2); // 229376
    }
}