package thisisjava;

public class rhombus {

	public static void main(String[] args) {
		
		//마름모 찍기
		
		//삼각형
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//역삼각형
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 3-i; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
