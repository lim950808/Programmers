package Lv1;

import java.util.Stack;

//ũ���� �����̱� ����
public class clawCraneGame {
	public int solution(int[][] board, int[] moves) {
	  int answer = 0;
	
	  Stack<Integer> stack = new Stack<>(); //�ٱ��� ������ ���� stack�� �غ�.
	  stack.push(0); //0�� �ִ� ������ stack�� �� �� ���� ���ؾ��ϴµ� �ƹ��͵� ������ ������ ���� ����.
	
	  for (int move : moves) { //moves�� ���̸�ŭ for��.
	    for (int j = 0; j < board.length; j++) { //board�� ���̸�ŭ for��. �ش� ���ο��� ������ �̱�.
	      if (board[j][move - 1] != 0) { //0�� �ƴ϶��
	        if (stack.peek() == board[j][move - 1]) { //Stack(�ٱ���)�� ���� �� ��ҿ� board[j][move - 1]�� ������ ��.
	          stack.pop(); //���ٸ� ������ ������ ���̱� ������ Stack�� pop�ϰ�
	          answer += 2; //answer�� 2�� ����.
	        }else {
	         stack.push(board[j][move - 1]); //�ٸ��ٸ� Stack�� board[j][move - 1]�� push.
	        }
	        board[j][move - 1] = 0; //���� board[j][move - 1]�� 0�̶�� ������ ���� ���̱� ������ �Ѿ.
	        break;
	      }
	    }
	  }
	  return answer;
	}
}