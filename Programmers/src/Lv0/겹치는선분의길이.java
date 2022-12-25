package Lv0;

class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        // -100 ≤ a < b ≤ 100
        int[] arr = new int[201];
        int mid = 100;

        // 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines
        for (int[] line : lines) {
            int max = Math.max(mid + line[0], mid + line[1]); // 최대값
            int min = Math.min(mid + line[0], mid + line[1]); // 최소값
            for (int i = min; i < max; i++) {
                arr[i]++;
            }
        }

        int answer = 0;

        // 두 개 이상의 선분이 겹치는 부분의 길이를 return
        for (int a : arr) {
            if (a >= 2) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] lines1 = new int[][] {
                {0, 1}, {2, 5}, {3, 9}
        };
        int[][] lines2 = new int[][] {
                {-1, 1}, {1, 3}, {3, 9}
        };
        int[][] lines3 = new int[][] {
                {0, 5}, {3, 9}, {1, 10}
        };

        int answer1 = new 겹치는선분의길이().solution(lines1);
        int answer2 = new 겹치는선분의길이().solution(lines2);
        int answer3 = new 겹치는선분의길이().solution(lines3);

        System.out.println(answer1); // 2
        System.out.println(answer2); // 0
        System.out.println(answer3); // 8
    }
}
