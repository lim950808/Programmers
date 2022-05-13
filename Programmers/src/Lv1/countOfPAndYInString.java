package Lv1;
//문자열 내 p와 y의 개수
class countOfPAndYInString {
	boolean solution(String s) {
		int pCount = 0, yCount = 0;
		String[] array = s.toLowerCase().split(""); //  소문자로 바꿔서 잘라서 배열에 넣음
		
		for (int i = 0; i < array.length; i++) { //for문 돌리면서 p 와 y 카운터 세기
			if ("p".equals(array[i])) { 
				pCount++;
			} else if ("y".equals(array[i])) {
				yCount++;
			}
		}
		if (pCount != yCount) { //'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return
			 return false;
		}
			return true;
	}
}