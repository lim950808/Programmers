package Lv1;
import java.util.*;
//나누어 떨어지는 숫자 배열
class arrayThatCanBeDivided {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {}; //int[] 타입으로 반환할 answer 변수를 초기화.
      ArrayList<Integer> a = new ArrayList<Integer>(); //ArrayList인 a1을 Integer 타입으로 선언.
      
      //for 문을 사용하여 arr 배열에 있는 원소를 divisor로 나누었을 때 나머지가 0인 원소만 add를 사용하여 a1에 추가.
      for(int i = 0; i <arr.length; i++) {
          if(arr[i]%divisor == 0) {
              a.add(arr[i]);
          }
      }
      
      //a1이 비어있을 경우(나누었을 때 나머지가 0이 아닐 경우) a1에 add를 이용하여 -1을 추가.
      if(a.isEmpty()) {
          a.add(-1);
      }
      
      //answer의 크기를 a1의 size 만큼으로 설정
      answer = new int[a.size()];
      
      //for문을 사용하여 a1에 있는 원소를 get으로 꺼내서 answer에 저장
      for(int i = 0; i<a.size() ; i++) {
          answer[i] = a.get(i);
      }
      
      Arrays.sort(answer); //Arrays.sort를 이용해 정렬
      return answer;
  }
}