package Lv1;
// 예산
import java.util.Arrays;

class budget {
	
	public int budget(int[] d, int budget) {
		
		int answer = 0;
		Arrays.sort(d); //배열을 정렬하는 함수
	
		for(int i=0; i<d.length; i++) {
			budget -= d[i]; //for문을 돌려가며 budget의 값을 하나씩 빼다가
			if(budget < 0) break; //0보다 작아지면 이미 최대값을 지났으므로 break.
			answer++; //하지만 0보다 작아지지 않는다면 계속 더함.
		}
		
		return answer;
		
	}
	
}