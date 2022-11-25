package Lv0;

class 공던지기 {
    public int solution(int[] numbers, int k) {
        // 친구들의 번호가 들어있는 정수 배열 numbers
        // 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
        // k번째로 공을 던지는 사람의 번호는 무엇인지 return
        return (k - 1) * 2 % numbers.length + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr3 = new int[]{1, 2, 3};

        int answer1 = new 공던지기().solution(arr1, 2);
        int answer2 = new 공던지기().solution(arr2, 5);
        int answer3 = new 공던지기().solution(arr3, 3);

        System.out.println(answer1); // 3
        System.out.println(answer2); // 3
        System.out.println(answer3); // 2
    }
}