
public class QuickFind extends Union{
	


	QuickFind(int elements){
		super(elements);
	}


	


	@Override
	public void union(int pid, int qid){

		int indexA = this.Elements[pid];
		int indexB = this.Elements[qid];

		if((indexA < 0 )||( indexB < 0) || (indexA >= this.Elements.length) ||( indexB >= Elements.length)){
			throw new IndexOutOfBoundsException();
		}

		for( int i =0 ; i < this.Elements.length ; i++){

			if(this.Elements[i] == indexA){
				this.Elements[i] = indexB;
			}
		}

	}


	@Override
	public boolean Connected(int indexA , int indexB){

		return this.Elements[indexA] == this.Elements[indexB];
	}
}