package Lv1;
//���� �� ���ϱ�
class addingNumbersThatDontExist {
  public int solution(int[] numbers) { //1 �� numbers�� ���� �� 9
		boolean[] check = new boolean[10];
		for(int num: numbers) {
			check[num] = true;
		}
      
		int answer = 0;
		for(int i = 0; i < check.length; i++) { //0 �� numbers�� ��� ���� �� 9
			if(!check[i]) { //numbers�� ��� ���Ҵ� ���� �ٸ�
				answer += i;
			}
		}
      return answer; //numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return
  }
}