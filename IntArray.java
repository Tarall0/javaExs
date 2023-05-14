public class IntArray {
	private int[] vet;
	
	public IntArray(int[] vet) {
		this.vet = vet;
	}
	
	public boolean search(int elem) {
		int i = 0;
		boolean here = false;
		
		while (i < vet.length && !here) {
			if(vet[i] == elem)
				here = true;
			
			i++;
		}
		
		return here;
	}
}
