package punto4;
import java.util.ArrayList;
public class Plantel{
    private ArrayList<MiembroPlantel>miembrosPlantel;
    public Plantel(){miembrosPlantel=new ArrayList<>();}
    public void agregarPersonal(Object e){
        if(e instanceof MiembroPlantel miembroPlantel){
            if(miembroPlantel instanceof SoporteTecnico soporteTecnico) miembrosPlantel.add(soporteTecnico);
            else if(miembroPlantel instanceof Entrenador entrenador) revisarEntrenador(entrenador);
            else revisarNickJugador((Jugadores)miembroPlantel);
        }
    }
    public void mostrarPersonal(){miembrosPlantel.forEach(miembrosPlantel-> System.out.println(miembrosPlantel.toString()));}
    public int cantidadDeVictorias(){
        int cantVictorias=0;
        for(MiembroPlantel miembroPlantel:miembrosPlantel) if(miembroPlantel instanceof Jugadores jugador)cantVictorias+=jugador.getCantVictorias();
        return cantVictorias;
    }
    private void revisarEntrenador(Entrenador entrenador){
         if(miembrosPlantel.stream().anyMatch(miembroPlantel->miembroPlantel instanceof Entrenador))return;
         miembrosPlantel.add(entrenador);
    }
    private void revisarNickJugador(Jugadores jugadores){
        if(miembrosPlantel.stream().anyMatch(miembro->miembro instanceof Jugadores jugadores1&&jugadores1.getNickname().equalsIgnoreCase(jugadores.getNickname())))return;
        miembrosPlantel.add(jugadores);
    }
    public void mostrarEspecifico(Class e){for(MiembroPlantel miembroPlantel:miembrosPlantel) if(e.isInstance(miembroPlantel)) System.out.println(miembroPlantel.toString());}
}
