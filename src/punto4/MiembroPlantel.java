package punto4;
public class MiembroPlantel implements IPlantelActividades{
    private String nombre;
    private String apellido;
    private String localidad;
    private Integer edad;
    public MiembroPlantel(){}
    public MiembroPlantel(String nombre,String apellido,String localidad,Integer edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.localidad=localidad;
        this.edad=edad;
    }
    @Override
    public String toString(){
        return "MiembroPlantel{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", localidad='" + localidad + '\'' +
                ", edad=" + edad +
                '}';
    }
    @Override
    public void viajar(){}
    @Override
    public void concentrar(){}
}
