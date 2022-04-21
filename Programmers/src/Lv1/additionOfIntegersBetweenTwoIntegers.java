package Lv1;
//두 정수 사이의 합
class additionOfIntegersBetweenTwoIntegers {
	public long solution(int a, int b) {
		long answer = 0;
		
		if(a<b) { //a와 b는 대소관계가 정해져 있지 않기 때문에 그 사이에 속한 모든 정수 합을 리턴
			for(int i=a; i<=b; i++) {
				answer += i;
			}
		}else
			for(int i=b; i<=a; i++) {
				answer += i;
			}
		return answer;
	}
}