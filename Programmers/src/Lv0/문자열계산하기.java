package Lv0;

class 문자열계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        // 빈칸으로 띄어진 문자들을 하나씩 배열 arr에 넣음
        String[] arr = my_string.trim().split(" ");
        int operator = 1; // 연산자

        for (String s : arr) {
            if (s.equals("+") || s.equals("-")) { // 배열에서 연산자가 나오면 -1(-) 혹은 1(+)을 operator에 대입
                operator = s.equals("-") ? -1 : 1;
            } else { // 배열에서 연산자가 아니면(숫자면) Integer형으로 바꿔서 operator(-1 or 1)와 곱해서 answer에 더해줌
                answer += Integer.parseInt(s) * operator;
            }
        }

        // 문자열로 된 수식을 계산한 값을 return
        return answer;
    }

    public static void main(String[] args) {
        int my_string = new 문자열계산하기().solution("3 + 4");
        System.out.println(my_string); // 7
    }
}