package Lv1;
//없는 수 더하기
class addingNumbersThatDontExist {
  public int solution(int[] numbers) { //1 ≤ numbers의 길이 ≤ 9
		boolean[] check = new boolean[10];
		for(int num: numbers) {
			check[num] = true;
		}
      
		int answer = 0;
		for(int i = 0; i < check.length; i++) { //0 ≤ numbers의 모든 원소 ≤ 9
			if(!check[i]) { //numbers의 모든 원소는 서로 다름
				answer += i;
			}
		}
      return answer; //numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
  }
}