package punto4;
public class Entrenador extends MiembroPlantel implements IEntrenadorActividades,IJugadoresActividades{
    private Integer experiencia;
    public Entrenador(){super();}
    public Entrenador(String nombre,String apellido,String localidad,Integer edad,Integer experiencia){
        super(nombre, apellido, localidad, edad);
        this.experiencia=experiencia;
    }
    @Override
    public String toString(){
        return super.toString()+ "Entrenador{" +
                "experiencia=" + experiencia +
                '}';
    }

    @Override
    public void darIndicaciones(){}
    @Override
    public void participarDePartida(){}
}
