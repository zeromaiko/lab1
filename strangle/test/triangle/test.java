package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class test
{
	private Triangle tri;
	private Triangle tri2;
	private Triangle tri3;
	@Test
	public void testtri()
	{
		tri= new Triangle();
		assertEquals("equilateral", tri.compare(3, 3, 3));
		tri2= new Triangle();
		assertEquals("isosceles", tri2.compare(2, 2, 3));
		tri3= new Triangle();
		assertEquals("scalene", tri3.compare(1, 2, 4));
	}
}