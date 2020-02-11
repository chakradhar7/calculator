package com.epam.Calculator.Operations;

public class operation implements Operations {
	
	public double Addition(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	public double Subtract(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	public double Multiply(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	public double Divide(double num1, double num2) {
		// TODO Auto-generated method stub
		if(num2!=0)
		{
		return num1/num2;
		}
		return -1;
		
	}

	public double Modulo(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}
	

}
