package Lv2;

//124 나라의 숫자

class numberOfCountry124 {
	public String solution(int n) {
	    String[] numbers = {"4", "1", "2"};
	    String answer = "";
	    
	    int num = n;
	    
	    while(num > 0) {
	        int remainder = num % 3;
	        num /= 3;
	        
	        if(remainder == 0) num--;
	        
	        answer = numbers[remainder] + answer;
	    }
	    
	    //자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return
	    return answer;
	}
}