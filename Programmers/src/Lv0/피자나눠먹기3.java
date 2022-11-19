package Lv0;

class 피자나눠먹기3 {
    public int solution(int slice, int n) {
        // 피자 조각 수 slice
        // 피자를 먹는 사람의 수 n
        // n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지
        int answer = (n % slice) == 0 ? (n / slice) : ((n / slice) + 1);
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 피자나눠먹기3().solution(7, 10);
        int answer2 = new 피자나눠먹기3().solution(4, 12);

        System.out.println(answer1); // 2
        System.out.println(answer2); // 3
    }
}