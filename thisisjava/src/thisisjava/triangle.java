package thisisjava;

public class triangle {

	public static void main(String[] args) {
		
//		//직각 삼각형
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//방향 반대로
//		for (int i = 1; i < 5; i++) {
//			for (int j = 4; j > 0; j--) {
//				if(i<j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//		//역삼각형
//		for (int i = 0; i < 5; i++) {
//			for (int j = i; j < 4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//방향 반대로
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 4-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//피라미드
//		for (int i = 0; i < 4; i++) {
//			for (int j = 3; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2*i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//역피라미드
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 4*2-i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
