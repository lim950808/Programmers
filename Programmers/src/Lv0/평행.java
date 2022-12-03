package Lv0;

class 평행 {
    public double slope(int[] dot1, int[] dot2) {
        // 기울기(slope) 구하는 공식 : (y2 - y1) / (x2 - x1)
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }

    // 점 네 개의 좌표를 담은 이차원 배열 dots
    public int solution(int[][] dots) {
        int answer = 0;

        // 두 직선이 평행이 되는 경우가 있으면 1을 return
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3]) // (0, 1), (2, 3)
                || slope(dots[0], dots[2]) == slope(dots[1], dots[3]) // (0, 2), (1, 3)
                || slope(dots[0], dots[3]) == slope(dots[1], dots[2])) { // (0, 3), (1, 2)
            return 1;
        }

        // 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return
        return answer;
    }

    public static void main(String[] args) {
        int[][] dots1 = new int[][] {
                {1,4}, {9,2}, {3,8}, {11,6}
        };
        int[][] dots2 = new int[][] {
                {3,5}, {4,1}, {2,4}, {5,10}
        };

        int answer1 = new 평행().solution(dots1);
        int answer2 = new 평행().solution(dots2);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 0
    }
}