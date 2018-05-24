package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void RectangleTestArea() {
		
		int iWidth = 10;
		int iLength = 20;
		double dArea = 200;
		double dPerimeter = 60;
		
		Rectangle rec1 = new Rectangle(iWidth,iLength);
		
		assertEquals(dArea, rec1.Area(), 0.01);
		assertEquals(dPerimeter, rec1.Perimeter(), 0.01);

	
	}

	@Test
	Public void RectangleIsSquare()
	{
		int iWidth = 10;
		int iLength = 20;
		Rectangle rec1 = new Rectangle(iWidth,iLength);
		
		assertFalse(rec1.isSquare());
		rec1.setWidth(20);
		
		assertTrue(rec1.isSquare());
	}
}

