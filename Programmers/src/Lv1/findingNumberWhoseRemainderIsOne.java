package Lv1;
//�������� 1�� �Ǵ� �� ã��
class findingNumberWhoseRemainderIsOne {
  public int solution(int n) {
      int answer = 0;
      
      for(int i=2; i<n; i++) { //i�� ���۰� 2
          if(n%i == 1) { //�������� 1
              answer = i;
              break;
          }
      }
      return answer;
  }
}