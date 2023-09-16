import java.util.Scanner;
class Add
{
public static void main(String[] arg)
{

System.out.println("Marcos Rodas");
System.out.println("Carne 20062839");
System.out.println("Actividad 6 - Diseño e Implementacion de Software");


int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Ingrese el primer numero");
a=sc.nextInt();
System.out.println("Ingrese segundo numero");
b=sc.nextInt();
c=addition(a,b);
System.out.println("La suma de los numeros es: "+c);
}
static int addition(int x, int y)
{
    return x+y;
}}