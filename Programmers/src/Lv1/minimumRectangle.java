package Lv1;
//최소직사각형
class minimumRectangle {
	public int solution (int[][] sizes) {
		int max_width = 0;
		int max_height = 0;
		int wallet_size;
		
		for(int i=0; i<sizes.length; i++) {
			int temp;
			for(int j=0; j<2; j++) {
				//가로보다 세로가 더 길다면 두 인덱스 변경
				if(sizes[i][0] < sizes[i][1]) {
					temp = sizes[i][0];
					sizes[i][0] = sizes[i][1];
					sizes[i][1] = temp;
				}
				//가로 길이가 가장 긴 것
				if(max_width < sizes[i][0]) {
					max_width = sizes[i][0];
				}
				//세로 길이가 가장 긴 것
				if(max_height < sizes[i][1]) {
					max_height = sizes[i][1];
				}
			}
		}
		wallet_size = max_width * max_height;
		return wallet_size;
	}
}