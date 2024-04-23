package punto3;
public abstract class Flujo{
    abstract public void escribe(char c);
    public void escribe(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Escribe de Flujo ....");
            escribe(s.charAt(i));
        }
    }
    public void escribe(int i){escribe("" + i);}
}
