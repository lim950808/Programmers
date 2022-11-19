package Lv0;
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;
        int arr_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > arr_max) {
                arr_max = array[i];
            }
        }

        int[] count = new int[arr_max + 1];
        int max = 0;

        int n = 0;
        int mode = 0;

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            mode++;

            if (count[i] == max) {
                n++;
            }
        }

        // 최빈값이 여러 개면 -1을 return
        if (n > 1)
            answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 3, 3, 4};
        int[] arr2 = new int[]{1, 1, 2, 2};
        int[] arr3 = new int[]{1};

        int answer1 = new 최빈값구하기().solution(arr1);
        int answer2 = new 최빈값구하기().solution(arr2);
        int answer3 = new 최빈값구하기().solution(arr3);

        System.out.println(answer1); // 3
        System.out.println(answer2); // -1
        System.out.println(answer3); // 1
    }
}