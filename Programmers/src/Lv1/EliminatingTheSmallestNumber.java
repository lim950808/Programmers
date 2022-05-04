package Lv1;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
//���� ���� �� �����ϱ�
class EliminatingTheSmallestNumber {
  public int[] solution(int[] arr) {
      
      if(arr.length <= 1) //���� 1 �̻��� �迭 arr
          return new int[]{-1}; //�� �迭�� ��� �迭�� -1�� ä�� ����
      
      int min = Arrays.stream(arr).min().getAsInt();
      
      return Arrays.stream(arr).filter(i -> i != min).toArray(); //arr ���� ���� ���� ���� ������ �迭�� ����
      
  }
}