package ui;

import model.Empresa;
import java.util.Scanner;

public class Main{

  private Scanner read=new Scanner(System.in);
  private Empresa e=new Empresa();

  public Main(){
    menu();
  }

  public static void main(String [] args){
    Main m=new Main();
  }

  public void menu(){
    System.out.println("===================================");
    System.out.println("Contenedor 1");
    System.out.println("Ingrese el alto.");
    double x=read.nextDouble();
    System.out.println("Ingrese el ancho.");
    double y=read.nextDouble();
    System.out.println("Ingrese el largo.");
    double z=read.nextDouble();
    e.setCont1(x,y,z);
    System.out.println("Contenedor 2");
    System.out.println("Ingrese el alto.");
    x=read.nextDouble();
    System.out.println("Ingrese el ancho.");
    y=read.nextDouble();
    System.out.println("Ingrese el largo.");
    z=read.nextDouble();
    e.setCont2(x,y,z);
    System.out.println("Contenedor 3");
    System.out.println("Ingrese el alto.");
    x=read.nextDouble();
    System.out.println("Ingrese el ancho.");
    y=read.nextDouble();
    System.out.println("Ingrese el largo.");
    z=read.nextDouble();
    e.setCont3(x,y,z);
    System.out.println("El promedio del volumen de los contenedores es: "+e.getPromCont());
    System.out.println("===================================");
  }
}
