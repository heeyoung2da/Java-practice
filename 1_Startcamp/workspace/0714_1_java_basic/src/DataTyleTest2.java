
public class DataTyleTest2 {

	public static void main(String[] args) {
		
		int price = 50000000;
		int amount = 100;
		long totalPrice = (long)price * amount;
		System.out.println(totalPrice); // overflow 발생해서 값이 제대로 안 나옴. -> 명시적 형변환 (long)int * int => long * int => long * long => long
		
		// 계산할 때 명시적 형변환을 해줘야 할때는 원래의 값을 변경해주기 보다는 계산할 때 변경을 해줘야 함. 
		// 2^(n-1) ~ 2^(n-1)-1
		
		int[] score = {100, 92, 91};
		double avg = 0.0;
		
		int sum = 0;
		for(int s: score) {
			sum += s;
		}
		
		avg = sum/score.length; 	// int/int ==> int
		avg = (double)sum/score.length; 	// (double)int/int ==> double/int ==> double/double ==> double
		System.out.println(avg);
		
	}
}
