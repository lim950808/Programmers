package Lv0;

class 영어가싫어요 {
    public long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            // replaceAll(변환하고자 하는 대상이 될 문자열, 변환할 문자 값)
            // String.valueOf(i) : int 타입의 i를 String 형태로 출력
            numbers = numbers.replaceAll(arr[i], String.valueOf(i));
        }

        // String 타입의 numbers를 Long 타입으로 형 변환
        long answer = Long.parseLong(numbers);

        // 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return
        return answer;
    }

    public static void main(String[] args) {
        long answer1 = new 영어가싫어요().solution("onetwothreefourfivesixseveneightnine");
        long answer2 = new 영어가싫어요().solution("onefourzerosixseven");

        System.out.println(answer1); // 123456789
        System.out.println(answer2); // 14067
    }
}