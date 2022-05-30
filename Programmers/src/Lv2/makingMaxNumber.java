package Lv2;
//ū �� �����
class makingMaxNumber {
  public String solution(String number, int k) {
      
      StringBuilder answer = new StringBuilder();
      // ���� ū ���� �ε��� ����.
      int idx = 0;
      // ������ �ϴ� �ڸ� ��, ������ ��.
      int scope = number.length() - k; 
      
      // 1. �� �ڸ� ���� �ݺ��ϴ� �ݺ���
      for(int i = 1; i<=scope; i++) {
          // 2. �ִ� ����.
          int max = Integer.MIN_VALUE;
          // 3. �� �ڸ� ���� ���ϱ� ���� ������ ������ Ž���ϴ� �ݺ���, ���� ���ڿ��� ���� - (������ �ϴ� �ڸ� �� - ���� ����� �ִ� �ڸ� ��) 
          for(int j = 0; j<number.length() - (scope-i); j++) {
              // 4. 9�� �ٷ� �ִ� ����.
              if((number.charAt(j) - '0') == 9) {
                  max = 9;
                  idx = j;
                  break;
              }
              
              // 5. �ִ��� ã�´�.
              if(max < (number.charAt(j) - '0')) {
                  max = number.charAt(j) - '0';
                  idx = j;
              }                    
          }
          // 6. ã�� �ִ��� StringBuilder�� �̾� ���δ�.
          answer.append(max);
          // 7. �ִ��� �ε��� ~ ���� ���ڿ��� ������������ ������ ���ο� ���ڿ��� �����Ѵ�.
          number = number.substring(idx+1, number.length());                       
      }
      
      return answer.toString();
  }
}