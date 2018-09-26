import java.io.*;

public class Notaspromedio {
 
public static String leernombre(BufferedReader buff){
 String lee="";
try{lee=buff.readLine();}
catch(Exception ex){
ex.printStackTrace(System.err);}
return lee;
}

public static int leerInt(BufferedReader buff){
 int lee=0;
 boolean error;
do {
 error=false;
 try {lee = Integer.parseInt(buff.readLine());}
 catch (NumberFormatException ex) {
 System.out.println("Entrada erronea, repetir:?");
 error=true;}
 catch (Exception ex){ex.printStackTrace(System.err);}
 } while (error);
return lee;
}

public static void main(String[] args) {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int acumulador=0;
 System.out.println("PROGRAMA QUE CALCULA EL PROMEDIO DE NOTAS DE UN ALUMNO");
 System.out.print("Ingrese su nombre del Alumno: ");
 String nombre=leernombre(br);
 System.out.println();
 for(int i=0;i<2;i++){
 System.out.print("Ingrese la Nota "+(i+1)+" de 2?:");
 acumulador=acumulador+=leerInt(br);
 }
 System.out.println();
 acumulador/=2;

 System.out.println("Alumno: "+nombre+", tu promedio es:"+acumulador);
 }

}