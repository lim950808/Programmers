package Lv1;
// K��° ��
import java.util.Arrays; //�迭�� �ٷ�� �޼ҵ���� ����

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int a,b,c;
            a=commands[i][0];
            b=commands[i][1];
            c=commands[i][2];
            int[] temp = Arrays.copyOfRange(array,a-1,b);
            // copyOfRange(arr, startIdx, endIdx)
            // 1. ù ��° �Ű������� ������ ���� �迭�� �ް�
            // 2. �� ��° �Ű������� ���� �ε���
            // 3. �� ��° �Ű������� ������ ����� �迭 �ε���+1�� �޾Ƽ� ���� �迭�� ���� Ÿ���� ����� ���ο� �迭�� ��ȯ
            Arrays.sort(temp);
            // sort(arr)
            // �Ű������� �迭�� �ް� �迭�� ������������ ����
            answer[i]=temp[c-1];
        }
        return answer;
    }
}