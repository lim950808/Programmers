package Lv1;
//[1��] �������
class secretMap {
  // 1. ������ ��ȯ �޼ҵ� �� �ڸ��� n�� �°� 0�� ä���.
  public static String cal(int n,int len) {
      String str="";
      
      // 1-1. ������ ��ȯ.
      while(n != 0) {
          str = n%2 + str;
          n/=2;
      }
      
      // 1-2. n �ڸ��� ä���.
      while(str.length() != len) {
          str = "0"+str;
      }
      
      return str;
  }
  
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n]; 
      
      // 2. �迭�� ũ�⸸ŭ �ݺ�.
      for(int i =0;i<n;i++) {
          // 2-1. ��ȯ�� ������ ���� ���� �� ������ ��� ���� ����.
          String str_x,str_y,str="";
          // 2-2. �� �迭���� ���� ����.
          int x = arr1[i];
          int y = arr2[i];
          // 2-3. �������� ��ȯ �� �ڸ��� ä���.
          str_x = cal(x,n);
          str_y = cal(y,n);
          // 2-4. ���ǿ� �°� ���ڿ� ���� ����.
          for(int j = 0;j<n;j++){
              if(str_x.charAt(j) == '1' || str_y.charAt(j) == '1') str+="#";
              else str+=" ";
          }
          // 2-5. �� �� �ϼ�.
          answer[i] = str;
      }
      
      return answer;
  }
}