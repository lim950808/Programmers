package Lv1;
//��� ���ϱ�
class solvingAverage {
	public double solution(int[] arr) { //�迭 arr�� ��հ�
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}