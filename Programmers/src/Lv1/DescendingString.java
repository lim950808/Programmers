package Lv1;
//문자열 내림차순으로 배치하기
class Solution {
	
    public String solution(String s) {
    	
        String answer = "";
        char[] str = s.toCharArray();
        //문자열을 char타입으로 변환하는 String.toCharArray() 메소드

        for(int i = 0; i < s.length() - 1; i++) {
            for(int j = 0; j < s.length() - 1 - i; j++) {
                if((int)str[j] < (int)str[j+1]) {
                    char temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        } //버블 정렬
        
        answer = new String(str);
        //문자열 배열을 문자열로 변환

        return answer;
        
    }
    
}