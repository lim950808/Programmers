package Lv0;

class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        // 문자들을 ""로 나눠서 배열에 담음.  ex) ["h", "e", "l", "l", "o"]
        String[] arr = my_string.split("");

        // 배열 arr에서 num1번째 문자를 임시 변수 temp에 넣음
        String temp = arr[num1];
        // num2번째 문자를 num1번째 문자와 대치
        arr[num1] = arr[num2];
        // 처음 num1번째 문자를 담았던 temp를 다시 num2번째에 담음
        arr[num2] = temp;

        // my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return
        // 배열 arr에서 ""로 나눠져 있던 요소들을 하나의 문자열로 만듬
        return String.join("", arr);
    }

    public static void main(String[] args) {
        String result1 = new 인덱스바꾸기().solution("hello", 1, 2);
        String result2 = new 인덱스바꾸기().solution("I love you", 3, 6);

        System.out.println(result1); // hlelo
        System.out.println(result2); // I l veoyou
    }
}