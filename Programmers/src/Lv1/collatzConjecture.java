package Lv1;
//�ݶ��� ����
class collatzConjecture {
  public int solution(int num) {
      int answer = 0;
      int a = num;
      
      while(a != 1 && answer != 500){ //a�� 1�� �ƴϸ鼭 answer�� 500�� �Ǳ� ������ while���� �ݺ�.
          if(a % 2 == 0) { //a % 2 �� 0�̸� a / 2�� a�� ����.
              a = a/2;
          } else if(a %2==1) { //a % 2 �� 1�̸� (a * 3) + 1�� a�� ����.
              a = (a*3) + 1;
          }
          answer++; //�ѹ� �ݺ��� ������ answer�� 1�� ����.
      }
      if(answer == 500) { //���� answer�� 500�� ��� answer�� -1�� ����
          answer = -1;
      }
      
      return answer;
  }
}