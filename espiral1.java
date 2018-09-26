import java.io.*;
class espiral1
{
	public static void main(String Arg[]) throws IOException
	{
	
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("PROGRAMA QUE GENERA ANILLOS NUMERICOS DE NxN PARA N IMPAR"+"\t");
		int n;
		do
		{
				System.out.print("Ingrese un Numero para N impar :");
				 n=Integer.parseInt(in.readLine());
				
		}while(n%2==2);
		int M[][]= new int[n][n];
		int nivel=(n/2)+1;
		for (int i=0; i<nivel; i++)
		{
			for(int j=i;j<=(n-(i+1));j++){
				M[i][j]=i+1;
			}
			for(int j=i+1;j<=(n-(i+1));j++){
				M[j][n-(i+1)]=i+1;
			}
			for(int j=n-(i+2);j>=i;j--){
				M[n-(i+1)][j]=i+1;
			}
				for(int j=n-(i+2);j>i;j--){
				M[j][i]=i+1;
			}
		}
		for(int i=0; i<n; i++){
			
			for(int j=0;j<n;j++){
				System.out.print(M[i][j]);
			}
			System.out.println("");
		}
	}
}