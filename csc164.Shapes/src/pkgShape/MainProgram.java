package pkgShape;

public class MainProgram {

	public static void main(String[] args) {

		ArrayList<Shape> shapes = new ArrrayList<Shape>();
		
		shapes.add(new Rectangle(10,20));
		shapes.add(new Triangle(7));
		
		for (Shape s: shapes)
		{
			if (s instanceof Shape)
				System.out.println("This is a Shape");
			
			if (s instanceof Rectangle)
				System.out.println("This is a Rectangle");
			
			if (s instanceof Triangle)
				System.out.println("This is a Triangle");
		}

	}

}
