package Lv0;

class 유한소수판별하기 {
    public int solution(int a, int b) {
        // 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
        // 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
        // a/b가 유한소수이면 1을, 무한소수라면 2를 return

        int temp = b / gcd(a, b);

        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else if (temp % 5 == 0) {
                temp /= 5;
            } else {
                return 2; // 무한소수
            }
        }

        return 1; // 유한소수
    }

    // 최대공약수 GCD(Greatest Common Divisor)
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int result1 = new 유한소수판별하기().solution(7, 20);
        int result2 = new 유한소수판별하기().solution(11, 22);
        int result3 = new 유한소수판별하기().solution(12, 21);

        System.out.println(result1); // 1
        System.out.println(result2); // 1
        System.out.println(result3); // 2
    }
}