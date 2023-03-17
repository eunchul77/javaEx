package bmiEx;

public class test2 {

	public static void main(String[] args) {
		String str1 = 2 + 3+ "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		System.out.println("test3");
		
		byte value = Byte.parseByte("10");
		int value1 = Integer.parseInt("1000");
		float value2 = Float.parseFloat("20.5");
		double value3 = Double.parseDouble("3.14159");
		
		System.out.println("==========================");
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		System.out.println("test4");
		System.out.println("==========================");
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1 + var2); 
		System.out.println(result);
	}
}
