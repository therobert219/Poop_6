
package poop5;
public class Circulo {
    /*atrivutos*/
    static double PI=Math.PI;
    private double radio;
    private String color;

    public Circulo() {/* metodos*/
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

  /*  @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }*/

    @Override
    public String toString() {
        return "Circulo{" + "color=" + color + '}';
    }
    public double perimetro(){
        return 2*PI*radio;
    }
    public double area(){
        return PI*radio*radio;
    
    }
    
}
