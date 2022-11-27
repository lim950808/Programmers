package Lv0;

class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        // 머쓱이가 갖고 있는 구슬의 개수 balls
        // 친구들에게 나누어 줄 구슬 개수 share
        // balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수(numberOfCases)를 return
        return numberOfCases(balls, share); // numberOfCases 메서드 호출
    }

    public int numberOfCases(int balls, int share) {
        if (share == 0 || balls == share) { // 갖고 있는 구슬 수가 0개이거나, 갖고 있는 구슬 수와 나누어 줄 구슬 수가 같으면 1을 리턴
            return 1;
        } else {
            // 재귀적으로 다시 numberOfCases 호출
            int case1 = numberOfCases(balls-1, share-1);
            int case2 = numberOfCases(balls-1, share);
            return case1 + case2;
        }
    }

    public static void main(String[] args) {
        int answer1 = new 구슬을나누는경우의수().solution(3, 2);
        int answer2 = new 구슬을나누는경우의수().solution(5, 3);

        System.out.println(answer1); // 3
        System.out.println(answer2); // 10
    }
}