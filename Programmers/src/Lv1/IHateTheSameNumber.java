package Lv1;

import java.util.ArrayList;
//���� ���ڴ� �Ⱦ�
class IHaveTheSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>(); //���� ����Ʈ ArrayList ����
        
        int num = -1; //���Ұ� 0~9���� �̹Ƿ� ���� �ȹ޴� �ƹ� ����
        for(int i=0; i<arr.length; i++) {
             if(arr[i] != num) {
                 arrList.add(arr[i]); //ó������ num�� ������ ���ڰ� �ٸ��Ƿ� arrList.add�� ����Ǿ� ó�� ���ڴ� ������ ���Ե�
                 num = arr[i]; //num�� ��� ���Ͽ� ���ڰ� �ٸ� ��쿡�� ��������Ʈ�� arrList�� ���� ����
             }
        }
        
        answer = new int[arrList.size()]; //answer ����Ʈ ũ�� ����
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrList.get(i); //���� ����Ʈ�� �Ϲ� �迭�� �ٲٴ� �۾�
        }
        
        return answer;
    }
}