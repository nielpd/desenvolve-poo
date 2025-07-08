import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class EmprestimoTest {

    @Test
    void testCriacaoEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", "Tecnologia", new Autor("Alan Turing", 41));
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(livro, usuario);

        assertEquals("Java Basics", emprestimo.getLivro().getTitulo());
        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
    }
}
