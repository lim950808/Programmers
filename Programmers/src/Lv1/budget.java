package Lv1;
// ����
import java.util.Arrays;

class budget {
	
	public int budget(int[] d, int budget) {
		
		int answer = 0;
		Arrays.sort(d); //�迭�� �����ϴ� �Լ�
	
		for(int i=0; i<d.length; i++) {
			budget -= d[i]; //for���� �������� budget�� ���� �ϳ��� ���ٰ�
			if(budget < 0) break; //0���� �۾����� �̹� �ִ밪�� �������Ƿ� break.
			answer++; //������ 0���� �۾����� �ʴ´ٸ� ��� ����.
		}
		
		return answer;
		
	}
	
}