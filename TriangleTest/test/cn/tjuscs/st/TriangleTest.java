package cn.tjuscs.st;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TriangleTest {
	
	private Triangle tri;
    private int input1;
    private int input2;
    private int input3;
    private String expected;
    
    public TriangleTest(int input1, int input2, int input3, String expected){
    	this.input1 = input1;
    	this.input2 = input2;
    	this.input3 = input3;
    	this.expected = expected;
    }
    
	@Before
	public void setUp(){
		tri = new Triangle(input1, input2, input3);
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
				{2,2,2,"equilateral"},
	            {2,4,3,"scalene"},
	            {2,3,3,"isoscele"},
	            {2,9,2,"not a triangle"}
		});
	}
	
	@Test
	public void testTriangle() throws Exception{
		assertEquals(this.expected, tri.type(tri));
	}
	
}
