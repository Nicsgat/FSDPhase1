package de;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal= new Calculator();
		int result= cal.multiply(8,6);
		int result1= cal.multiply(2);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(cal.sum(8,6) + cal.diffrence(8, 5));
		System.out.println(cal.diffrence(10, 4));
		
		//type casting
		float f=  10;  //here 10 is int and is calling implicit type casting
		
		byte b=(byte)1000; //explicit type casting
		int i= (int)10.0;
		
		double f1=10.0f;
		
		int a=64;
		
		char c=(char)a;
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(b);
		System.out.println(i);
		
		System.out.println(c);
	
		System.out.print(cal.division(100, 51));
		
		int result3= cal.convertStringToInt("123");
		System.out.println(result3);
				
		
	}

}

class Calculator{
	int sum(int num1, int num2){
		int num3= num1+num2;
		return num3;
	}
	
	//method overloading can work even if has same method but different parameters and different data types 
	
	float multiply(float num1, float num2){
		return num1*num2;
	}
	
	int multiply(int num1, int num2){
		return num1*num2;
	}
	
	int multiply(int num1){
		return num1*num1;
	}
	
	int diffrence(int num1, int num2){
		int num3= num1-num2;
		return num3;
	}
	double division(int num1, int num2){
		return num1/num2;
	}
	
	int convertStringToInt(String input) {
		int result = Integer.parseInt(input);
		return result;
	}
	
	
	
}