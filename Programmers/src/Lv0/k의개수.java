package Lv0;

class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int n = i; n <= j; n++) {
            int num = n;
            while (num != 0) {
                if (num % 10 == k) {
                    answer++;
                }
                // num을 10으로 나눠서 그 몫을 다시 num에 대입
                num /= 10;
            }
        }

        // i부터 j까지 k가 몇 번 등장하는지 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new k의개수().solution(1, 13, 1);
        int answer2 = new k의개수().solution(10, 50, 5);
        int answer3 = new k의개수().solution(3, 10, 2);

        System.out.println(answer1); // 6
        System.out.println(answer2); // 5
        System.out.println(answer3); // 0
    }
}