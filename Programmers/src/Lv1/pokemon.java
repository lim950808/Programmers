package Lv1;

import java.util.*;
//���ϸ�
class pokemon {    
	
  public int solution(int[] nums) {
      int answer = 0;
      int len = nums.length;
      // �ߺ� ���Ÿ� ���� set (���� ��� �����Ƿ� HashSet ���)
      Set<Integer> set = new HashSet<>();
      // set�� ��� ���ϸ� ��ȣ�� add
      for (int num : nums) {
          set.add(num);
      }
      // set�� ����� ���ϸ��/2 ���� ũ�ٸ�?
      // ���ϸ��/2 ��ŭ�� ������ ������ �� �ִٴ� �ǹ�
      if(set.size() >= len/2) {
          answer = len/2;
      // set�� ����� ���ϸ��/2 ���� �۴ٸ�?
      // ���ϸ��/2 ��ŭ�� ������ ���� ���� ���� set�� ũ�⸸ŭ�� ������ ���� �� ����
      }else {
          answer = set.size();
      }
      return answer;
  }
  
}