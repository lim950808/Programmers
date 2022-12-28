package Lv0;

class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        // 이중 for문을 활용한 같은 원소 찾기
        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    answer++;
                }
            }
        }

        // 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return
        return answer;
    }

    public static void main(String[] args) {
        String[] s1_1 = new String[]{"a", "b", "c"};
        String[] s1_2 = new String[]{"n", "omg"};

        String[] s2_1 = new String[]{"com", "b", "d", "p", "c"};
        String[] s2_2 = new String[]{"m", "dot"};

        int answer1 = new 배열의유사도().solution(s1_1, s2_1);
        int answer2 = new 배열의유사도().solution(s1_2, s2_2);

        System.out.println(answer1); // 2
        System.out.println(answer2); // 0
    }
}