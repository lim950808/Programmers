package Lv1;

import java.util.HashSet;
import java.util.Set;
//�ΰ� �̾Ƽ� ���ϱ�
class addingTwoNumbers {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        //HashSet ����

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            } //add() => ��ü�� ������ �� ��ü�� Set�� ����Ǿ����� �ʾҴٸ� True�� ���� ����Ǿ��ִٸ� False�� ����
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}