package Lv1;
//최대공약수와 최소공배수
class greatestCommonMeasureAndLeastCommonMultiple {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n, m); 
        int small = Math.min(n, m); 
        
        answer[0] = gcd(big, small); //gcd: 최대공약수
        answer[1] = big*small/answer[0];
        
        return answer;
    }
    
    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b); //유클리드 호제법: 두 양의 정수, 혹은 두 다항식의 최대공약수를 구하는 방법
    }
}