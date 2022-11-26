package Lv0;

class 모스부호1 {
    public String solution(String letter) {
        String answer = "";

        // a ~ z에 해당하는 모스부호가 순서대로 담긴 배열
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] sign = letter.split(" ");

        for (int i = 0; i < sign.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (sign[i].equals(morse[j])) {
                    // 아스키코드에서 97을 더하면 각 부호의 해당 소문자로 바뀜
                    answer += (char)(j + 97);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String answer1 = new 모스부호1().solution(".... . .-.. .-.. ---");
        String answer2 = new 모스부호1().solution(".--. -.-- - .... --- -.");

        System.out.println(answer1); // hello
        System.out.println(answer2); // python
    }
}