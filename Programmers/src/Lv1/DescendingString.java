package Lv1;
//���ڿ� ������������ ��ġ�ϱ�
class Solution {
	
    public String solution(String s) {
    	
        String answer = "";
        char[] str = s.toCharArray();
        //���ڿ��� charŸ������ ��ȯ�ϴ� String.toCharArray() �޼ҵ�

        for(int i = 0; i < s.length() - 1; i++) {
            for(int j = 0; j < s.length() - 1 - i; j++) {
                if((int)str[j] < (int)str[j+1]) {
                    char temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        } //���� ����
        
        answer = new String(str);
        //���ڿ� �迭�� ���ڿ��� ��ȯ

        return answer;
        
    }
    
}