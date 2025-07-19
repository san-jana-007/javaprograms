package program1;

class Calculator{
	double a;
	double b;
	String typeofoperation;
	
	void calc(String typeofoperation,double a,double b ) {
		this.typeofoperation=typeofoperation;
		this.a=a;
		this.b=b;
		switch(typeofoperation) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "div":
			System.out.println(a/b);
			break;
		default:
			System.out.println("not a valid operation");
		}
	}
	
}


public class Program1 {
	public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.calc("add", 10, 20);
	}

}
