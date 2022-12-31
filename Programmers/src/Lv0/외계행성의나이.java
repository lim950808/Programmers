package Lv0;

class 외계행성의나이 {
    public String solution(int age) {
        // PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
        // a는 0, b는 1, c는 2, ..., j는 9
        // 23살은 cd, 51살은 fb

        // int인 age를 String으로 변환
        String ageStr = Integer.toString(age);
        String result = "";

        // 해당 숫자의 아스키 코드로 변환
        for (int i = 0; i < ageStr.length(); i++) {
            result += (char)(ageStr.charAt(i) + 49);
        }

        // PROGRAMMER-962식 나이를 return
        return result;
    }

    public static void main(String[] args) {
        int age1 = 23;
        int age2 = 51;
        int age3 = 100;

        String result1 = new 외계행성의나이().solution(age1);
        String result2 = new 외계행성의나이().solution(age2);
        String result3 = new 외계행성의나이().solution(age3);

        System.out.println(result1); // cd
        System.out.println(result2); // fb
        System.out.println(result3); // baa
    }
}