package cn.tjuscs.st;

public class Triangle {
	
	public int a = 0;
	public int b = 0;
	public int c = 0;
	
	public Triangle(int SideA, int SideB, int SideC){
		a = SideA;
		b = SideB;
		c = SideC;
	}
	
	public boolean isTriangle(Triangle tri){
		if(tri.a<=0 || tri.b<=0 || tri.c<=0){
			return false;
		}
		if((tri.a + tri.b) < tri.c || (tri.a + tri.c) < tri.b || (tri.b + tri.c) < tri.a){
			return false;
		}
			
		return true;
	}
	
	public boolean isIsosceles(Triangle tri){
		if(tri.a == tri.b && tri.c == tri.b && tri.a == tri.c){
			return false;
		}
		if(tri.a == tri.b || tri.c == tri.b || tri.a == tri.c){
			return true;
		}
		return false;
	}
	
	public boolean isScalene(Triangle tri){
		if(tri.a == tri.b && tri.c == tri.b && tri.a == tri.c){
			return true;
		}
		return false;
	}
	
	public String type(Triangle tri){
		if(isTriangle(tri)){
			
			if(isIsosceles(tri)){
				return "isoscele";
			}
			if(isScalene(tri)){
				return "equilateral";
			}
			return "scalene";
		}
		return "not a triangle";
	}
}