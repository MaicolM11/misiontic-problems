public class Enemigo extends Personaje {

    private int evolucionesAplicadas;
    private int resistencia;

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
        evolucionesAplicadas = 0;
        resistencia = 1; 
    }

    public void evolucionar() {
        if(vida <= 30 && evolucionesAplicadas == 0){
            damage += 20;
            evolucionesAplicadas++;
        } 
        if(vida <= 10 && evolucionesAplicadas == 1){
            resistencia++;
            evolucionesAplicadas++;
        }
    }

    public void recibirImpacto(double damage) {
        super.recibirImpato(damage / resistencia);
    }

    // getters setters
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Enemigo [evolucionesAplicadas=" + evolucionesAplicadas + ", resistencia=" + resistencia + super.toString();
    }
    
    
}