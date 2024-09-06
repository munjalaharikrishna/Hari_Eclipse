package pratice1;

public class array {

	public static void main(String[] args) {
		
		int a[] = new int[25];
		
		a[0] =  1;
		
		a[1] =  2;
		a[2] =  3;
		a[3] =  4;
		a[4] =  5;
		a[5] =  6;
		a[6] =  7;
		a[7] =  8;
		a[8] =  9;
		a[9] =  133;
		a[10] =  144;
		a[11] =  10;
		a[12] =  11;
		a[13] =  12;
		a[14] =  13;
		a[15] =  14;
		a[16] =  15;
		a[16] =  16;
		a[17] =  17;
		a[18] =  18;
		a[19] =  19;
		a[20] =  20;
    
        for (int i = 15; i >= 6; i--) {
            
            if (i >= a.length - 9 && i <= 5) {
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }


	}


