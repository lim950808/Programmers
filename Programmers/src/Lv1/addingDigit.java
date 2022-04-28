package Lv1;
//자릿수 더하기
public class addingDigit {
	public int solution(int n) {
        int answer = 0;

        while(n != 0) { //n이 0이 될때까지 반복함으로 모든 자리수를 더함.
            answer += n % 10; //n의 1의 자리수를 구할 수 있음.
            n /= 10; //1의 자리가 사라짐.
        }

        return answer;
    }
}