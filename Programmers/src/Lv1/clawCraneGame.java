package Lv1;

import java.util.Stack;

//크레인 인형뽑기 게임
public class clawCraneGame {
	public int solution(int[][] board, int[] moves) {
	  int answer = 0;
	
	  Stack<Integer> stack = new Stack<>(); //바구니 역할을 해줄 stack을 준비.
	  stack.push(0); //0을 넣는 이유는 stack의 맨 위 값과 비교해야하는데 아무것도 없으면 오류가 나기 때문.
	
	  for (int move : moves) { //moves의 길이만큼 for문.
	    for (int j = 0; j < board.length; j++) { //board의 길이만큼 for문. 해당 라인에서 인형을 뽑기.
	      if (board[j][move - 1] != 0) { //0이 아니라면
	        if (stack.peek() == board[j][move - 1]) { //Stack(바구니)의 가장 윗 요소와 board[j][move - 1]가 같은지 비교.
	          stack.pop(); //같다면 인형이 터지는 것이기 때문에 Stack에 pop하고
	          answer += 2; //answer에 2를 더함.
	        }else {
	         stack.push(board[j][move - 1]); //다르다면 Stack에 board[j][move - 1]를 push.
	        }
	        board[j][move - 1] = 0; //만약 board[j][move - 1]이 0이라면 인형이 없는 것이기 때문에 넘어감.
	        break;
	      }
	    }
	  }
	  return answer;
	}
}