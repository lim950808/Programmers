package Lv2;
//���̽�ƽ
class joystick {
  public int solution(String name) {
      int answer = 0;
      int length = name.length();

      int index; // ���� ������ Ȯ���� �� ���
      int move = length - 1; // �¿� ������ ���� üũ

      for(int i = 0; i < name.length(); i++) {
          answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

          index = i + 1;
          // ���ӵǴ� A ���� Ȯ��
          while(index < length && name.charAt(index) == 'A') {
              index++;
          }

          // ������� ���� �Ͱ�, �ڷ� ���ư��� �� �� �̵����� ���� ���� ����
          move = Math.min(move, i * 2 + length - index);
          // 2022�� ���� �׽�Ʈ ���̽��� Ȯ���ϸ� ��������ص� ����ó���� �Ǳ� ������, ���� ����鿡�� ��������� �����Ǿ� ������,
          // BBBBAAAAAAAB �� ����, ó������ �޺κ��� ���� �Է��ϴ� ���� �� ���� ������ ����Ϸ��� �Ʒ��� �ڵ尡 �ʿ��մϴ�.
          move = Math.min(move, (length - index) * 2 + i);
      }
      return answer + move;
  }
}