import java.io.*;
class facpo
{
	public static void main (String Arg[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("FACTORIAL Y POTENCIA");
		System.out.print("el primer valor: ");
		
		int A=Integer.parseInt(in.readLine());
		System.out.print("el segundo valor: ");
		int B=Integer.parseInt(in.readLine());
		int f=1;
		for (int i=1; i<=A; i++)
		{
			f=f*i;
		}
		int p=1;
		for (int i=1; i<=B; i++)
		{
			p=p*A;
		}
		System.out.println("el factorial es: " +f);
		System.out.println("la potencia es: " +p);
	}
	
	}
	    
	    
	    