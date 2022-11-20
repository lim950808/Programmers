package Lv0;

class 로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        // 입력한 아이디와 패스워드가 담긴 배열 id_pw
        // 회원들의 정보가 담긴 2차원 배열 db
        // id_pw와 db의 원소는 [아이디, 패스워드] 형태
        // 로그인 성공, 실패에 따른 메시지를 return
        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                if(db[i][1].equals(id_pw[1])) {
                    return "login"; // 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return
                }
                return "wrong pw"; // 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return
            }
        }
        return "fail"; // 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를 return
    }

    public static void main(String[] args) {
        String[] id_pw1 = new String[]{"meosseugi", "1234"};
        String[] id_pw2 = new String[]{"programmer01", "15789"};
        String[] id_pw3 = new String[]{"rabbit04", "98761"};

        String[][] db1 = new String[][] {
                {"rardss", "123"},
                {"yyoom", "1234"},
                {"meosseugi", "1234"}
        };
        String[][] db2 = new String[][] {
                {"programmer02", "111111"},
                {"programmer00", "134"},
                {"programmer01", "1145"}
        };
        String[][] db3 = new String[][] {
                {"jaja11", "98761"},
                {"krong0313", "29440"},
                {"rabbit00", "111333"}
        };

        String answer1 = new 로그인성공().solution(id_pw1, db1);
        String answer2 = new 로그인성공().solution(id_pw2, db2);
        String answer3 = new 로그인성공().solution(id_pw3, db3);

        System.out.println(answer1); // login
        System.out.println(answer2); // wrong pw
        System.out.println(answer3); // fail
    }
}