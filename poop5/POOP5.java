package poop5;
public class POOP5 {
    public static void main(String[] args) {
       Circulo c1=new Circulo();
       Circulo c2=new Circulo(6.0);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro de c1= "+c1.perimetro());
        System.out.println("Area de C1= "+c1.area());
        
        System.out.println("Perimetro de c2= "+c2.perimetro());
        System.out.println("Area de C2= "+c2.area());
        System.out.println("*************************");
        c1.setRadio(9.0);
        System.out.println("Perimetro de c1= "+c1.perimetro());
        System.out.println("Area de C1= "+c1.area());
       
        System.out.println("2*********************");
        
        Persona amigo=new Persona();
        Fecha fNacimiento=new Fecha(2,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellidos("Romero Martinez");
        amigo.setfNacimiento(fNacimiento);
        System.out.println("Info amigo: "+amigo.toString());
        
        Persona amigo2=new Persona("Raul","ayala barbosa",new Fecha(20,4,1993));
        System.out.println("Info amigo 2: "+amigo2);
        
        Persona amigo3=new Persona("diego","Pedraza Peralta");
        System.out.println("Info amigo3: "+amigo3);
        
        Coche coche1=new Coche("Tsuru 2020","negro",0);
        System.out.println("Info coche 1: "+coche1);
    }
    
}
