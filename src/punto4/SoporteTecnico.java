package punto4;
public class SoporteTecnico extends MiembroPlantel implements ISoporteTecnicoActividades{
    private String espicalizacion;
    public SoporteTecnico(){super();}
    public SoporteTecnico(String nombre,String apellido,String localidad,Integer edad,String espicalizacion){
        super(nombre, apellido, localidad, edad);
        this.espicalizacion=espicalizacion;
    }
    @Override
    public String toString(){
        return super.toString()+ "SoporteTecnico{" +
                "espicalizacion='" + espicalizacion + '\'' +
                '}';
    }
    @Override
    public void arreglarEquipo(){}
    @Override
    public void cambiarEquipo(){}
}
