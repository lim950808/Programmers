package Lv2;
//��ɰ���
class developmentOfFunction {
  public int[] solution(int[] progresses, int[] speeds) {
      int[] temp = new int[100]; //�۾��� ������ 100�� �����̹Ƿ� 100���� ����
      int day = 0; //temp�� ������ ������ ��
      
      //�� �׸񸶴� 100���� �˻��ؾ� �ϹǷ� for���ȿ� while���� ����.
      for(int i=0; i<progresses.length; i++) {
          while(progresses[i] + (speeds[i] * day) < 100) {
              day++;
          }
          temp[day]++;
      }
      
      int count = 0;
      
      //temp�� �� �迭�� ����
      //temp�� �ʱ⿡ 0���� ����Ǿ� �����Ƿ� 0�� �ƴ� ���� �����ϸ� ��.
      for(int n : temp) { //temp�迭 ���� �ϳ��� n�� ����
          if(n != 0) { //�迭 ���� 0�� �ƴ϶��
              count ++; //count ����
          }
      }
      
      int[] answer = new int[count]; //�迭 answer ����
     
      count = 0; //count 0 �ʱ�ȭ
      for(int n : temp) {
          if(n != 0) {
              answer[count++] = n; //answer �迭�� temp �� �ֱ�
          }
      }
      
      return answer;
  }
}