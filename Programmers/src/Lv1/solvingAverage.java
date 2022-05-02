package Lv1;
//평균 구하기
class solvingAverage {
	public double solution(int[] arr) { //배열 arr의 평균값
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}