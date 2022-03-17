package Lv1;

public class infficientCost {
	
	public long solution(int price, int money, int count) {
        long answer = -1;           
        long totalPrice = 0; //sum과 answer의 변수형을 동일하게 long으로 통일
        
        // 이용료 계산
        for(int i=1; i<=count; i++) {
            totalPrice += price * i; // 첫번째 i원, 두번째 (i*2)원, 세번째 (i*3)원, 네번째 (i*4)원, ...
        } // 네번 타면 -> 3+6+9+12=30원 -> 하지만 가지고 있는 돈은 20원 밖에 안되므로 10원이 모자름.
        
        // 얼마 모자르는지(answer) 계산
        answer = (totalPrice > money) ? (totalPrice - money) : 0;
        // (totalPrice > money) 조건식에 따라 totalPrice - money로 모자르는 값 계산할지, 아님 모자르지 않으면 0 출력
        return answer;
    }
	
}