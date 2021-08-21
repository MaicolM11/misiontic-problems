public class Estudiante extends Persona {

    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }

    @Override
    public void dirigir() {
        String url = String.format("%s/%s/%s", DEFAULT_URL, getIdioma(), "estudiante");
        setUrl(url);
    }
    
}
