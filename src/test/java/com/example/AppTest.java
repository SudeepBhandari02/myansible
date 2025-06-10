package com.example;

import org.junit.Test;
import org.junit.Assert;
public class AppTest {
    @Test
    public void testAdd(){
    	App app = new App();
    	int a=3;
    	int b=5;
    	int result =  app.add(a,b);
    	System.out.println("Running Test ....");
    	System.out.println("sum of 3 and 5 id : "+result);
    	Assert.assertEquals(8,result);
    }
}
