package Lv1;
//���ڼ��ڼ��ڼ��ڼ��ڼ�?
class sooBakSooBakSooBakSooBakSooBakSoo {
	public String solution(int n) {
		String answer = "";

		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				answer += "��"; //¦���� "��"
			}	
			if(i%2 == 1) {
				answer += "��"; //Ȧ���� "��"
			}
		}
		return answer;
	}
}