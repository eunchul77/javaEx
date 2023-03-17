package bmiEx;

public class Test1 {

	public static void main(String[] args) {
		
		
		long var1 = 2l;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1 + (double)var2 + (int)var3 + Double.parseDouble(var4));
		System.out.println(result);
	
		int result2 = (int)(var1 + (double)var2 + (double)var3 + (int)(Double.parseDouble(var4)));
		System.out.println(result2);

		
		int i = (int)var1;
		System.out.println(i);
		int i2= (int)(var2 +var3);
		System.out.println(i2);
		int i3 = (int)Double.parseDouble(var4);
		System.out.println(i3);
		System.out.println(i + i2 + i3);
		
		int y = (int)var1 + (int)(var2 +var3) + (int)Double.parseDouble(var4);
		System.out.println(y);
	}

}
