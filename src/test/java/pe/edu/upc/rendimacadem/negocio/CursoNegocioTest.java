package pe.edu.upc.rendimacadem.negocio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.upc.rendimacadem.entity.Curso;
import pe.edu.upc.rendimacadem.entity.Grado;
import pe.edu.upc.rendimacadem.entity.Seccion;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CursoNegocioTest {

    @Autowired
    private ICursoNegocio iCursoNegocio;
    @Autowired
    private ISeccionNegocio iSeccionNegocio;
    @Autowired
    private IGradoNegocio iGradoNegocio;
    @Test
    void registrar() {

        Curso curso = new Curso(0L,"Matematica");
        iCursoNegocio.registrar(curso);
        curso = new Curso(0L,"Comunicacion");
        iCursoNegocio.registrar(curso);
        curso = new Curso(0L,"Historia");
        iCursoNegocio.registrar(curso);
        curso = new Curso(0L,"Biologia");
        iCursoNegocio.registrar(curso);
        curso = new Curso(0L,"Aritmetica");
        iCursoNegocio.registrar(curso);

        Seccion seccion = new Seccion(0L,"A");
        iSeccionNegocio.registrar(seccion);
        seccion = new Seccion(0L,"B");
        iSeccionNegocio.registrar(seccion);
        seccion = new Seccion(0L,"C");
        iSeccionNegocio.registrar(seccion);

        Grado grado = new Grado(0L,"1","Secundaria");
        iGradoNegocio.registrar(grado);
        grado = new Grado(0L,"2","Secundaria");
        iGradoNegocio.registrar(grado);
        grado = new Grado(0L,"3","Secundaria");
        iGradoNegocio.registrar(grado);
        grado = new Grado(0L,"4","Secundaria");
        iGradoNegocio.registrar(grado);
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
    void testEliminar() {
    }

    @Test
    void testListado() {
    }
}