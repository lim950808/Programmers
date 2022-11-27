package Lv0;

class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int x = 0; // 가로
        int y = 0; // 세로

        // 2차원 좌표 평면에 변이 축과 평행한 직사각형
        // 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots
        // dots의 길이 = 4
        for (int i = 1; i < 4; i++) {
            // Math.abs() : 인자값의 대한 절댓값 반환
            int a = Math.abs(dots[i-1][0] - dots[i][0]);
            int b = Math.abs(dots[i-1][1] - dots[i][1]);
            // Math.max(a, x) : a와 x를 비교해 최댓값 반환
            x = Math.max(a, x);
            y = Math.max(b, y);
        }

        // 직사각형의 넓이(가로 x 세로)를 return
        return x * y;
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[][] {
                {1, 1}, {2, 1}, {2, 2}, {1, 2}
        };
        int[][] arr2 = new int[][] {
                {-1, -1}, {1, 1}, {1, -1}, {-1, 1}
        };

        int answer1 = new 직사각형넓이구하기().solution(arr1);
        int answer2 = new 직사각형넓이구하기().solution(arr2);

        System.out.println("직사각형의 넓이는 " + answer1 + "입니다."); // 1
        System.out.println("직사각형의 넓이는 " + answer2 + "입니다."); // 4
    }
}