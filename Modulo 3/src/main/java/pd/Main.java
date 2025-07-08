public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Joao lindo Felix", 25);
        
        Livro livro = new Livro("eu sou foda", "Tecnologia", autor);
        
        Usuario usuario = new Usuario("João Gato", 25);

        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            livro.setDisponivel(false); 

            System.out.println("O livro não está disponível");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + autor.getNome());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Usuario: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }
}