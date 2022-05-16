package Lv1;
//하샤드 수
import java.io.IOException;
class harshadNumber {
	public boolean solution (int x) throws IOException {
			int sum = 0;
			int a = x;
	    
	      //각 자릿수의 합을 구해주기 위하여 while문을 이용.
			while (a >= 1) {
				sum += a % 10;
				a /= 10;
			}
	
			if (x % sum == 0) {
				return true; //나머지가 0이면 true를 반환.
			} else
				return false; //아닐 경우 false를 반환.
	}
}