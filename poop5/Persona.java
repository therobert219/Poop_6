
package poop5;

public class Persona {
    private String Nombre;
    private String Apellidos;
    private Fecha fNacimiento;

    public Persona() {
    }
    /**
     * 
     * @param Nombre
     * @param Apellidos
     * @param fNacimiento 
     */

    public Persona(String Nombre, String Apellidos, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @param Nombre
     * @param Apellidos 
     */

    public Persona(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fNacimiento= new Fecha(3,5,2000);
    }
    /**
     * 
     * @return 
     */
    

    public String getNombre() {
        return Nombre;
    }
    /**
     * 
     * @param Nombre 
     */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * 
     * @return 
     */

    public String getApellidos() {
        return Apellidos;
    }
    /**
     * 
     * @param Apellidos 
     */

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    /**
     * 
     * @return 
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento 
     */

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @return 
     */


    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
    
}
