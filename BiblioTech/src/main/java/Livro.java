public class Livro {

    private int id;
    private String genero;
    private String autor;
    private String titulo;
    private double notaMedia;
    private int fk_IdUser;

    public Livro(){
        
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String genero, String autor, String titulo, double notaMedia, int fk_IdUser) {
        this.genero = genero;
        this.autor = autor;
        this.titulo = titulo;
        this.notaMedia = notaMedia;
        this.fk_IdUser = fk_IdUser;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getFk_IdUser() {
        return fk_IdUser;
    }

    public void setFk_IdUser(int fk_IdUser) {
        this.fk_IdUser = fk_IdUser;
    }



    @Override
    public String toString() {
        return titulo +", "+ autor;
    }


    

}
