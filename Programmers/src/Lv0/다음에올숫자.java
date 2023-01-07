package Lv0;

class 다음에올숫자 {
    public int solution(int[] common) {
        // 등차수열 혹은 등비수열 common
        // 마지막 원소 다음으로 올 숫자를 return
        return ((common[1] - common[0]) == (common[2] - common[1]))
                ? common[common.length - 1] + (common[1] - common[0]) // 일률적으로 더해지면 마지막 원소에 그만큼 더하기
                : common[common.length - 1] * common[1] / common[0]; // 일률적으로 곱해지면 마지막 원소에 그만큼 곱하기
    }

    public static void main(String[] args) {
        int[] common1 = new int[]{1, 2, 3, 4};
        int[] common2 = new int[]{2, 4, 8};

        int result1 = new 다음에올숫자().solution(common1);
        int result2 = new 다음에올숫자().solution(common2);

        System.out.println(result1); // 5
        System.out.println(result2); // 16
    }
}