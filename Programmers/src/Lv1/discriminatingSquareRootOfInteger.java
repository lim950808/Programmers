package Lv1;
//정수 제곱근 판별
class discriminatingSquareRootOfInteger {
  public long solution(long n) {        
      long sqrt = (long)Math.sqrt(n); //Math.sqrt(n)를 통해 제곱근을 찾는다.

      if (Math.pow(sqrt, 2) == n) {
          return (long)Math.pow(sqrt + 1, 2); //Math.pow()를 사용하여 제곱한뒤 비교
      }else {
          return -1; //n이 어떤 양의 정수 x의 제곱이라면, 1에서 찾은 제곱근에 1을 더한 후 제곱하여 리턴, 아닐 시 -1을 리턴
      }
  }
}