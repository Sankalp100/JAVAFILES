import java.util.Scanner;
public class BubbleShorting {

	public static void main(String[] args) {
	 int n,c,d,s;
	 Scanner a = new Scanner(System.in);
	 System.out.println("Input no intgers to sort");
	 n=a.nextInt();
	 int array[]=new int[n];
	 System.out.println("Enter"+n+"integers");
	 for(c=0;c<n;c++){
		 array[c]= a.nextInt();
		 }
	 for(c=0;c<n-1;c++)
	 {
		 for(d=0;d<n-c-1;d++)
		 {
			 if(array[d]>array[d+1])
			 {
				 s=array[d];
				 array[d]=array[d+1];
				 array[d+1]=s;
			 }
		 }
	 }
	 System.out.println("Shorted list of no");
	 for(c=0;c<n;c++)
	 {
		 System.out.println(array[c]);
	 }
	}

}
