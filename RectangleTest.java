import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//created a scanner object
		Scanner scan= new Scanner(System.in);

		//a loop that will run 3times
		for(int i=0; i<3;i++) {

			//Ask user information
			System.out.println("Please Enter width and height");
			int width= scan.nextInt();
			int height=scan.nextInt();

			//created a rectangle
			Rectangle one= new Rectangle(width,height);

			//printed out area and per
			System.out.println(one.GetArea());
			System.out.println(one.GetPer());

		}

	}

}
