package bmiEx;

public class CastingEx {

	public static void main(String[] args) {
		
		int iValue = 65;
		char charValue = (char) iValue;
		
		System.out.println(iValue);
		System.out.println(charValue);
		
		long lValue = 500;
		iValue = (int) lValue;
		
		System.out.println(iValue);
		
		float fValue = 3.14f;
		iValue = (int) fValue;
		
		System.out.println(iValue);
		
		int intValue = 129;
		byte byteValue = (byte) intValue; // -128~127 // 허용범위가 넘어가는데 억지로 넣을경우 로테이션이 될수 있다. 
		System.out.println("===========================");
		System.out.println(intValue);
		System.out.println(byteValue);
		
	}
	
}
