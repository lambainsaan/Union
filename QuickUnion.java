public class QuickUnion extends Union{


	QuickUnion( int elements){
		super (elements);
	}

	@Override
	public boolean Connected(int indexA , int indexB){
		return this.root(indexA)== this.root(indexB);
	}

	@Override
	public int root (int index){
		
		while (this.Elements[index]!=index){
			index = this.Elements[index];
		}
		return index;
	}

	@Override
	public void union(int pid, int qid){

		int root1 = this.root(pid);
		int root2 = this.root(qid);
		this.Elements[root1] = root2;


	}



}