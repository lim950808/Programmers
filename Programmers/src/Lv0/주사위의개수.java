package Lv0;

class 주사위의개수 {
    public int solution(int[] box, int n) {
        // 주사위 모서리의 길이 정수 n
        // box의 길이는 3
        // box[0] = 상자의 가로 길이
        // box[1] = 상자의 세로 길이
        // box[2] = 상자의 높이 길이

        // 상자에 들어갈 수 있는 주사위의 최대 개수를 return
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        int[] box1 = new int[]{1, 1, 1};
        int[] box2 = new int[]{10, 8, 6};

        int answer1 = new 주사위의개수().solution(box1, 1);
        int answer2 = new 주사위의개수().solution(box2, 3);

        System.out.println(answer1); // 1
        System.out.println(answer2); // 12
    }
}