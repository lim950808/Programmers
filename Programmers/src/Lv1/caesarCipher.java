package Lv1;
//���� ��ȣ
class caesarCipher {
	  public String solution(String s, int n) {
	      	StringBuilder sb = new StringBuilder(); //���ڿ��� ��ȯ
	 
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
	 
				if(ch>='a' && ch<='z') { //�ҹ��� a���� z���� �� 26��
					ch = (char) (ch + n);
					if (ch > 'z')
						ch -= 26;
				}else if (ch>='A' && ch<='Z') { //�빮�� A���� Z���� �� 26��
					ch = (char) (ch + n);
					if (ch > 'Z')
						ch -= 26;
				} 
				sb.append(ch);
			}	 
			return sb.toString();
	 }
}