package com.juniteg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ArithmeticTest {
	

    private Arithmetic arithmetic = new Arithmetic();

    @BeforeAll
    static void befallmet() {
    	
    	
    System.out.println("Before All method");	
    }
    
    @BeforeEach
    void befeachmet() {
    	
    arithmetic=new Arithmetic();
    System.out.println("Before Each method");	
    }
    @Tag("Feature1")
    @Test
    void metarray() {
    	
    	int arr[]= {1,2,4,6};
    	
    	int []actualarr=arithmetic.reverseInt(arr);
    	 
    	int []expectarr= {6,4,2,1};
    	
    	assertArrayEquals(actualarr,expectarr,"Comparing reversed Array");
    	
    	
    }
    
   @Tag("Feature1")
    @Test
    @Order(1)
     void testAddNegative() {
    	Arithmetic arithmeticn=new Arithmetic();
    	
    	//int actualvalue=arithmeticn.add(-3, -5);
    	
    	
    	System.out.println("Test1");
        assertEquals(-8, arithmetic.add(-3, -5), "Addition should return the sum of two negative numbers");

    	
    }
    @Tag("Feature2")

    @Test
    
   // @Disabled
    @Order(2)

    void testAdd() {
        assertEquals(5, arithmetic.add(2, 3), "Addition should return the sum of two numbers");
        
    	System.out.println("Test2");

    }
    @Tag("Feature1")
    @Test
    @Order(3)

    void testSubtract() {
        assertEquals(1, arithmetic.subtract(5, 4), "Subtraction should return the difference of two numbers");
    	System.out.println("Test3");

    }
    @Tag("Feature2")
    @Test
    @Order(4)

    void testMultiply() {
        assertEquals(6, arithmetic.multiply(2, 3), "Multiplication should return the product of two numbers");
    	System.out.println("Test4");

    }
    @Tag("Feature2")
    @Test
    @Order(5)

    void testDivide() {
        assertEquals(2, arithmetic.divide(6, 3), "Division should return the quotient of two numbers");
    	System.out.println("Test5");

    }
    @Tag("Feature1")
    @Test
    @Order(6)

    void testDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetic.divide(1, 0), "Division by zero should throw ArithmeticException");
        assertEquals("Cannot divide by zero", thrown.getMessage());
    	System.out.println("Test6");

    }
    @Tag("Feature1")
    @Test
    @Order(7)
    void testLargeValue() {
    	
    	assertEquals(100,arithmetic.largeValue(100, 50),"Shoud return large value");
     }
    
    @Tag("Feature1")
    @Test
   void testLargeValue2() {
    	
    	assertEquals(-1.44,arithmetic.largeValue(-1.44,-55),"Shoud return large value");
     }
    
    
    @AfterEach
    void metAfter() {
    	
    	arithmetic=null;
    	
 	System.out.println("Aftereach");
    }
    @AfterAll
   static void metAfterAll() {
    	System.out.println("AfterAll");
    }
    
}