package Lv0;

class 양꼬치 {
    public int solution(int n, int k) {
        // 양꼬치(n*12000) + 음료수(k*2000) - (10인분 이상이면 음료수 1개 서비스)
        return (n * 12000) + (k * 2000) - (n / 10 * 2000);
    }

    public static void main(String[] args) {
        int answer1 = new 양꼬치().solution(10,3);
        int answer2 = new 양꼬치().solution(64,6);

        System.out.println(answer1); // 124000
        System.out.println(answer2); // 768000
    }
}