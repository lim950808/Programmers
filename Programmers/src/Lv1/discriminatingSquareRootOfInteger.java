package Lv1;
//���� ������ �Ǻ�
class discriminatingSquareRootOfInteger {
  public long solution(long n) {        
      long sqrt = (long)Math.sqrt(n); //Math.sqrt(n)�� ���� �������� ã�´�.

      if (Math.pow(sqrt, 2) == n) {
          return (long)Math.pow(sqrt + 1, 2); //Math.pow()�� ����Ͽ� �����ѵ� ��
      }else {
          return -1; //n�� � ���� ���� x�� �����̶��, 1���� ã�� �����ٿ� 1�� ���� �� �����Ͽ� ����, �ƴ� �� -1�� ����
      }
  }
}