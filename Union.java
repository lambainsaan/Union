



public abstract class Union{

	/*
	 *
	 * There are four functions that I need to implement 
	 * i)   Constructor(int)		It takes in the number of total elements
	 * 								starting from 1.
	 * ii)  isConnected(int , int)	It checks wether the two elements are connected 
	 * iii) Union(int , int)		It connects the two objects
	 * iv)	Find(int)				Finds if that element exits?
	 *
	 * 
	 */


	public int  [] Elements ;

	Union(int numberOfElements){
		 Elements = new int [numberOfElements];
		for (int index = 0; index < numberOfElements ; index ++){
			// Put the index value at position index
			
			Elements[index] = index ; 
		}
	}

	public  int  ElementAt(int index) {
		if(index < 0 || index >= Elements.length){
			throw new IndexOutOfBoundsException();
		}else{
			return this.Elements[index];  
		}
	}

	public abstract  void union(int pid, int qid);


	public abstract boolean Connected(int indexA , int indexB);

	public static void main(String[] args) {

	}
}