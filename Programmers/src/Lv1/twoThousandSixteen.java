package Lv1;
//2016
public class twoThousandSixteen {

	public String solution(int a, int b) {
		
	      int total = 0; 
	      //총 일수
	      
	      String day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	      //요일(day)을 문자열로 배열
	      
	      int date[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      //2016년 매월 끝나는 일자(date)
	      
	      for(int i = 0; i < a-1; i++) {
	          total += date[i];
	      } //1월부터 날짜를 누적
	      
	      total += b-1;
	      //매개변수 b로 들어온 정수도 더해줌.
	      
	      String answer = day[total%7];
	      //7로 나눈 나머지에 따라 달라지는 day(요일) 배열을 answer로 내보냄.
	      
	      return answer;
	      //해당 요일 출력
	  }
	
}