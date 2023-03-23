package exam06;

public class Calculator {

	/**
	 * 정사각형의 넓이 구하기
	 * @param width
	 * @return width*width
	 */
	public double areaRectangle(double width) {
	return width * width;
	}

	/**
	 * 직사각형의 넓이 구하기
	 * @param width
	 * @param height
	 * @return width*height
	 */
	public double areaRectangle(double width, double height) { // 메서드의 오버로딩
	return width * height;
	}
	
	
	
}
