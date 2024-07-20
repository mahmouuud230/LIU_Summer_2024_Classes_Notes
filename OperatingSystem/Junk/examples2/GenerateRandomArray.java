public class GenerateRandomArray extends Thread {
	private int [] a;
	private int M, N;
	
	public GenerateRandomArray(int []a, int f, int t){
		this.a = a;
		this.M = f;
		this.N = t + 1 - M;
	}
	
	public void run(){
		for(int i=0 ; i<a.length; i++){
			a[i] = M + (int)(Math.random()*N);
		}
	}
	
}
