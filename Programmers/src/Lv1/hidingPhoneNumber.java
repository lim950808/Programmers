package Lv1;
//�ڵ��� ��ȣ ������
class hidingPhoneNumber {
  public String solution(String phone_number) {
      String answer = "";
      
      for(int i=0; i<phone_number.length(); i++) {
          if(i < phone_number.length()-4) {
              answer += "*";
          }else {
              answer += phone_number.charAt(i);
          }
      }
      return answer; //��ȭ��ȣ �� 4�ڸ� ���� ������ ���ڸ� ���� "*"���� ���� ���ڿ� ����.
  }
}