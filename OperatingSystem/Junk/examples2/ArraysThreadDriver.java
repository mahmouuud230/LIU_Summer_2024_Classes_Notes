
public class ArraysThreadDriver {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		int [] X = new int [20];
		
 		GenerateRandomArray g = new GenerateRandomArray(X,10,70);
 		g.start();
 		g.join();
 		
 		
 		Counter c = new Counter(X,'O');
 		c.start();
 		
 		for(int i = 0; i< X.length; i ++)
 			System.out.println(X[i]);
 		
 		c.join();
 		
 	System.out.println(c.getCount());
 		
	}

}
