package pe.edu.upc.rendimacadem.negocio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.upc.rendimacadem.entity.Curso;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CursoNegocioTest {

    @Autowired
    private ICursoNegocio iCursoNegocio;
    @Test
    void registrar() {
        Curso curso = new Curso(0L,"Matematica2");
        iCursoNegocio.registrar(curso);
    }

    @Test
    void buscar() {
    }

    @Test
    void listado() {
    }

    @Test
    void testRegistrar() {
    }

    @Test
    void testBuscar() {
    }

    @Test
    void testListado() {
    }
}