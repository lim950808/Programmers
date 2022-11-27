package Lv0;

class 중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";

        // 공백(" ")도 하나의 문자로 구분
        // 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
        for (int i = 0; i < my_string.length(); i++) {
            // indexOf() : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환
            // charAt(i) : i번 째 문자열 받기
            if (i == my_string.indexOf(my_string.charAt(i))) {
                answer += my_string.charAt(i);
            }
        }

        // my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return
        return answer;
    }

    public static void main(String[] args) {
        String answer1 = new 중복된문자제거().solution("people");
        String answer2 = new 중복된문자제거().solution("We are the world");

        System.out.println(answer1); // peol
        System.out.println(answer2); // We arthwold // 공백도 하나의 문자로 구분하므로 공백은 하나 밖에 적용 안 됨.
    }
}