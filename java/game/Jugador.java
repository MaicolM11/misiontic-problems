public class Jugador extends Personaje {

    private static final int LIFE_ADD = 5;
    
    private int numeroBotiquines;

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.numeroBotiquines = 0;
    }

    public void moverDerecha(double pixeles) {
        posicionX += pixeles;
    }

    public void moverIzquierda(double pixeles) {
        posicionX -= pixeles;
    }

    public void moverArriba(double pixeles) {
        posicionY += pixeles;
    }

    public void moverAbajo(double pixeles) {
        posicionY -= pixeles;
    }

    public void recogerBotiquin() {
        numeroBotiquines++;
    }

    public void usarBotiquin() {
        if(numeroBotiquines > 0){
            numeroBotiquines--;
            vida += LIFE_ADD;
            if(vida > MAX_LIFE) vida = MAX_LIFE;
        }
    }

    public void golpear(Enemigo e) {
        super.golpear(e);
        e.evolucionar();
    }
    
    // getter setters
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    @Override
    public String toString() {
        return "Jugador [numeroBotiquines=" + numeroBotiquines + super.toString();
    }
    
    
}
