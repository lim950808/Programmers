package Lv0;

class 옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;

        // "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음 밖에 하지 못합니다.
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");

            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        // 발음할 수 있는 단어의 개수를 return
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling1 = new String[]{"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int answer1 = new 옹알이1().solution(babbling1);
        int answer2 = new 옹알이1().solution(babbling2);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 3
    }
}