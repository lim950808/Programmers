package Lv1;
//시저 암호
class caesarCipher {
	  public String solution(String s, int n) {
	      	StringBuilder sb = new StringBuilder(); //문자열로 변환
	 
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
	 
				if(ch>='a' && ch<='z') { //소문자 a부터 z까지 총 26개
					ch = (char) (ch + n);
					if (ch > 'z')
						ch -= 26;
				}else if (ch>='A' && ch<='Z') { //대문자 A부터 Z까지 총 26개
					ch = (char) (ch + n);
					if (ch > 'Z')
						ch -= 26;
				} 
				sb.append(ch);
			}	 
			return sb.toString();
	 }
}