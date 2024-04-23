package punto2;
public class EComision extends Empleado{
    private static final Integer SALARIO_MINIMO=750;
    private Integer numeroDeClientesCaptados;
    private Double montoPorCliente;
    public EComision(){super();}
    public EComision(String dni,String nombre,String apellidos,Integer anioIngreso,Integer numeroDeClientesCaptados,Double montoPorCliente){
        super(dni, nombre, apellidos, anioIngreso);
        this.numeroDeClientesCaptados=numeroDeClientesCaptados;
        this.montoPorCliente=montoPorCliente;
    }
    public Double getMontoPorCliente(){return montoPorCliente;}
    public void setMontoPorCliente(Double montoPorCliente){this.montoPorCliente=montoPorCliente;}
    public Integer getNumeroDeClientesCaptados(){return numeroDeClientesCaptados;}
    public void setNumeroDeClientesCaptados(Integer numeroDeClientesCaptados){this.numeroDeClientesCaptados=numeroDeClientesCaptados;}
    @Override
    public void imprimir(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Emplado ").append(super.getNombre()).append(" ").append(super.getApellidos()).append(" cobra ").append(String.format("%.2f",obtenerSalario()));
        System.out.println(stringBuilder);
    }
    @Override
    public double obtenerSalario(){return getMontoPorCliente()*getNumeroDeClientesCaptados()>SALARIO_MINIMO?getMontoPorCliente()*getNumeroDeClientesCaptados():SALARIO_MINIMO;}
}