package Lv1;

public class infficientCost {
	
	public long solution(int price, int money, int count) {
        long answer = -1;           
        long totalPrice = 0; //sum�� answer�� �������� �����ϰ� long���� ����
        
        // �̿�� ���
        for(int i=1; i<=count; i++) {
            totalPrice += price * i; // ù��° i��, �ι�° (i*2)��, ����° (i*3)��, �׹�° (i*4)��, ...
        } // �׹� Ÿ�� -> 3+6+9+12=30�� -> ������ ������ �ִ� ���� 20�� �ۿ� �ȵǹǷ� 10���� ���ڸ�.
        
        // �� ���ڸ�����(answer) ���
        answer = (totalPrice > money) ? (totalPrice - money) : 0;
        // (totalPrice > money) ���ǽĿ� ���� totalPrice - money�� ���ڸ��� �� �������, �ƴ� ���ڸ��� ������ 0 ���
        return answer;
    }
	
}