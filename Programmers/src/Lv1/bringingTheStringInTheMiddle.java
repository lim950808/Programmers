package Lv1;
//��� ���� ��������
class bringingTheStringInTheMiddle {
	public String solution(String s) {
		String answer = "";
		answer = s.substring((s.length()-1)/2, s.length()/2+1);
		//substring(int start, int end) : start ��ġ���� end ������ ���ڿ� ��ȯ
		return answer;
	}
}

//package Lv1;
////��� ���� ��������
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