package Lv1;
//���ڿ� �ٷ�� �⺻
class dealingWithStringBasic {
	public boolean solution(String s) {
		boolean answer = true;
		
		int length = s.length();
		if(length != 4 && length != 6) { //���̰� 4 Ȥ�� 6
			return false;
		}
		for(int i=0; i<length; i++) {
			char c = s.charAt(i);
			if(c<'0' || c>'9') { //���̰� 1 �̻� 8 ������ ���ڿ�
				return false;
			}
		}
		return answer;
	}
}