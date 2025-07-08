import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Autor autor = new Autor("Jess", 40);
    Livro livro1 = new Livro("Java Basico", "tecnologia", autor);
    Livro livro2 = new Livro("Java Avançado", "tecnologia", autor);

    @Test
    void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    void testGetGenero() {
        assertEquals("tecnologia", livro1.getGenero());
    }

    @Test
    void testGetAutorPrincipal() {
        assertEquals("Jess", livro1.getAutorPrincipal().getNome());
    }

    @Test
    void testDisponibilidadePadrao() {
        assertTrue(livro1.isDisponivel());
    }

    @Test
    void testSetDisponivel() {
        livro1.setDisponivel(false);
        assertFalse(livro1.isDisponivel());
    }
}
