public class QuickUnion extends Union{


	QuickUnion( int elements){
		super (elements);
	}

	@Override
	public boolean Connected(int indexA , int indexB){


		return false;
	}

	@Override
	public void union(int pid, int qid){

	}



	public int root( int indexCurrently){


		return 0;

	}

}