package lamda.functionalinterface;

import java.util.function.IntSupplier;

public class SupplierExample { // 매개 변수가 없고 리턴값 출력 - 공급만 하는 역할

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}
}
