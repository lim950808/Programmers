package Lv1;
//수박수박수박수박수박수?
class sooBakSooBakSooBakSooBakSooBakSoo {
	public String solution(int n) {
		String answer = "";

		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				answer += "수"; //짝수면 "수"
			}	
			if(i%2 == 1) {
				answer += "박"; //홀수면 "박"
			}
		}
		return answer;
	}
}