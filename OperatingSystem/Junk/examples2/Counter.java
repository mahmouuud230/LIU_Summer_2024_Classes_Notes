
public class Counter extends Thread{
	private int [] a;
	private int count = 0;
	private char label;
	
	public Counter(int [] a, char label){
		this.a = a;
		this.label = label;
	}
	
	public int getCount(){
		return count;
	}
	
	public void run(){
		for(int i = 0; i<a.length; i++){
			switch(label){
			case 'E' :
			case 'e' :
				if(a[i]%2 ==0 ) count ++;
				break;
			case 'O':
			case 'o':
				if(a[i]%2 !=0 ) count ++;
				break;
			default:
				count ++;
				
			}
		}
	}
	
}
