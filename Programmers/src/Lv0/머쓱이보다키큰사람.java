package Lv0;

class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;

        // 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height
        for (int i : array) {
            if (i > height) answer++;
        }

        // 머쓱이보다 키 큰 사람 수를 return
        return answer;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{149, 180, 192, 170};
        int[] array2 = new int[]{180, 120, 140};

        int answer1 = new 머쓱이보다키큰사람().solution(array1, 167);
        int answer2 = new 머쓱이보다키큰사람().solution(array2, 190);

        System.out.println(answer1); // 3
        System.out.println(answer2); // 0
    }
}