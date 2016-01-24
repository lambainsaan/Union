
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public abstract class tests{
	
	public Union TestMe;


	@Test
	public void testConstructor(){
		
		assertEquals(2 , TestMe.ElementAt(2));
		try {
			TestMe.ElementAt(-1);	
		}
		catch (IndexOutOfBoundsException e) {
		}
		try {
			TestMe.ElementAt(11);
		}
		catch (IndexOutOfBoundsException e) {
		}

	}
	@Test
	
	public void testConnected(){

		TestMe.union(1 , 9);
		TestMe.union(2 , 1);
		TestMe.union(9 , 8);
		assertEquals(true , TestMe.Connected(1 , 8));
		assertEquals(true , TestMe.Connected(2 , 8));
		assertEquals(false , TestMe.Connected(1 , 3));
		assertEquals(false , TestMe.Connected(1 , 4));


	}

	
	public abstract void testUnion();



}