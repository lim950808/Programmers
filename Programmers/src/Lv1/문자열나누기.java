package Lv1;

class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0); // 첫 글자
        int count = 0;

        // String.toCharArray() : 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 집어넣어 줌
        for (char c : s.toCharArray()) {
            if (count == 0) {
                first = c;
            }
            if (first == c) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                answer++;
            }
        }

        if (count > 0) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = "banana";
        String s2 = "abracadabra";
        String s3 = "aaabbaccccabba";

        int answer1 = new 문자열나누기().solution(s1);
        int answer2 = new 문자열나누기().solution(s2);
        int answer3 = new 문자열나누기().solution(s3);

        System.out.println(answer1); // 3
        System.out.println(answer2); // 6
        System.out.println(answer3); // 3
    }
}