package punto2;
public abstract class Empleado{
    private String dni;
    private String nombre;
    private String apellidos;
    private Integer anioIngreso;
    protected Empleado(String dni,String nombre,String apellidos,Integer anioIngreso){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.anioIngreso=anioIngreso;
    }
    public Integer getAnioIngreso(){return anioIngreso;}
    public void setAnioIngreso(Integer anioIngreso){this.anioIngreso=anioIngreso;}
    public String getApellidos(){return apellidos;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}
    public String getDni(){return dni;}
    public void setDni(String dni){this.dni=dni;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    protected Empleado(){}
    public abstract void imprimir();
    public abstract double obtenerSalario();
}