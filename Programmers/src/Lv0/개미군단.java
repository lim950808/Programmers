package Lv0;

class 개미군단 {
    public int solution(int hp) {
        // 장군개미는 5의 공격력
        // 병정개미는 3의 공격력
        // 일개미는 1의 공격력
        // 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return

        int answer = hp / 5;        // 필요한 장군개미의 수
        hp %= 5;                    // 장군개미를 전부 상대하고 남은 hp

        answer += hp / 3;           // 남은 hp에 필요한 병정개미의 수
        hp %= 3;                    // 병정개미를 전부 상대하고 남은 hp

        answer += hp / 1;           // 남은 hp에 필요한 일개미의 수

        return answer;
    }

    public static void main(String[] args) {
        // 사냥감의 체력
        int hp1 = 23;
        int hp2 = 24;
        int hp3 = 999;

        int answer1 = new 개미군단().solution(hp1);
        int answer2 = new 개미군단().solution(hp2);
        int answer3 = new 개미군단().solution(hp3);

        System.out.println(hp1 + "의 체력을 가진 사냥감을 상대하려면 " + answer1 + "마리의 개미가 필요합니다."); // 5
        System.out.println(hp2 + "의 체력을 가진 사냥감을 상대하려면 " + answer2 + "마리의 개미가 필요합니다."); // 6
        System.out.println(hp3 + "의 체력을 가진 사냥감을 상대하려면 " + answer3 + "마리의 개미가 필요합니다."); // 201
    }
}
