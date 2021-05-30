package ch02;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			//byte는 최대가 127이 넘으면 다시 -128부터 시작한다.
			System.out.println("var1 " + var1 + "\t" + "var2: " + var2);
		}
		
	}
}
