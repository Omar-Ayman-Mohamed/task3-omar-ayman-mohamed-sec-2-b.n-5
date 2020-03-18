package myproject6;

import java.util.Scanner;

public class myproject6 {

	public static void main(String[] args) {		Scanner input =new Scanner(System.in);
	System.out.print("please enter size of two arrays");
	int x=input.nextInt();
	int y=input.nextInt();
	System.out.print("\n");
	int[]array1=new int[x];
	int[]array2=new int[y];
	System.out.print("pleasse enter array 1");
	for(int i=0;i<=x-1;i++) {
		array1[i]=input.nextInt();
	}
	System.out.print("\n");
	System.out.print("please enter array 2");
		for(int j=0;j<=y-1;j++) {
		array2[j]=input.nextInt();
	}
	int z=x+y;
	int[]array3=new int[z];
	int i=0; int j=0;int k=0;
	while (i < x && j < y) {
        if (array1[i] < array2[j]) {
            array3[k] = array1[i];
            i++;

        } else {
            array3[k] = array2[j];
            j++;

        }
        k++;

    }	
    System.out.print(i+" ");
    System.out.print(j+" ");
    System.out.print(k+" ");
    System.out.print(z+" ");
    System.out.print("\n");
 	
    		
    	
    while (k < z) {
        if (i < x) {
            array3[k] = array1[i];
            i++;
        } else {
            if (j < y) {
                array3[k] = array2[j];
                j++;

            }
        }
        k++;
    }
    	
    	
    	
    
    
    
    
    
    
    
    
    for(int i3=0;i3<=z-1;i3++) {
        System.out.print(array3[i3]+" ");




    }
	
	
	

	
	
	
	
	
	}
	
		

}


