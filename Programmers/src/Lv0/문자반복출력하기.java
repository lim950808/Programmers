package Lv0;

class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String str = "";

        // 배열 arr에 .split()을 사용하여 한 글자 씩 담는다.
        String[] arr = my_string.split("");

        // my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return
        for(int i = 0; i < my_string.length(); i++) {
            // .repeat(n) : n만큼 반복
            str += arr[i].repeat(n);
        }

        return str;
    }

    public static void main(String[] args) {
        String answer = new 문자반복출력하기().solution("hello", 3);
        System.out.println(answer); // hhheeellllllooo
    }
}