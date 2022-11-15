package Lv0;

class 배열의평균값 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }

        answer = (double)sum/arr.length;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        double answer1 = new 배열의평균값().solution(arr1);
        double answer2 = new 배열의평균값().solution(arr2);

        System.out.println(answer1); // 5.5
        System.out.println(answer2); // 94.0
    }
}