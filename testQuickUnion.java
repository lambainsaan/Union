import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class testQuickUnion extends tests {
	

	// public QuickUnion TestMe;
	// @Override
	@Before
	public void createSet(){
		 TestMe = new QuickUnion (10);
	}


	
	@Test 
	@Override
	public void testUnion(){

		TestMe.union(1 , 9);
		assertEquals(9 , TestMe.ElementAt(1));
		TestMe.union(2 , 1);

		assertEquals(9 , TestMe.ElementAt(2));
		TestMe.union(9 , 8);

		assertEquals(8 , TestMe.ElementAt(9));
		TestMe.union(3 , 4);

		assertEquals(4 , TestMe.ElementAt(3));
		TestMe.union(7 , 8);
		

		assertEquals(8 , TestMe.ElementAt(7));
		TestMe.union(4 , 1);
		assertEquals(8 , TestMe.ElementAt(4));
		try{
			TestMe.union(-1 , 33);
		}catch(IndexOutOfBoundsException e){

		}

	}


	@Test
	public void testRoot(){

		TestMe.union(1 , 9);
		TestMe.union(2 , 1);
		TestMe.union(9 , 8);
		TestMe.union(3 , 4);
		TestMe.union(7 , 8);


		assertEquals(8 , TestMe.root(2));
		assertEquals(8 , TestMe.root(9));
		assertEquals(8 , TestMe.root(7));
		assertEquals(4 , TestMe.root(3));
	}


	public static void main(String... args) {
		jh61b.junit.textui.runClasses(testQuickUnion.class);
	} 


}