package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class Triangle {
	public String compare(int a,int b,int c){
		if(a==b && b==c)
			return "equilateral";
		else if(a==b||b==c||a==c)
			return "isosceles";
		else
			return "scalene";
	}
}
