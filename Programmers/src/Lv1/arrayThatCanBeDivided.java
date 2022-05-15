package Lv1;
import java.util.*;
//������ �������� ���� �迭
class arrayThatCanBeDivided {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {}; //int[] Ÿ������ ��ȯ�� answer ������ �ʱ�ȭ.
      ArrayList<Integer> a = new ArrayList<Integer>(); //ArrayList�� a1�� Integer Ÿ������ ����.
      
      //for ���� ����Ͽ� arr �迭�� �ִ� ���Ҹ� divisor�� �������� �� �������� 0�� ���Ҹ� add�� ����Ͽ� a1�� �߰�.
      for(int i = 0; i <arr.length; i++) {
          if(arr[i]%divisor == 0) {
              a.add(arr[i]);
          }
      }
      
      //a1�� ������� ���(�������� �� �������� 0�� �ƴ� ���) a1�� add�� �̿��Ͽ� -1�� �߰�.
      if(a.isEmpty()) {
          a.add(-1);
      }
      
      //answer�� ũ�⸦ a1�� size ��ŭ���� ����
      answer = new int[a.size()];
      
      //for���� ����Ͽ� a1�� �ִ� ���Ҹ� get���� ������ answer�� ����
      for(int i = 0; i<a.size() ; i++) {
          answer[i] = a.get(i);
      }
      
      Arrays.sort(answer); //Arrays.sort�� �̿��� ����
      return answer;
  }
}