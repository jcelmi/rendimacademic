package pe.edu.upc.rendimacadem.negocio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.upc.rendimacadem.entity.Curso;
import pe.edu.upc.rendimacadem.entity.Grado;
import pe.edu.upc.rendimacadem.entity.Seccion;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

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
    void listadoSeccion() {
        when(iSeccionNegocio.listado()).thenReturn(
                Stream.of(
                                new Seccion(0L,"A"),
                                new Seccion(0L,"B"),
                                new Seccion(0L,"C")).
                        collect(Collectors.toList()));
        Assertions.assertEquals(3, iSeccionNegocio.listado().size());
    }

    @Test
    void listadoGrado() {
        when(iGradoNegocio.listado()).thenReturn(
                Stream.of(
                                new Grado(0L,"1","Secundaria"),
                                new Grado(0L,"2","Secundaria"),
                                new Grado(0L,"3","Secundaria"),
                                new Grado(0L,"4","Secundaria")).
                        collect(Collectors.toList()));
        Assertions.assertEquals(4, iGradoNegocio.listado().size());
    }

    @Test
    void listadoCurso() {
        when(iCursoNegocio.listado()).thenReturn(
                Stream.of(
                        new Curso(0L,"Matematica"),
        new Curso(0L,"Comunicacion"),
        new Curso(0L,"Historia")).
                        collect(Collectors.toList()));
        Assertions.assertEquals(3, iCursoNegocio.listado().size());
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