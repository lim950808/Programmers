package Lv2;
//����Ʈ
import java.util.*;

class lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); //�迭�� �����ؼ� ���� ������ ���ҿ� ���� ���� ������ ���� ���ؼ�, �������Ѻ��� ũ�� �۳ĸ� ������ �ذ�.
        int index = 0;
        
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) { //�� ������ ���� �� ���� �ݺ��ؼ� ��Ʈ�� �¿��� ����.
                index++; //���� �� ���Ҵ� ��Ʈ�� �¿� �������Ƿ�, �ε������� +1
                answer++;
            }
            else {
                answer++;
            }
        }
        
        return answer;
    }
}