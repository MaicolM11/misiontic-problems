public class Personaje {

    public static final double MAX_LIFE = 100;
    
    // atributos
    protected String nombre; 
    protected char sexo;
    protected double posicionX;
    protected double posicionY;
    protected double damage;
    protected double vida;

    // Inserte acá el método constructor

    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
        this.vida = MAX_LIFE;
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Personaje p) {
        p.recibirImpato(damage / calcularDistanciaRespectoPersonaje(p));
    }

    public void recibirImpato(double damage) {
        this.vida -= damage;
        if(vida < 0) vida = 0; 
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        double result = Math
                .sqrt(Math.pow(this.posicionX - p.posicionX, 2) + Math.pow(this.posicionY - p.posicionY, 2));
        return result;
    }

    // Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return ", damage=" + damage + ", nombre=" + nombre + ", posicionX=" + posicionX + ", posicionY="
                + posicionY + ", sexo=" + sexo + ", vida=" + vida + "]";
    }

    

}