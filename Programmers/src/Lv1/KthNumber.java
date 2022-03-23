package Lv1;
// K번째 수
import java.util.Arrays; //배열을 다루는 메소드들이 포함

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int a,b,c;
            a=commands[i][0];
            b=commands[i][1];
            c=commands[i][2];
            int[] temp = Arrays.copyOfRange(array,a-1,b);
            // copyOfRange(arr, startIdx, endIdx)
            // 1. 첫 번째 매개변수로 복사할 원본 배열을 받고
            // 2. 두 번째 매개변수로 시작 인덱스
            // 3. 세 번째 매개변수로 마지막 복사될 배열 인덱스+1을 받아서 원본 배열과 같은 타입의 복사된 새로운 배열을 반환
            Arrays.sort(temp);
            // sort(arr)
            // 매개변수로 배열을 받고 배열을 오름차순으로 정렬
            answer[i]=temp[c-1];
        }
        return answer;
    }
}