package test;

public class main {

	public static void main(String[] args) {

		Fraction a=new Fraction(0,0,"");
		Fraction b=new Fraction(0,0,"");
				
		a.n = 3; a.d=9; a.name="הנמבü ¹1";
		b.n = 1; b.d=5; b.name="הנמבü ¹2";
		
				
		System.out.println(a);
		System.out.println(b);
			
		System.out.println(a.add(b));
		System.out.println(a.sub(b));
		System.out.println(a.mul(b));
		System.out.println(a.div(b));

		
	}

}

