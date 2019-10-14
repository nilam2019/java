package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.primefactor;

class testing {
	private List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}
	

	@Test
	public void testone() {
	assertEquals(list(),primefactor.generate(1));
}
	
     @Test
    public void testTwo() throws Exception{
    	 assertEquals(list(2),primefactor.generate(2));
	   
   }
     @Test
     public void testThree() throws Exception{
    	 assertEquals(list(3),primefactor.generate(3));
  	   
     }
     @Test
     public void testfour() throws Exception{
    	 assertEquals(list(2,2),primefactor.generate(4));
  	   
     }
     @Test
     public void testSix() throws Exception{
    	 assertEquals(list(2,3),primefactor.generate(6));
     }
     @Test
     public void testEight() throws Exception{
    	 assertEquals(list(2,2,2),primefactor.generate(8));
     
     }
     @Test
     public void testNine() throws Exception{
    	 assertEquals(list(3,3),primefactor.generate(9));
     }
	}
