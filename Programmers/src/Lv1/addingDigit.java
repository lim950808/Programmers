package Lv1;
//�ڸ��� ���ϱ�
public class addingDigit {
	public int solution(int n) {
        int answer = 0;

        while(n != 0) { //n�� 0�� �ɶ����� �ݺ������� ��� �ڸ����� ����.
            answer += n % 10; //n�� 1�� �ڸ����� ���� �� ����.
            n /= 10; //1�� �ڸ��� �����.
        }

        return answer;
    }
}