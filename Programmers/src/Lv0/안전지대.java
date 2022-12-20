package Lv0;

class 안전지대 {
    public int solution(int[][] board) {
        // 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류
        // 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재
        // 지뢰가 매설된 지역의 지도 board
        // 안전한 지역의 칸 수를 return

        int answer = 0;

        // 길이를 2 늘린 액자용 배열 생성하여 단순한 조건식으로 안전지대를 구할 수 있음
        int[][] temp = new int[board.length+2][board.length+2];

        // 액자에 board 넣기
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board.length + 1 ;j++) {
                temp[i][j] = board[i-1][j-1];
            }
        }

        // 위험지역 찾기
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board.length + 1; j++) {
                if (temp[i][j] == 1) {
                    for (int a = i - 1; a <= i + 1; a++) {
                        for (int b = j - 1; b <= j + 1; b++) {
                            if (temp[a][b] != 1) temp[a][b] = 2;
                        }
                    }
                }
            }
        }

        // 안전지대 찾기
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board.length + 1; j++) {
                if (temp[i][j] == 0) answer++;
            }
        }

        // 안전한 지역의 칸 수를 return
        return answer;
    }

    public static void main(String[] args) {
        int[][] board1 = new int[][] {
                {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}
        };
        int[][] board2 = new int[][] {
                {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}
        };
        int[][] board3 = new int[][] {
                {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}
        };

        int answer1 = new 안전지대().solution(board1);
        int answer2 = new 안전지대().solution(board2);
        int answer3 = new 안전지대().solution(board3);

        System.out.println(answer1); // 16
        System.out.println(answer2); // 13
        System.out.println(answer3); // 0
    }
}