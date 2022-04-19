package Lv1;
//이상한 문자 만들기
class makingStrangeString {
  public String solution(String s) {
      String answer = "";
      String[] str = s.split(""); //s를 한글자씩 잘라 배열에 담음
      int index=0; //홀,짝 자리수를 나타내기 위해 변수 index사용

      for(int i=0; i<str.length; i++) {
          if(str[i].equals(" ")){ //공백 이후 자리수가 0으로 돌아가기 때문에 공백 확인 후 index값 초기화
              str[i]=" ";
              index=0;
          }else {
              if(index%2 == 0) { //index가 짝수이면 대문자로 변환
                  str[i]=str[i].toUpperCase();
                  index++;
              }
              else if(index%2 != 0) { //index가 홀수 이면 소문자로 변환
                  str[i]=str[i].toLowerCase();
                  index++;
              }
          }
      answer= answer+str[i]; //변환한 글자를 리턴
      }
  return answer;
  }
}