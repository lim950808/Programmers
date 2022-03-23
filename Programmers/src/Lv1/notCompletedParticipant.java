package Lv1;
// 완주하지 못한 선수
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
            map.put(player, map.getOrDefault(player, 0) + 1); //Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용 
        
        for (String player : completion) 
            map.put(player, map.get(player) - 1); //완주한 사람 빼기

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){ 
            Map.Entry<String, Integer> entry = iter.next(); 
            if (entry.getValue() != 0) { //HashMap을 한번 돌면서 Value가 0이 아닌 사람을 찾는다.
                answer = entry.getKey(); //Key에 해당하는 Value를 반환하는 함수
                break; 
            } 
        }

        return answer;
    }
}