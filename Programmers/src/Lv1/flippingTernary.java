package Lv1;

import java.util.*;
//3���� ������
class flippingTernary {
    public int solution(int n) { //�Ű����� n
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        
        // 10���� -> 3����(����)
        while(true){
            if(n<3){ temp.add(n); break; }
            temp.add(n%3);
            n = n/3;
        }
        // 3����(����) -> 10����
        for(int i=0; i<temp.size(); i++){
            answer += (Math.pow(3,temp.size()-i-1)*temp.get(i));
        }
        
        return answer;
    }
}