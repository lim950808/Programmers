package Lv1;
import java.util.Arrays;
//정수 내림차순으로 배치하기
class parseLongDesc {
  public long solution(long n) {
      long answer = 0;
      
      String data = String.valueOf(n);
      String arr[] = data.split("");

      // 배열 오름차순 정렬
      Arrays.sort(arr);
      String str = "";

      // 오름차순으로 정렬되어 있어 뒤에서부터 글자 합치기
      for(int i = arr.length-1; i >= 0; i--) {
           str+= arr[i];
      }

      answer = Long.parseLong(str);
      
      return answer;
  }
}