package Lv0;

class 삼육구게임 {
    public int solution(int order) {
        int answer = 0;
        int count = 0;

        // 말해야하는 숫자 order가 10으로 나누었을때 0일이 될 때까지 3,6,9가 들어간 숫자를 찾는다.
        while (order != 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                count++;
            }
            order = order / 10;
        }

        answer = count;

        // 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
        // 쳐야할 박수 횟수를 return
        return answer;
    }

    public static void main(String[] args) {
        int answer1 = new 삼육구게임().solution(3);
        int answer2 = new 삼육구게임().solution(29423);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 2
    }
}