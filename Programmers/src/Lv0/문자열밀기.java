package Lv0;

class 문자열밀기 {
    public int solution(String A, String B) {
        // B.repeat(3): 문자열 B를 세 번 반복
        String str = B.repeat(3);

        // 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동 시킬 수 있을 때,
        // A를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수를 return
        // 밀어서 B가 될 수 없으면 -1을 return
        // .indexOf(): 문자열에서 특정 단어가 있는지를 찾고 있을 경우 위치값을 리턴
        return str.indexOf(A);
    }

    public static void main(String[] args) {
        String A1 = new String("hello");
        String A2 = new String("apple");

        String B1 = new String("ohell");
        String B2 = new String("elppa");

        int answer1 = new 문자열밀기().solution(A1, B1);
        int answer2 = new 문자열밀기().solution(A2, B2);

        System.out.println(answer1); // 1
        System.out.println(answer2); // -1
    }
}