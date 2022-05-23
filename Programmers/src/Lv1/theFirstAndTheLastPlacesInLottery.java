package Lv1;
//�ζ��� �ְ� ������ ���� ����
class theFirstAndTheLastPlacesInLottery {
  public int[] solution(int[] lottos, int[] win_nums) {
  	//1. ��÷��ȣ�� ���� ��ġ�ϴ� ������ ���� cnt�� ������ ������ �˾ƺ��� ���ϰ� �� ��ȣ�� ������ ���� zeroCnt �� ������ 0���� �ʱ�ȭ
      int cnt = 0;
      int zeroCnt = 0;
      for(int lotto: lottos){
      	//2. �ο��� �ζǹ�ȣ�� foreach�� ������ item�� 0�̸� zeroCnt�� ���� 1�� �������� �־��� �ٷ� ���� item�� �˻��ϵ��� continue
          if(lotto == 0) {
              zeroCnt ++;
              continue;
          }
          for(int win_num:win_nums){
          	//3. item�� 0�� �ƴϸ� �Ʒ��� ������ ��÷��ȣ�� �ο��� ��ȣ�� ���� ��ġ�ϸ� cnt�� 1�� ���������־����� ������ �μ��� ���� ��ȣ�� �����ֱ� ���� break�� ��������
              if(win_num == lotto){
                  cnt ++;
                  break;
              }
          }
      }
      //4. �ְ� ������ Math.max(cnt+zeroCnt,1)�� ����� �μ��� ���� ��ȣ���� ������ ���� �������� �ʾ��� �� ��÷��ȣ�� ���� ��� ��ȣ�� ��ġ���� ���� ��� cnt+zeroCnt�� 0�� �ǹǷ� Math.max�� ���� 0�϶��� ������ 1�� �ǰԲ� �������־����� ���� ������ Math.max(cnt,1)�� ���� ���� ��ȣ�� cnt�� 0�ϰ�� �� ������ 1�� �ǰԲ� �������־���. �׸���� cnt�� ���� �� �ִ� 0������ 6�������� ����� ������ ����� ���ϱ� ���� ��� Math.max�� ������ ���ڸ� 7���� ���־���.
      return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
  }
}