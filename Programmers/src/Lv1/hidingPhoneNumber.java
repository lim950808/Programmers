package Lv1;
//핸드폰 번호 가리기
class hidingPhoneNumber {
  public String solution(String phone_number) {
      String answer = "";
      
      for(int i=0; i<phone_number.length(); i++) {
          if(i < phone_number.length()-4) {
              answer += "*";
          }else {
              answer += phone_number.charAt(i);
          }
      }
      return answer; //전화번호 뒷 4자리 제외 나머지 숫자를 전부 "*"으로 가린 문자열 리턴.
  }
}