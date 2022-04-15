package Lv1;
//�Ҽ� ã�� (�����佺�׳׽��� ü ���)
class findingDecimal {
  public int solution(int n) {
      int answer = 0;
      boolean[] decimal = new boolean [n+1];
      
      for(int i=2; i<=n; i++)
          decimal[i] = true; //2~n��° ���� true�� �ʱ�ȭ
      
      //������ ���ϱ�
      int root = (int)Math.sqrt(n);
      
      for(int i=2; i<=root; i++) { //2~��Ʈn���� �˻�
          if(decimal[i] == true) { //i��°�� ���� �Ҽ��� ��
              for(int j=i; i*j<=n; j++) //�� ������� �� false�� �ʱ�ȭ (����� �Ҽ��� �ƴϱ� ������)
                  decimal[i*j] = false;
          }
      }
      for(int i=2; i<=n; i++) {
          if(decimal[i] == true) //�Ҽ��� ���� ����
              answer++;
      }
      return answer;
  }
}