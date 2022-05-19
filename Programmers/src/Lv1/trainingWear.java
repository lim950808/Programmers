package Lv1;
import java.util.Arrays;
//ü����
class trainingWear {
  public int solution(int n, int[] lost, int[] reserve) {
      int answer = n - lost.length;
      
      Arrays.sort(lost);
      Arrays.sort(reserve);
      
      //���� ü������ ������ �л��� �������� ���
      for(int i=0; i<lost.length; i++) {
          for(int j=0; j<reserve.length; j++) {
              if(lost[i] == reserve[j]) {
                  answer++;
                  lost[i] = -1; //lost[i] �� ���� -1�� ������ �������� ��󿡼� ����
                  reserve[j] = -1; //reserve[j]�� ���� -1�� ����
                  break; 
              }
          }
      }
      
      //�������� �л����� ü������ �����ִ� ���
      for(int i=0; i<lost.length; i++) {
          for(int j=0; j<reserve.length; j++) {
              if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])) {
                  answer++;
                  reserve[j] = -1; //reserve[j]�� ���� -1�� ����
                  break; 
              }
          }
      }
      //lost[] �� reserve[] �迭�� ��Ұ��� 0 �� �ƴ� -1�� �������ִ� ������ 0���� �������� ��� lost[i]+1 �� ���� 1 �� �ǹǷ� if���� Ÿ�� �� ���ɼ��� �ֱ� ����.
      return answer;
  }
}