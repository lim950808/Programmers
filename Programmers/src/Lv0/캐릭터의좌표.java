package Lv0;

import java.util.Arrays;

class 캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        // 캐릭터는 항상 [0,0]에서 시작
        // [0, 0]은 board의 정 중앙에 위치
        int[] answer = {0, 0};

        // up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left"))
                answer[0] -= answer[0] >- (board[0] / 2) ? 1 : 0;
            else if (keyinput[i].equals("right"))
                answer[0] += answer[0] < (board[0] / 2) ? 1 : 0;
            else if (keyinput[i].equals("down"))
                answer[1] -= answer[1] >- (board[1] / 2) ? 1 : 0;
            else if (keyinput[i].equals("up"))
                answer[1] += answer[1] < (board[1] / 2) ? 1 : 0;
        }

        // 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return
        return answer;
    }

    public static void main(String[] args) {
        String[] keyinput1 = new String[] {
                "left", "right", "up", "right", "right"
        };
        String[] keyinput2 = new String[] {
                "down", "down", "down", "down", "down"
        };

        int[] board1 = new int[]{11, 11};
        int[] board2 = new int[]{7, 9};

        int[] answer1 = new 캐릭터의좌표().solution(keyinput1, board1);
        int[] answer2 = new 캐릭터의좌표().solution(keyinput2, board2);

        System.out.println(Arrays.toString(answer1)); // [2, 1]
        System.out.println(Arrays.toString(answer2)); // [0, -4]
    }
}