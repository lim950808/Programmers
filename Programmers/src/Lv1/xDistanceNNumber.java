package Lv1;
//x��ŭ ������ �ִ� n���� ����
class xDistanceNNumber {
  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      long temp = x;
      
      for(int i=0; i<n; i++) { //���� n�� ���ϴ� ����Ʈ ����
          answer[i] = temp * (i+1); //x���� ������ x�� ����
      }
      return answer;
  }
}