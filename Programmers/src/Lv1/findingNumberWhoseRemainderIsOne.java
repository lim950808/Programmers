package Lv1;
//나머지가 1이 되는 수 찾기
class findingNumberWhoseRemainderIsOne {
  public int solution(int n) {
      int answer = 0;
      
      for(int i=2; i<n; i++) { //i의 시작값 2
          if(n%i == 1) { //나머지가 1
              answer = i;
              break;
          }
      }
      return answer;
  }
}