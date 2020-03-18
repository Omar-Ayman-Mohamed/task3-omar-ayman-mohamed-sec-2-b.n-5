package myprohect7;

import java.util.Scanner;

public class myprohet7 {

	public static void main(String[] args) {Scanner input =new Scanner(System.in);
	System.out.print("please enter required number");
	int requirednum=input.nextInt();
	System.out.print("\n");
	System.out.print("please enter array size");	
	int sizeofarray=input.nextInt();
	int[]array1=new int[sizeofarray];
	System.out.print("please enter array");
	int i=0,j=0;
	for(int i1=0;i1<=sizeofarray-1;i1++) {
		array1[i1]=input.nextInt();
	}for( i=0;i<=sizeofarray-1;i++) {
			for( j=0;j<=sizeofarray-1;j++) {
				if(array1[i]+array1[j]==requirednum) {	System.out.print(j+" "+i);
					System.exit(0);	
				}	
			}
	}
	
		

	}

}
