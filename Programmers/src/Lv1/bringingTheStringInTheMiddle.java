package Lv1;
//가운데 글자 가져오기
class bringingTheStringInTheMiddle {
	public String solution(String s) {
		String answer = "";
		answer = s.substring((s.length()-1)/2, s.length()/2+1);
		//substring(int start, int end) : start 위치부터 end 전까지 문자열 반환
		return answer;
	}
}

//package Lv1;
////가운데 글자 가져오기
//class bringingTheStringInTheMiddle {
//	public String solution(String s) {
//		String answer = "";
//		int length = s.length();
//		if(length%2 ==0) {
//			answer = s.substring((length/2)-1, (length/2)+1);
//		}else {
//			answer = s.substring((length/2), (length/2)+1);
//		}
//		return answer;
//	}
//}