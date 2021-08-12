public class GameTest {
    
    public static void main(String[] args) {
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        print(j, e);
        
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
        print(j, e);

        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        print(j, e);

        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        print(j, e);


        e.golpear(j);
        e.golpear(j);
        print(j, e);

        j.golpear(e);
        j.golpear(e);
        print(j, e);

        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        print(j, e);
    }

    static void print(Jugador j, Enemigo e){
        System.out.println("*".repeat(30));
        System.out.println(j);
        System.out.println(e);
        System.out.println("*".repeat(30));        
    }

}