package Lv2;
//구명보트
import java.util.*;

class lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); //배열을 정렬해서 가장 오른쪽 원소와 가장 왼쪽 원소의 합을 구해서, 무게제한보다 크냐 작냐를 나누어 해결.
        int index = 0;
        
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) { //두 변수가 만날 때 까지 반복해서 보트를 태워서 보냄.
                index++; //가장 앞 원소는 보트에 태워 보냈으므로, 인덱스값을 +1
                answer++;
            }
            else {
                answer++;
            }
        }
        
        return answer;
    }
}