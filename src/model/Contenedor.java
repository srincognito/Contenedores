package model;

public class Contenedor{

private double altura;
private double ancho;
private double largo;

  public Contenedor(double x,double y,double z){
    altura=x;
    ancho=y;
    largo=z;
  }

  public double getVolu(){
    double v=altura*ancho*largo;
    return v;
  }
}
