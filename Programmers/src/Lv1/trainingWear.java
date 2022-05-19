package Lv1;
import java.util.Arrays;
//체육복
class trainingWear {
  public int solution(int n, int[] lost, int[] reserve) {
      int answer = n - lost.length;
      
      Arrays.sort(lost);
      Arrays.sort(reserve);
      
      //여벌 체육복을 가져온 학생이 도난당한 경우
      for(int i=0; i<lost.length; i++) {
          for(int j=0; j<reserve.length; j++) {
              if(lost[i] == reserve[j]) {
                  answer++;
                  lost[i] = -1; //lost[i] 의 값도 -1로 변경해 도난당한 대상에서 제외
                  reserve[j] = -1; //reserve[j]의 값을 -1로 변경
                  break; 
              }
          }
      }
      
      //도난당한 학생에게 체육복을 빌려주는 경우
      for(int i=0; i<lost.length; i++) {
          for(int j=0; j<reserve.length; j++) {
              if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])) {
                  answer++;
                  reserve[j] = -1; //reserve[j]의 값을 -1로 변경
                  break; 
              }
          }
      }
      //lost[] 와 reserve[] 배열의 요소값을 0 이 아닌 -1로 변경해주는 이유는 0으로 변경했을 경우 lost[i]+1 의 값이 1 이 되므로 if문을 타게 될 가능성이 있기 때문.
      return answer;
  }
}