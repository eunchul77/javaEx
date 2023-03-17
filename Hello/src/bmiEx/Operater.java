package bmiEx;

public class Operater {

	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		
		// byte, short, char타입은 연산시에 int타입으로 변환 되어서 연산됩니다. ==> 그 결과 int 타입이 반환 됩니다.
		// byte byteValue2 = byteValue + byteValue1;
		byte byteValue2 = (byte) (byteValue + byteValue1); // 강제타입 변환할때는 연산부터 함		
		int intValue2 = byteValue + byteValue1;
		
		// 실수의 연산 =========================================
		int iValue = 10; // => 10.0
		double dValue = 5.5;
		double result = iValue + dValue;
		System.out.println(result);
		System.out.println((double)iValue);
		
		System.out.println((double)5/2); // 5.0(double)/2(int) = 2.5
		System.out.println(5/(double)2); // 5(int)/2.0(double) = 2.5
		System.out.println((double)(5/2)); // 이렇게 하면 안됨 !! 5(int)/(int)2 = 2 = (double) 2 = 2.0
		
		// 문자열을 기본 타입으로 강제 타입변환하는 방법 =================================
		String str = "200";
		
		// parseInt(str) : int
		// string타입의 매개변수를 넣고 실행결과 int타입을 반환 받는다.
		int i = Integer.parseInt(str);
		System.out.println("======== 문자열을 기본 타입으로 강제 타입변환하는 방법 ==========");
		System.out.println(i);
		
		str = "10";
		byte bValue1 = Byte.parseByte(str);
		System.out.println(bValue1);
		
		str = "12.345";
		double dValue1 = Double.parseDouble(str);
		System.out.println(dValue1);
		
		str = "true";
		boolean bValue2 = Boolean.parseBoolean(str);
		System.out.println(bValue2);
		
		
		//short value1 = Short.parseShort(str);
		//long value2 = Long.parseLong(str);
		//float value3 = Float.parseFloat(str);
		
		
		// 숫자를 문자열로 바꾸는것
		System.out.println("====================");
		String strValue = String.valueOf(123);
		System.out.println(String.valueOf(123.11));
		String.valueOf('가');
		String.valueOf(true);
		
	


		
	}

}
