package punto2;
import java.util.ArrayList;
import java.util.Iterator;
public class EmpresaXYZ implements Iterable{
    private ArrayList<Empleado> empleadoList;
    public EmpresaXYZ(){empleadoList=new ArrayList<>();}
    public void agregarEmpleado(Object e){if(e instanceof Empleado empleado)empleadoList.add(empleado);}
    public ArrayList<Empleado>getEmpleadoList(){return empleadoList;}
    @Override
    public Iterator iterator() {
        return null;
    }
}
