package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testTriangle_1() {

		double sides = 7;
		double angles = 60;

		Triangle t1 = null;
		try {
			t1 = new Triangle(sides);
		} catch (Exception e) {
			fail("TestTriangle Failed");
		}

		System.out.println("I Am Here");

	}

	@Test
	void testTriangle_2() {

		double sides = -7;
		double angles = 60;
		assertThrows(Exception.class, () -> {
			Triangle t1 = new Triangle(sides);
		});

	}
}