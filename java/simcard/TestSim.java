package simcard;
import java.util.Comparator;

public class TestSim implements Comparator<String>{
    
    public static void main(String[] args) {
        SIMCard s = new SIMCard("3015328969");
        System.out.println(s);
        
        s.recargarSaldo(50000);
        System.out.println(s);

        s.comprarDatos(12);
        System.out.println(s);

        s.consumirDatos(3);
        System.out.println(s);

        s.gestionarEncendidoCelular();
        s.llamar(120);
        System.out.println(s);

        s.gestionarModoAvion();
        s.gestionarDatos();
        System.out.println(s);

        s.gestionarModoAvion();
        s.gestionarDatos();
        System.out.println(s);

        s.consumirDatos(3);
        System.out.println(s);

        s.gestionarEncendidoCelular();
        System.out.println(s);


    }

    @Override
    public int compare(String arg0, String arg1) {
        // TODO Auto-generated method stub
        return 0;
    }
}
