package Lv1;
//�� ���� ������ ��
class additionOfIntegersBetweenTwoIntegers {
	public long solution(int a, int b) {
		long answer = 0;
		
		if(a<b) { //a�� b�� ��Ұ��谡 ������ ���� �ʱ� ������ �� ���̿� ���� ��� ���� ���� ����
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