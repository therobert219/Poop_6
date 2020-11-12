
package poop5;

public class Coche {
    private String modelo;
    private String color;
    private int km;
    
    public Coche(){
    }

    public Coche(String modelo, String color, int km) {
        this.modelo = modelo;
        this.color = color;
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Coche{" + "modelo=" + modelo + ", color=" + color + ", km=" + km + '}';
    }
    
    
    
}
