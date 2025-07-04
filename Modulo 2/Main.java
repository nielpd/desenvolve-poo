public class Main {
    public static void main(String[] args) {
        // Criando autor
        Autor autor = new Autor("Joao lindo Felix", 25);
        
        // Criando livro
        Livro livro = new Livro("eu sou foda", "Tecnologia", autor);
        
        // Criando usuário
        Usuario usuario = new Usuario("João Gato", 25);

        // Verificando se o livro está disponível para empréstimo
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            livro.setDisponivel(false); // Livro não está mais disponível após o empréstimo

            // Exibindo informações
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