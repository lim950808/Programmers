package Lv1;
//����� ��
class additionOfDivisor {
	public int solution(int n) {
		int answer = 0;
        
		for(int i=1; i<=n; i++) {
			if(n%i == 0) { 
				answer += i; //n�� ����� ��� ���� ���� ����
			}
		}
		return answer;
	}
}