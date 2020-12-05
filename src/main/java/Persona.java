
public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona (String nombre){
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
    @Override
    public String toString(){
        return "idPersona: " + idPersona + ", nombre: " + nombre + 
                ", contadorPersonas: " + contadorPersonas;
    }
}
