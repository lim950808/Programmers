package Lv1;
//문자열 다루기 기본
class dealingWithStringBasic {
	public boolean solution(String s) {
		boolean answer = true;
		
		int length = s.length();
		if(length != 4 && length != 6) { //길이가 4 혹은 6
			return false;
		}
		for(int i=0; i<length; i++) {
			char c = s.charAt(i);
			if(c<'0' || c>'9') { //길이가 1 이상 8 이하인 문자열
				return false;
			}
		}
		return answer;
	}
}