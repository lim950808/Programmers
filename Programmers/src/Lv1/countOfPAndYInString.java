package Lv1;
//���ڿ� �� p�� y�� ����
class countOfPAndYInString {
	boolean solution(String s) {
		int pCount = 0, yCount = 0;
		String[] array = s.toLowerCase().split(""); //  �ҹ��ڷ� �ٲ㼭 �߶� �迭�� ����
		
		for (int i = 0; i < array.length; i++) { //for�� �����鼭 p �� y ī���� ����
			if ("p".equals(array[i])) { 
				pCount++;
			} else if ("y".equals(array[i])) {
				yCount++;
			}
		}
		if (pCount != yCount) { //'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return
			 return false;
		}
			return true;
	}
}