package Task;
import java.util.*;
public class Arrays {
public static void main(String args[])
{
	Scanner ob = new Scanner(System.in);
	int a[][]= new int[5][5];
	System.out.println("Enter The Array Of Your Choice");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			a[i][j]=ob.nextInt();
		}
	}
	System.out.println("Enter Your Choice");
	System.out.println("1  Find the largest number");
	System.out.println("2  Find the second largest number");
	System.out.println("3  Find the sum of the array");
	System.out.println("4  Find the average sum of the array");
	System.out.println("5  Find the specific location of an element in array");
	System.out.println("6  Sort the array in ascending order");
	int ch=ob.nextInt();
	switch(ch)
	{
		case 1:
			int c=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(c<a[i][j])
						c=a[i][j];
				}
			}
			System.out.println("The largest number is "+c);
			break;
		case 2:
			int b=0,d=0;
			for (int i = 0; i < 5; i++) {
			    for (int j = 0; j < 5; j++) {
			        if (a[i][j] > b) {
			            d = b; 
			            b = a[i][j]; 
			        } else if (a[i][j] > d && a[i][j] != b) {
			            d = a[i][j];
			        }
			    }
			}
			System.out.println("The second largest number is "+d);
			break;
		case 3:
			int s=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					s=s+a[i][j];
				}
			}
			System.out.println("The sum of array is "+s);
			break;
		case 4:
			int z=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					z=z+a[i][j];
				}
			}
			System.out.println("The average sum of array is "+(z/(25)));
			break;
		case 5:	
			int e=0,f=0;
			System.out.println("Enter the number to search");
			int ss=ob.nextInt();
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(ss==a[i][j]) {
						e=i;
						f=j;
						break;
					}
				}
			}
			System.out.println("The location of searched number is row "+e+" column "+f);
			break;
		case 6:
			int r;
			for (int i = 0; i < 5; i++)
			{
			for (int j = 0; j < 4; j++) 
			{
			if (a[i][j] > a[i][j + 1]) 
			{
            r = a[i][j]; 
			a[i][j] = a[i][j + 1]; 
			a[i][j + 1] = r; 
			}
			}
			}
			System.out.println("Sorted Array");
			for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) 
			{
			System.out.print(a[i][j] + "\t"); 
			}
			System.out.println();
			}
}
}
}
