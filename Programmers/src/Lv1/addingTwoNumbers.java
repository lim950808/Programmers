package Lv1;

import java.util.HashSet;
import java.util.Set;
//두개 뽑아서 더하기
class addingTwoNumbers {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        //HashSet 생성

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            } //add() => 객체를 저장할 때 객체가 Set에 저장되어있지 않았다면 True를 리턴 저장되어있다면 False를 리턴
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}