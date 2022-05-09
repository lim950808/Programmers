package Lv1;
//자연수 뒤집어 배열로 만들기
class makingArrayWithIntegerReversed {
	  public int[] solution(long n) {
	      String a = "" + n;
	        int[] answer = new int[a.length()];
	        int cnt=0;
	 
	        while(n>0) {
	            answer[cnt] = (int)(n%10);
	            n/=10; //12345%10에서 구한 5 -> 1234만 남으므로 그다음은 1234%10 = 4
	            cnt++;
	        }
	      return answer;
	  }
}