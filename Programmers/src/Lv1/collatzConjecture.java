package Lv1;
//콜라츠 추측
class collatzConjecture {
  public int solution(int num) {
      int answer = 0;
      int a = num;
      
      while(a != 1 && answer != 500){ //a가 1이 아니면서 answer가 500이 되기 전까지 while문을 반복.
          if(a % 2 == 0) { //a % 2 가 0이면 a / 2를 a에 대입.
              a = a/2;
          } else if(a %2==1) { //a % 2 가 1이면 (a * 3) + 1을 a에 대입.
              a = (a*3) + 1;
          }
          answer++; //한번 반복할 때마다 answer을 1씩 증가.
      }
      if(answer == 500) { //만약 answer가 500일 경우 answer에 -1을 넣음
          answer = -1;
      }
      
      return answer;
  }
}