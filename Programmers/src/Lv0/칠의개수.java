package Lv0;

class 칠의개수 {
    public int solution(int[] array) {
        int answer = 0;

        for (int a : array) { // array 배열을 하나씩 돌면서
            while (a != 0) { // 0이 아닌 요소들 중
                if (a % 10 == 7) { // 10으로 나누었을 때 나머지가 7인 요소가 있으면
                    answer++; // count를 하나 늘린다.
                }
                a /= 10; // a를 10으로 나눠서 나온 몫을 다시 a에 대입
            }
        }

        // 정수 배열 array에 7이 총 몇 개 있는지 return
        return answer;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{7, 77, 17};
        int[] array2 = new int[]{10, 29};

        int answer1 = new 칠의개수().solution(array1);
        int answer2 = new 칠의개수().solution(array2);

        System.out.println(answer1); // 4
        System.out.println(answer2); // 0
    }
}