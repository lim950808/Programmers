package Lv1;
//약수의 개수와 덧셈
class countAndAdditionOfDivisor {
	
    public int solution(int left, int right) { //매개변수 left, right
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int cnt = 0;
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt++;
            } //약수의 개수가 짝수인 수는 더하고.
            
            if(cnt % 2 == 0) answer += i;
            else answer -= i; //약수의 개수가 홀수인 수는 뺀 수는 리턴.
        }
        
        return answer;
    }
	    
}