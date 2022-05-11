package Lv1;

import java.util.ArrayList;
//같은 숫자는 싫어
class IHaveTheSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>(); //가변 리스트 ArrayList 선언
        
        int num = -1; //원소가 0~9까지 이므로 영향 안받는 아무 숫자
        for(int i=0; i<arr.length; i++) {
             if(arr[i] != num) {
                 arrList.add(arr[i]); //처음에는 num과 무조건 숫자가 다르므로 arrList.add가 실행되어 처음 숫자는 무조건 삽입됨
                 num = arr[i]; //num과 계속 비교하여 숫자가 다른 경우에만 가변리스트인 arrList에 값이 삽입
             }
        }
        
        answer = new int[arrList.size()]; //answer 리스트 크기 선언
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrList.get(i); //가변 리스트를 일반 배열로 바꾸는 작업
        }
        
        return answer;
    }
}