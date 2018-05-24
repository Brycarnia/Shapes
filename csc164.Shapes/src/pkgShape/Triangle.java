package pkgShape;

public class Triangle extends Shape {

	private double s1;
	private double s2;
	private double s3;

	public Triangle(double side1, double side2, double side3) throws Exception {

		this.s1 = side1;
		this.s2 = side2;
		this.s3 = side3;

		if (SquareArea() < 0) {
			throw new Exception("Illegal Triangle");
		}
	}

	public Triangle(double side) throws Exception {
		this.s1 = side;
		this.s2 = side;
		this.s3 = side;

		if (side < 0) {
			throw new Exception("Illegal Triangle");
		}
	}

	public Triangle(double side1, double side2, float angle) {
		double s1 = (side2 * side2) + (side2 * side2) - (2 * side1 * side2) * Math.cos((double) angle);
		this.s1 = side1;
		this.s2 = side2;
		this.s3 = Math.sqrt(s3);
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public double AngleA() {
		// Angle A equals angle between S2 and s3
		double ang = ((this.s2 * this.s2) + (this.s3 * this.s3) - (this.s1 * this.s1)) / (2 * this.s2 * this.s3);
		return Math.acos(ang) * (180 / Math.PI);
	}

	public double AngleB() {
		// Angle B equals angle between S1 and s3
		double ang = ((this.s3 * this.s3) + (this.s1 * this.s1) - (this.s2 * this.s2)) / (2 * this.s3 * this.s1);
		return Math.acos(ang) * (180 / Math.PI);
	}

	public double AngleC() {
		// Angle C equals angle between S1 and s2
		double ang = ((this.s2 * this.s2) + (this.s1 * this.s1) - (this.s3 * this.s3)) / (2 * this.s2 * this.s1);
		return Math.acos(ang) * (180 / Math.PI);
	}

	public double SquareArea() {
		double area = this.HalfPerimeter() * (this.HalfPerimeter() - this.s1) * (this.HalfPerimeter() - this.s2)
				* (this.HalfPerimeter() - this.s3);
		return area;
	}

	public double Area() {
		return Math.sqrt(this.SquareArea());
	}

	public double Perimeter() {
		return s1 + s2 + s3;
	}

	private double HalfPerimeter() {
		return Perimeter() / 2;
	}

	public boolean AreSidesEqual() {
		boolean isEqual = false;

		if ((this.s1 == this.s2) && (this.s1 == this.s3) && (this.s2 == this.s3))
			isEqual = true;
		return isEqual;
	}

}
