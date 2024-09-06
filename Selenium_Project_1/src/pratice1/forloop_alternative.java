package pratice1;

public class forloop_alternative {

	public static void main(String[] args) {
		
		
		for(int a = 1; a<=5; a++) {
			
			for(int m = 1; m<=a; m++ ) {
				
				if(m%2==0 && a%2==0 || m%2!=0 && a%2!=0 ) {
					
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
		// System.out.print(m);	
				
		}
			System.out.println();
		}
		
		
		
		

	}

}
