package Lv0;

class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        // 알파벳이 담긴 배열 spell
        // 외계어 사전 dic
        for (String dic_Str : dic) {
            boolean ifExists = true;
            for (String spell_Str : spell) {
                if (dic_Str.indexOf(spell_Str) == -1) {
                    ifExists = false;
                    break;
                }
            }
            if (ifExists) {
                answer = 1;
                break;
            }
        }

        // spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return
        return answer;
    }

    public static void main(String[] args) {
        String[] spell_1 = new String[]{"p", "o", "s"};
        String[] spell_2 = new String[]{"z", "d", "x"};
        String[] spell_3 = new String[]{"s", "o", "m", "d"};

        String[] dic_1 = new String[]{"sod", "eocd", "qixm", "adio", "soo"};
        String[] dic_2 = new String[]{"def", "dww", "dzx", "loveaw"};
        String[] dic_3 = new String[]{"moos", "dzx", "smm", "sunmmo", "som"};

        int answer_1 = new 외계어사전().solution(spell_1, dic_1);
        int answer_2 = new 외계어사전().solution(spell_2, dic_2);
        int answer_3 = new 외계어사전().solution(spell_3, dic_3);

        System.out.println(answer_1); // 2
        System.out.println(answer_2); // 1
        System.out.println(answer_3); // 2
    }
}