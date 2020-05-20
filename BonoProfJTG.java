import java.util.Scanner;

class BonoProfJTG{
static Scanner teclado=new Scanner(System.in);
//algoritmo para calcular el bono a profesores segun puntos
//creado por Jhobany Ticona 20/05/2020
public static void main(String[] args){
  double premio,puntos,salarioMin;
  //datos de entrada
  System.out.println("Ingrese Puntos Obtenidos");
  puntos=teclado.nextInt();
  System.out.println("Ingrese el salario minimo actual");
  salarioMin=teclado.nextInt();
  premio = 0;
  //proceso
  if(puntos<20){
    premio = salarioMin*0;
  }
  if(puntos>=20 && puntos<=100){
    premio = salarioMin*0.1;
  }
  if(puntos>=101 && puntos<=200){
    premio = salarioMin*0.5;
  }
  if(puntos>=201){
    premio = salarioMin*1;
  }
  //DATOS DE SALIDA
  System.out.println("El bono es: " + premio);

}
}