import java.io.*;
class potencia
{
	public static void main(String[] Arg)throws IOException
	{
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int s=0;
		System.out.println("                             SUMATORIA DE VARIOS ELEMENTOS");
		System.out.println("                             =============================");
		System.out.print("Introdusca número de términos de la sumatoria: ");
			int n=Integer.parseInt(in.readLine());
			for(int i=1; i<=n;i++)
			{
				int F=1;
				for (int k=1; k<=i; k++)
				{
					F=F*k;
				}
				int F1=1;
					for(int j=1; j<=(n-i);j++)
					{
						F1=F1*j;
						}
						s=s+(F/F1+1);
			}
			System.out.println("");
			System.out.println("la sumatoria es : "+s);	
	}
}
