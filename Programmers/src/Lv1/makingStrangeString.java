package Lv1;
//�̻��� ���� �����
class makingStrangeString {
  public String solution(String s) {
      String answer = "";
      String[] str = s.split(""); //s�� �ѱ��ھ� �߶� �迭�� ����
      int index=0; //Ȧ,¦ �ڸ����� ��Ÿ���� ���� ���� index���

      for(int i=0; i<str.length; i++) {
          if(str[i].equals(" ")){ //���� ���� �ڸ����� 0���� ���ư��� ������ ���� Ȯ�� �� index�� �ʱ�ȭ
              str[i]=" ";
              index=0;
          }else {
              if(index%2 == 0) { //index�� ¦���̸� �빮�ڷ� ��ȯ
                  str[i]=str[i].toUpperCase();
                  index++;
              }
              else if(index%2 != 0) { //index�� Ȧ�� �̸� �ҹ��ڷ� ��ȯ
                  str[i]=str[i].toLowerCase();
                  index++;
              }
          }
      answer= answer+str[i]; //��ȯ�� ���ڸ� ����
      }
  return answer;
  }
}