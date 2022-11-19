package Lv0;

class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        // n의 각 자릿수를 문자열에 넣어 문자열 배열을 만들고, split("")을 이용해 각 자릿수로 문자열을 쪼깨어 문자열 배열을 만든다.
        String[] arr = String.valueOf(n).split("");

        // 문자열 타입으로 되어 있는 숫자를 int 타입의 숫자 타입으로 바꾼 후 하나씩 더해준다.
        for(String str : arr) {
            answer += Integer.parseInt(str);
        }

        // n의 각 자리 숫자의 합을 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 자릿수더하기().solution(1234);
        int answer2 = new 자릿수더하기().solution(930211);

        System.out.println(answer1); // 10
        System.out.println(answer2); // 16
    }
}