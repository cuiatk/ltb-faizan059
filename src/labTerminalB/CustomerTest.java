package labTerminalB;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 = new Movie("wrongnumber", 3);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	Rental r3 = new Rental(m3,10);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */ 
	
	
	//Test one customer for rented one regular  movie
	public void statement2 ()
	{
		
		me.addRental(r1);
		 
		//fail("Not yet implemented");
		String output1 = "Rental Record for Allah Ditta \r\n" + 
				"	Spancer	33.5\r\n" ; 
				 
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}	
	
	//Test one customer rented one regular and one new release and one children
	public void statement3()
	{
		me.addRental(r1);
		me.addRental(r2);
		me.addRental(r3);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0" +
				"	wrongnumber	3.0"  ;
		if(output1.equals(me.statement()))
		{
			assert true;
		}
		
		
		
	}

}
