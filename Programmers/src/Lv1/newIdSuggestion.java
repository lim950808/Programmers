package Lv1;
//신규 아이디 추천
public class newIdSuggestion {
	
	public String solution(String new_id) {
        
        // 1단계: 대문자를 소문자로 치환
        String answer = new_id.toLowerCase();
        
        // 2단계: 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        
        // 3단계: 연속된 마침표를 하나의 마침표로 치환
        answer = answer.replaceAll("[.]{2,}", ".");
        
        // 4단계: 마침표가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]{1}", "");
        
        // 5단계: 빈 문자열이면 "a" 대입
        if(answer.equals("")) 
            answer += "a";      
 
        // 6단계: 16자리 이상이면 15자리까지 제외하고 제거
        if(answer.length() >= 16) answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]{1}$", "");
       
        // 7단계: 2자리 이하면 3자리가 될때까지 마지막 문자를 반복해서 붙임
        if(answer.length() <= 2) {
            for(int i = answer.length(); i < 3; i++){
                answer += answer.substring(answer.length()-1);
            }
        }
        
        return answer;
    }

}