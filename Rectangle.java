
public class Rectangle {
	int width;
	int height;
	public Rectangle(int width2, int height2) {
	width=width2;
	height=height2;
	}
	public int  GetArea() {
		int Area= (width*height);
		return Area;
	}
	public int GetPer() {
		int Per=(width+height);
		return Per;
	}
}