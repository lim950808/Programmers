package Lv1;
//내적 (백터와 백터를 곱해 스칼라 라는 아웃풋을 가짐)
class innerProduct {
	
  public int solution(int[] a, int[] b) { //길이가 같은 a, b라는 매개변수
	  
      int answer = 0;
      
      for(int i=0; i<a.length; i++) {
          answer += a[i]*b[i];
      }
      
      return answer; //a와 b의 "내적"을 return
      
  }
  
}