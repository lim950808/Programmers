package Lv1;
// �Ҽ� �����
class makingDecimals {
	
	   public int solution(int[] nums) {
	      int answer = 0;
	      boolean chk = false;

	      for (int i = 0; i < nums.length; i++) {
	         for (int j = i + 1; j < nums.length; j++) {
	            for (int k = j + 1; k < nums.length; k++) {
	               int num = nums[i] + nums[j] + nums[k]; //���� ���
	               if (num >= 2) //����� ���� ã�Ƽ�
	                  chk = sosu(num);
	               if (chk == true) //�Ҽ��� ���� ���
	                  answer++; 

	            }
	         }

	      }
	      return answer;
	   }
	   
	   public boolean sosu(int num) {
	      boolean check = true; 
	      if(num==2) { //�Ҽ��϶�
	         return check;
	         
	      }
	      for(int i=2; i<num; i++) { //�Ҽ��� �ƴҶ�
	         if(num%i ==0) {
	            check = false;
	            break;
	         }
	      }
	      return check;
	   }
	   
}