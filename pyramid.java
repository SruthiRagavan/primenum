import java.util.Scanner;


public class pryamid {
	
	public static void main(String q[])
	{
		int tm=0,no,count=0,tmp=0;
		Scanner c=new Scanner(System.in);
		no=c.nextInt();{
		for(int i=0;i<no;i++)
		{
			tm=tmp;
			count++;
			for(int k=0;k<no-i-1;k++)
			{
				System.out.print("  ");
			
			}
			for(int j=0;j<count;j++)
			{
				{
				if(j<=(count/2))
				{
					tm++;
					if(tm==10)
					{
						tm=0;
						
					}
					
					System.out.print(tm+" ");
					if(j==(count/2))
					{
						tmp=tm;
					
					}}
				
					
				else{
					tm--;
					if(tm<0)
					{
					tm=9;
					}
					System.out.print(tm+" ");
				}
			}}System.out.println();
		count++;}}
		}
}