package com.asjy.maven;
 
import org.junit.Test;
import static junit.framework.Assert.*;
 
public class TestHelloWorld{
        
 @Test
 public void testSayHello(){
	   HelloWorld hw = new HelloWorld();
	   String result = hw.sayHello("zhangsan");
	   assertEquals("Hello World:zhangsan!",result);
 }      
}
