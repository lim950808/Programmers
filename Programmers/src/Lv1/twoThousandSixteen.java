package Lv1;
//2016
public class twoThousandSixteen {

	public String solution(int a, int b) {
		
	      int total = 0; 
	      //�� �ϼ�
	      
	      String day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	      //����(day)�� ���ڿ��� �迭
	      
	      int date[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      //2016�� �ſ� ������ ����(date)
	      
	      for(int i = 0; i < a-1; i++) {
	          total += date[i];
	      } //1������ ��¥�� ����
	      
	      total += b-1;
	      //�Ű����� b�� ���� ������ ������.
	      
	      String answer = day[total%7];
	      //7�� ���� �������� ���� �޶����� day(����) �迭�� answer�� ������.
	      
	      return answer;
	      //�ش� ���� ���
	  }
	
}