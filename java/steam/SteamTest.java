public class SteamTest {
    
    public static void main(String[] args) {
        Persona p = new Estudiante("123", "pepe", "pepe@gmail.com", "español");
        p.dirigir();
        System.out.println(p.getUrl());
    }
}
