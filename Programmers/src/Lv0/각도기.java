package Lv0;

class 각도기 {
    public int solution(int angle) {
        if (angle > 0 && angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle > 90 && angle < 180) return 3;
        else return 4;
    }

    public static void main(String[] args) {
        int answer1 = new 각도기().solution(70);
        int answer2 = new 각도기().solution(91);
        int answer3 = new 각도기().solution(180);
        System.out.println(answer1); // 1
        System.out.println(answer2); // 3
        System.out.println(answer3); // 4
    }
}