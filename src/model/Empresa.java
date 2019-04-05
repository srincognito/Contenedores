package model;

public class Empresa{

private Contenedor cont1;
private Contenedor cont2;
private Contenedor cont3;

  public Empresa(){

  }

  public double getPromCont(){
    double prom=(cont1.getVolu()+cont2.getVolu()+cont3.getVolu())/3;
    return prom;
  }

  public void setCont1(double x,double y,double z){
    cont1=new Contenedor(x,y,z);
  }

  public void setCont2(double x,double y,double z){
    cont2=new Contenedor(x,y,z);
  }

  public void setCont3(double x,double y,double z){
    cont3=new Contenedor(x,y,z);
  }
}
