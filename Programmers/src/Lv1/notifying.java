package Lv1;

import java.util.*;

public class notifying {
	
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		// 1. �ߺ� ����
		HashSet<String> reportSet = new HashSet<String>();
		for(String rep : report)
			reportSet.add(rep);
		
		// 2. report���� �� ����� �Ű���� Ƚ���� countHash�� ����
		HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
		for (String rep : reportSet) {
			int blankIdx = rep.indexOf(" ");
			String reporter = rep.substring(0, blankIdx);
			String reportee = rep.substring(blankIdx + 1);
			
			ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
			if(reporterList == null) reporterList = new ArrayList<>();
			
			reporterList.add(reporter);
			notifyListHash.put(reportee, reporterList);
		}
		
		// 3. notifyListHash�� ������� reportHash �����
		HashMap<String, Integer> reporterHash = new HashMap<>();
		for(ArrayList<String> notifyList : notifyListHash.values())
			if(notifyList.size() >= k)
				for(String reporter : notifyList)
					reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
		
		// 4. reporterHash ������ answer�� �Űܴ��
		for(int i=0; i<id_list.length; i++)
			answer[i] = reporterHash.getOrDefault(id_list[i], 0);
		
		return answer;
	}
	
}