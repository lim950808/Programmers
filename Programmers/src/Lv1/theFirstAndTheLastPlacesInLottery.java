package Lv1;
//로또의 최고 순위와 최저 순위
class theFirstAndTheLastPlacesInLottery {
  public int[] solution(int[] lottos, int[] win_nums) {
  	//1. 당첨번호와 비교해 일치하는 개수를 담을 cnt와 동생이 낙서해 알아보지 못하게 된 번호의 개수를 담을 zeroCnt 두 변수를 0으로 초기화
      int cnt = 0;
      int zeroCnt = 0;
      for(int lotto: lottos){
      	//2. 민우의 로또번호를 foreach로 돌려서 item이 0이면 zeroCnt의 값을 1씩 증가시켜 주었고 바로 다음 item을 검색하도록 continue
          if(lotto == 0) {
              zeroCnt ++;
              continue;
          }
          for(int win_num:win_nums){
          	//3. item이 0이 아니면 아래로 내려가 당첨번호와 민우의 번호를 비교해 일치하면 cnt에 1을 증가시켜주었으며 빠르게 민수의 다음 번호를 비교해주기 위해 break로 빠져나옴
              if(win_num == lotto){
                  cnt ++;
                  break;
              }
          }
      }
      //4. 최고 순위는 Math.max(cnt+zeroCnt,1)를 사용해 민수가 찍은 번호들이 낙서에 의해 가려지지 않았을 때 당첨번호와 비교해 모든 번호가 일치하지 않을 경우 cnt+zeroCnt는 0이 되므로 Math.max를 통해 0일때엔 무조건 1이 되게끔 설정해주었으며 최저 순위는 Math.max(cnt,1)를 통해 비교한 번호의 cnt가 0일경우 또 무조건 1이 되게끔 설정해주었다. 그리고는 cnt가 가질 수 있는 0개에서 6개까지의 경우의 수에서 등수를 구하기 위해 방금 Math.max로 설정한 숫자를 7에서 빼주었다.
      return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
  }
}