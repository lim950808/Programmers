package Lv1;
// �������� ���� ����
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map;

class notCompleteParticipant {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        // HashMap<Key, Value>
        // HashMap<Participant, Count>
        for (String player : participant) 
            map.put(player, map.getOrDefault(player, 0) + 1); //Key�� �ش��ϴ� Value�� ������ ��������, �ƴ� ��� 0�� Default�� �����Ͽ� ��� 
        
        for (String player : completion) 
            map.put(player, map.get(player) - 1); //������ ��� ����

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){ 
            Map.Entry<String, Integer> entry = iter.next(); 
            if (entry.getValue() != 0) { //HashMap�� �ѹ� ���鼭 Value�� 0�� �ƴ� ����� ã�´�.
                answer = entry.getKey(); //Key�� �ش��ϴ� Value�� ��ȯ�ϴ� �Լ�
                break; 
            } 
        }

        return answer;
    }
}