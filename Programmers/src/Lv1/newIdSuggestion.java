package Lv1;
//�ű� ���̵� ��õ
public class newIdSuggestion {
	
	public String solution(String new_id) {
        
        // 1�ܰ�: �빮�ڸ� �ҹ��ڷ� ġȯ
        String answer = new_id.toLowerCase();
        
        // 2�ܰ�: �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        
        // 3�ܰ�: ���ӵ� ��ħǥ�� �ϳ��� ��ħǥ�� ġȯ
        answer = answer.replaceAll("[.]{2,}", ".");
        
        // 4�ܰ�: ��ħǥ�� ó���̳� ���� ��ġ�Ѵٸ� ����
        answer = answer.replaceAll("^[.]{1}", "");
        
        // 5�ܰ�: �� ���ڿ��̸� "a" ����
        if(answer.equals("")) 
            answer += "a";      
 
        // 6�ܰ�: 16�ڸ� �̻��̸� 15�ڸ����� �����ϰ� ����
        if(answer.length() >= 16) answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]{1}$", "");
       
        // 7�ܰ�: 2�ڸ� ���ϸ� 3�ڸ��� �ɶ����� ������ ���ڸ� �ݺ��ؼ� ����
        if(answer.length() <= 2) {
            for(int i = answer.length(); i < 3; i++){
                answer += answer.substring(answer.length()-1);
            }
        }
        
        return answer;
    }

}