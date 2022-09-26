package exercise9_1;

/* John Macdonald
 * Sept. 20, 2022
 * 
 * This code creates
 * and tests rectangles
 * */

class Rectangle {
		
		//data fields
		double width = 1;
		double height = 1;
		
		//constructors
		Rectangle() {
		}// Rectangle end
				
		Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
		}//Rectangle end
	
		//Methods
	public double getArea(double width, double height) {
		double rarea = width * height;
		return rarea;
	}//area method end
	
	public double getPerimeter(double width, double height) {
		double rperi = 2 * (width + height);
		return rperi;
	}//perimeter method end
	
	public double area = getArea(width, height);
	public double perimeter = getPerimeter(width, height);
	
}//class end