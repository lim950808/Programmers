package Lv0;

class 한번만등장한문자 {
    public String solution(String s) {
        // 알파벳 26자리 배열
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // s.charAt(i) : s이라는 문자열의 i번째 문자를 int형으로 변환하여 해당 아스키코드 값을 반환
            ++arr[s.charAt(i) - 'a']; // 해당 문자가 속한 문자열에서 1('a')을 빼 넣어줌
        }

        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) { // 하나만 등장하는 문자일시
                answer += (char)('a' + i); // 배열은 0부터 시작하기 때문에 1('a')을 더해줘서 해당 문자를 반환
            }
        }

        // s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return
        return answer;
    }

    public static void main(String[] args) {
        String s1 = new String("abcabcadc");
        String s2 = new String("abcd");
        String s3 = new String("hello");

        String answer1 = new 한번만등장한문자().solution(s1);
        String answer2 = new 한번만등장한문자().solution(s2);
        String answer3 = new 한번만등장한문자().solution(s3);

        System.out.println(answer1); // d
        System.out.println(answer2); // abcd
        System.out.println(answer3); // eho
    }
}