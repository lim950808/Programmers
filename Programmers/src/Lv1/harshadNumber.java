package Lv1;
//�ϻ��� ��
import java.io.IOException;
class harshadNumber {
	public boolean solution (int x) throws IOException {
			int sum = 0;
			int a = x;
	    
	      //�� �ڸ����� ���� �����ֱ� ���Ͽ� while���� �̿�.
			while (a >= 1) {
				sum += a % 10;
				a /= 10;
			}
	
			if (x % sum == 0) {
				return true; //�������� 0�̸� true�� ��ȯ.
			} else
				return false; //�ƴ� ��� false�� ��ȯ.
	}
}