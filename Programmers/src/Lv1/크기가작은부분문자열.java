package Lv1;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;

        for (int i = 0; i < length; i++) {
            if (Long.parseLong(p) >= Long.parseLong(t.substring(i, i + p.length()))) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String t1 = "3141592";
        String p1 = "271";

        int result1 = new 크기가작은부분문자열().solution(t1, p1);

        System.out.println(result1);
    }
}