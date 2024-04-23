package punto2;

import java.time.LocalDate;

public class EAsalariado extends Empleado{
    private Double sueldoBasico;
    public EAsalariado(){super();}
    public EAsalariado(String dni,String nombre,String apellidos,Integer anioIngreso,Double sueldoBasico){
        super(dni, nombre, apellidos, anioIngreso);
        this.sueldoBasico=sueldoBasico;
    }
    public Double getSueldoBasico(){return sueldoBasico;}
    public void setSueldoBasico(Double sueldoBasico){this.sueldoBasico=sueldoBasico;}
    @Override
    public void imprimir(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Emplado ").append(super.getNombre()).append(" ").append(super.getApellidos()).append(" cobra ").append(String.format("%.2f",obtenerSalario()));
        System.out.println(stringBuilder);
    }
    @Override
    public double obtenerSalario(){
        return getSueldoBasico()+calcularPorcentajeSalario();
    }
    private double calcularPorcentajeSalario(){
        LocalDate localDate=LocalDate.now();
        int currentYear=localDate.getYear();
        int antiguedad=currentYear-getAnioIngreso();
        if(antiguedad>1&&antiguedad<4)return getSueldoBasico()*0.05;
        else if(antiguedad>3&&antiguedad<8)return getSueldoBasico()*0.1;
        else if(antiguedad>7&&antiguedad<16)return getSueldoBasico()*0.15;
        else if(antiguedad>15)return getSueldoBasico()*0.2;
        return 0;
    }
}