package ch02;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			//byte�� �ִ밡 127�� ������ �ٽ� -128���� �����Ѵ�.
			System.out.println("var1 " + var1 + "\t" + "var2: " + var2);
		}
		
	}
}
