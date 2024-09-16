package com.juniteg;
//To add a method to get the larger value and add unit test.

public class Arithmetic {
public Arithmetic() {
		
	
	System.out.println("New arithmetic");
	}
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public double largeValue(double a, double b) {
    	
    	if (a>b ) return a ;
    			
    	else return b;
    	
    	
    }
    
    public int[] reverseInt(int []arr) {
    	
    	int temp;
    	int n=arr.length;
    	for (int i=0;i<n/2;i++) {
    		
    	int	tmp=arr[i];
    	
    	arr[i]=arr[n-i-1];
    	
    	arr[n-i-1]=tmp;
    		
    	}
    	
    	System.out.println("Reversing Array");
    	return arr;
    	
    }
    
    
    
}