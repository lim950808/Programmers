package Lv1;
//소수 찾기 (에라토스테네스의 체 사용)
class findingDecimal {
  public int solution(int n) {
      int answer = 0;
      boolean[] decimal = new boolean [n+1];
      
      for(int i=2; i<=n; i++)
          decimal[i] = true; //2~n번째 수를 true로 초기화
      
      //제곱근 구하기
      int root = (int)Math.sqrt(n);
      
      for(int i=2; i<=root; i++) { //2~루트n까지 검사
          if(decimal[i] == true) { //i번째의 수가 소수일 때
              for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화 (배수는 소수가 아니기 때문에)
                  decimal[i*j] = false;
          }
      }
      for(int i=2; i<=n; i++) {
          if(decimal[i] == true) //소수의 갯수 세기
              answer++;
      }
      return answer;
  }
}