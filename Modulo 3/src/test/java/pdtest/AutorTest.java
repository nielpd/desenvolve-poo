import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void testCriacaoAutor() {
        Autor autor = new Autor("Carlos Drummond", 65);
        assertEquals("Carlos Drummond", autor.getNome());
        assertEquals(65, autor.getIdade());
    }
}
