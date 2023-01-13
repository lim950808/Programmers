package Lv1;

class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        // 학생 배열에서 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사
        // 학생들 중 삼총사를 만들 수 있는 방법의 수를 return
        return answer;
    }

    public static void main(String[] args) {
        int[] number1 = new int[]{-2, 3, 0, 2, -5};
        int[] number2 = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int[] number3 = new int[]{-1, 1, -1, 1};

        int answer1 = new 삼총사().solution(number1);
        int answer2 = new 삼총사().solution(number2);
        int answer3 = new 삼총사().solution(number3);

        System.out.println(answer1); // 2
        System.out.println(answer2); // 5
        System.out.println(answer3); // 0
    }
}