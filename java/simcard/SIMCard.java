public class SIMCard {
    //Inserte acá los atributos
    private String empresaTelefonia;
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado;
    private boolean modoAvionActivado;
    private boolean datosActivados;
    private int saldoDatos;
    
    
    //Inserte acá el método constructor
    public SIMCard(String numeroTelefono) {
        this.empresaTelefonia = "HI";
        this.saldo = 0;
        this.numeroTelefono = numeroTelefono;
        this.celularApagado  = true;
        this.modoAvionActivado  = false;
        this.datosActivados  = false;
        this.saldoDatos  = 0;
    }    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void comprarDatos(int gb){
        int costo =  calculoPrecioDatos(gb);
        if(saldo < costo) return;
        saldo -= costo;
        saldoDatos += gb;
    }

    private int calculoPrecioDatos(int gb){
        if(gb <=10) return gb * 3000;
        if(gb <=30) return 30000 + (gb-10) * 2500;
        return 60000 + (gb-20) * 1500;
    }

    public void consumirDatos(int gb){
        if(celularApagado || modoAvionActivado || !datosActivados) return;
        saldoDatos -= gb;
    }

    public void llamar(int s){
        if(celularApagado || modoAvionActivado) return;
        saldo -= calculoPrecioSegundos(s);
    }

    private double calculoPrecioSegundos(int s){
        if( s<= 60) return s;
        return 60 + (s-60) * 0.5;
    }
    
    public void recargarSaldo(double saldo){
        this.saldo += saldo;
    }

    public void gestionarEncendidoCelular(){
        celularApagado = !celularApagado;
        if(celularApagado){
            datosActivados = false;
            modoAvionActivado = false;
        }
    }

    public void gestionarModoAvion(){
        if (celularApagado) return;
        modoAvionActivado = !modoAvionActivado;
        if(modoAvionActivado) datosActivados = false;
    }

    public void gestionarDatos(){
        if (celularApagado || modoAvionActivado) return;
        datosActivados = !datosActivados;
    }

    //Inserte acá los SETTERS Y GETTERS
    
    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }
    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public boolean isCelularApagado() {
        return celularApagado;
    }
    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }
    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }
    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }
    public boolean isDatosActivados() {
        return datosActivados;
    }
    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }
    public int getSaldoDatos() {
        return saldoDatos;
    }
    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }
        
}