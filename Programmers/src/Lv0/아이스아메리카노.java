package Lv0;

// jaehafe 잘봐 이게 문제풀이야
// 단순히 문제만 푸는게 아니라 테스트 코드까지 넣어서 동작이 잘 되나 시험하는게 진짜 "개발"이지
// 너가 어려워서 베낀다고 남들도 똑같이 너 같은 건 아니야
// 그리고 너가 혼자 생각한대로 정답을 정해두고 남들과 대화를 제발 하지마
// 반박할 가치도 없을 뿐더러 쓸모 없는 논쟁 밖에 안 돼서 집 오면 피곤하다.

import java.util.Arrays;

class 아이스아메리카노 {
    public int[] solution(int money) {
        // 아이스 아메리카노는 한잔에 5,500원
        // 가지고 있는 돈 money
        // 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return
        int[] answer = new int[] {money / 5500, money % 5500};
        return answer;
    }

    public static void main(String[] args) {
        // 5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
        int[] answer1 = new 아이스아메리카노().solution(5500);
        System.out.println(Arrays.toString(answer1)); // [1, 0]

        //15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.
        int[] answer2 = new 아이스아메리카노().solution(15000);
        System.out.println(Arrays.toString(answer2)); // [2, 4000]
    }
}