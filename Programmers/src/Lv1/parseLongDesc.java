package Lv1;
import java.util.Arrays;
//���� ������������ ��ġ�ϱ�
class parseLongDesc {
  public long solution(long n) {
      long answer = 0;
      
      String data = String.valueOf(n);
      String arr[] = data.split("");

      // �迭 �������� ����
      Arrays.sort(arr);
      String str = "";

      // ������������ ���ĵǾ� �־� �ڿ������� ���� ��ġ��
      for(int i = arr.length-1; i >= 0; i--) {
           str+= arr[i];
      }

      answer = Long.parseLong(str);
      
      return answer;
  }
}