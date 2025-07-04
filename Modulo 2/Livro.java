class Livro {
    private String titulo;
    private String genero;
    private Autor autorPrincipal;
    private boolean disponivel;

    public Livro(String titulo, String genero, Autor autorPrincipal) {
        this.titulo = titulo;
        this.genero = genero;
        this.autorPrincipal = autorPrincipal;
        this.disponivel = true;  // Inicialmente, o livro está disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Autor getAutorPrincipal() {
        return autorPrincipal;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
