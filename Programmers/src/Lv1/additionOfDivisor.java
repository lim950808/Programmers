package Lv1;
//약수의 합
class additionOfDivisor {
	public int solution(int n) {
		int answer = 0;
        
		for(int i=1; i<=n; i++) {
			if(n%i == 0) { 
				answer += i; //n의 약수를 모두 더한 값을 리턴
			}
		}
		return answer;
	}
}