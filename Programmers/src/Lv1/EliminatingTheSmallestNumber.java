package Lv1;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
//제일 작은 수 제거하기
class EliminatingTheSmallestNumber {
  public int[] solution(int[] arr) {
      
      if(arr.length <= 1) //길이 1 이상인 배열 arr
          return new int[]{-1}; //빈 배열인 경우 배열에 -1을 채워 리턴
      
      int min = Arrays.stream(arr).min().getAsInt();
      
      return Arrays.stream(arr).filter(i -> i != min).toArray(); //arr 에서 가장 작은 수를 제거한 배열을 리턴
      
  }
}