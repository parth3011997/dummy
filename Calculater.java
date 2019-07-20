import java.util.Scanner;
class Sum
{
	    Scanner sc=new Scanner(System.in);
	    int i=0;
	    int j=0;
	    void addnumber()
	    {
			int temp=0;
	 		int add =sc.nextInt();
	 		int [] a= new int[add];
	 		for(i=0;i<a.length;i++)
	 		{
				j=i+1;
				System.out.println("enter :"+j);
				a[i]=sc.nextInt();
				temp +=a[i];
			}
			System.out.println("sum of addition is "+temp);
	    }
	    void multiplaynumber()
	    {

			int mull=sc.nextInt();
			int [] b=new int[mull];
			int temp=1;
			for(i=0;i<b.length;i++)
			{
				j = i+1;
				System.out.println("enter :"+j);
				b[i]=sc.nextInt();
				temp *=b[i];
			}
			System.out.println("sum of multiplication number is "+temp);
		}
}
class Calculater
{
	public static void main(String [] args)
	{
		Sum s=new Sum();
		System.out.println("1 Addition & 2 multiplication");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1)
		{
			System.out.println("you want to addition");
	 		System.out.println("how many number you want to addition ??");
			s.addnumber();
		}
		else if(num==2)
		{
			System.out.println("you want to multiplication");
			System.out.println("how many number you want multiplication ??");
			s.multiplaynumber();
		}
		else
		{
			System.out.println("enter the valide number");
		}

	}
}