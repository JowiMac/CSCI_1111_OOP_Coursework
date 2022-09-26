package exercise9_1;

public class TestRectangle {
	public static void main(String[] args) {
		
		//How do I input these double numbers into the Rectangle(); function
		
		Rectangle rectangle1 = new Rectangle();
		System.out.println("The width of the rectangle is " + rectangle1.width);
		System.out.println("The height of the rectangle is " + rectangle1.height);
		System.out.println("The area of the rectangle is " + rectangle1.area);
		System.out.println("The perimeter of the rectangle is " + rectangle1.perimeter + "\n\n");
		
		
		Rectangle rectangle2 = new Rectangle(4.0, 40.0);
		System.out.println("The width of the rectangle is " + rectangle2.width);
		System.out.println("The height of the rectangle is " + rectangle2.height);
		System.out.println("The area of the rectangle is " + rectangle2.getArea(4.0, 40.0));
		System.out.println("The perimeter of the rectangle is " + rectangle2.getPerimeter(4.0, 40.0) + "\n\n");
		
		
		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		System.out.println("The width of the rectangle is " + rectangle3.width);
		System.out.println("The height of the rectangle is " + rectangle3.height);
		System.out.println("The area of the rectangle is " + rectangle3.getArea(3.5, 35.9));
		System.out.println("The perimeter of the rectangle is " + rectangle3.getPerimeter(3.5, 35.9) + "\n\n");
		
		
	}//main method end
	
}//TestRectangle class end