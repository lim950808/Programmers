package Lv1;
//x만큼 간격이 있는 n개의 숫자
class xDistanceNNumber {
  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      long temp = x;
      
      for(int i=0; i<n; i++) { //숫자 n개 지니는 리스트 리턴
          answer[i] = temp * (i+1); //x부터 시작해 x씩 증가
      }
      return answer;
  }
}