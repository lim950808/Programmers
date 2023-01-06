package Lv0;

class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;

        // int형인 num을 String형으로 변환하여 문자열 str에 넣음
        String str = String.valueOf(num);

        // num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return
        // int형인 k를 String형으로 변환하여 문자열 str에서 몇 번째의 인덱스 값인지 반환
        answer = str.indexOf(String.valueOf(k));

        // num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return
        // 인덱스 값이 음수이면 그 값을 반환하고, 0이거나 0 보다 크면 1을 더함.
        return (answer < 0) ? answer : answer + 1;
    }

    public static void main(String[] args) {
        int result1 = new 숫자찾기().solution(29183, 1);
        int result2 = new 숫자찾기().solution(232443, 4);
        int result3 = new 숫자찾기().solution(123456, 7);

        System.out.println(result1); // 3
        System.out.println(result2); // 4
        System.out.println(result3); // -1
    }
}