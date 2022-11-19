package Lv0;

class 나이출력 {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        int age1 = 40;
        int age2 = 23;
        int answer1 = new 나이출력().solution(age1);
        int answer2 = new 나이출력().solution(age2);
        System.out.println("2022년도 기준으로 " + age1 + "살은 " + answer1 + "년 출생입니다."); // 2022년도 기준으로 40살은 1983년 출생입니다.
        System.out.println("2022년도 기준으로 " + age2 + "살은 " + answer2 + "년 출생입니다."); // 2022년도 기준으로 23살은 2000년 출생입니다.
    }
}