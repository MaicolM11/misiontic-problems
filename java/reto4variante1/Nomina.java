import java.util.ArrayList;
import java.util.Optional;

public class Nomina {

    private ArrayList<Trabajador> trabajadores;

    public Nomina() {
        this.trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador trabajador){
        if(!trabajadores.contains(trabajador)) trabajadores.add(trabajador);
    }

    public void eliminarTrabajador(String cc){
        trabajadores.removeIf(x-> x.getCC().equals(cc));
    }

    public double calcularSalarioQuincenalNomina() {
        return trabajadores.stream().mapToDouble(x -> x.salarioQuincenal()).sum();
    }

    public double promedioEdadNomina() {
        return trabajadores.stream().mapToDouble(x-> x.calcularEdad()).average().getAsDouble();
    }

    public double desviacionEstandarEdadNomina(){
        int n = trabajadores.size();
        double u = promedioEdadNomina();
        double sumatoria = 0;
        for (Trabajador trabajador : trabajadores) {
            sumatoria += Math.pow(trabajador.calcularEdad() - u, 2);
        }
        return Math.sqrt(sumatoria / n);
    }

    public double salarioQuincenalTrabajador(String cc){
        Optional<Trabajador> findFirst = trabajadores.stream().filter(x-> x.getCC().equals(cc)).findFirst();
        if(findFirst.isPresent()) return findFirst.get().salarioQuincenal();
        return -1;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

}
