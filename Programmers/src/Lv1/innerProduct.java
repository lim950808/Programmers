package Lv1;
//���� (���Ϳ� ���͸� ���� ��Į�� ��� �ƿ�ǲ�� ����)
class innerProduct {
	
  public int solution(int[] a, int[] b) { //���̰� ���� a, b��� �Ű�����
	  
      int answer = 0;
      
      for(int i=0; i<a.length; i++) {
          answer += a[i]*b[i];
      }
      
      return answer; //a�� b�� "����"�� return
      
  }
  
}