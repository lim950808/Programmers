package Lv0;

class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = 0;

        // 정수가 담긴 배열 array와 정수 n
        for (int num : array) {
            if (num == n) answer++;
        }

        // array에 n이 몇 개 있는 지를 return
        return answer;
    }
}