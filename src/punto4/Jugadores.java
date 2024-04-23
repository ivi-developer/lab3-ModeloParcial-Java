package punto4;
public class Jugadores extends MiembroPlantel implements IJugadoresActividades{
    private Posiciones posiciones;
    private String nickname;
    private Integer cantVictorias;
    public Jugadores(){super();}
    public Jugadores(String nombre,String apellido,String localidad,Integer edad,Posiciones posiciones,String nickname,Integer cantVictorias){
        super(nombre, apellido, localidad, edad);
        this.posiciones=posiciones;
        this.nickname=nickname;
        this.cantVictorias=cantVictorias;
    }
    @Override
    public String toString(){
        return super.toString()+ "Jugadores{" +
                "posiciones=" + posiciones +
                ", nickname='" + nickname + '\'' +
                ", cantVictorias=" + cantVictorias +
                '}';
    }
    public String getNickname(){return nickname;}
    public Integer getCantVictorias(){return cantVictorias;}
    @Override
    public void participarDePartida(){}
}
