package Lv0;

class 가위바위보 {
    public String solution(String rsp) {
        // 가위는 2
        // 바위는 0
        // 보는 5
        // 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp

        // .toCharArray() : 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 넣음
        char[] charArr = rsp.toCharArray();
        // StringBuilder : 문자열을 버퍼에 담은 후 그 안에서 추가, 수정, 삭제 작업을 할 수 있도록 도와주는 클래스
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case '0' : // 바위
                    answer.append("5"); // 보
                    break;
                case '2' : // 가위
                    answer.append("0"); // 바위
                    break;
                case '5' : // 보
                    answer.append("2"); // 가위
                    break;
            }
        }

        // rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return
        // String으로 변환
        return answer.toString();
    }
}