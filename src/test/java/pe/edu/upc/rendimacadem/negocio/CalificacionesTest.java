package pe.edu.upc.rendimacadem.negocio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.upc.rendimacadem.entity.*;
import java.util.Date;
import java.util.List;

@SpringBootTest
class CalificacionesTest {
    @Autowired
    private ICursoNegocio iCursoNegocio;
    @Autowired
    private ISeccionNegocio iSeccionNegocio;
    @Autowired
    private IDocenteNegocio iDocenteNegocio;
    @Autowired
    private IGradoNegocio iGradoNegocio;
    @Autowired
    private IEstudianteNegocio iEstudianteNegocio;
    @Autowired
    private IMatriculaNegocio iMatriculaNegocio;
    @Autowired
    private INotaNegocio iNotaNegocio;
    @Autowired
    private IGradoSeccionNegocio iGradoSeccionNegocio;
    @Autowired
    private IGradoSeccionCursoNegocio iGradoSeccionCursoNegocio;

    @Test
    void crearCalificaciones() {
//        Docente docente = new Docente();
//        docente.setCodigo(1L);
//        docente.setNombre("Profesor 1");
//        docente.setEspecialidad("Matemáticas");
//        iDocenteNegocio.registrar(docente);
//
//        Estudiante estudiante = new Estudiante();
//        estudiante.setCodigo(1L);
//        estudiante.setNombre("Jadir Omar");
//        estudiante.setApePaterno("Hervias");
//        estudiante.setApeMaterno("Salas");
//        estudiante.setFecRegistro(new Date());
//        estudiante.setFecNacimiento("02-07-2000");
//        iEstudianteNegocio.registrar(estudiante);
//
//        Curso curso = new Curso(1L,"Matematica");
//        iCursoNegocio.registrar(curso);
//
//        Grado grado = new Grado();
//        grado.setCodigo(1L);
//        grado.setDescipcion("primaria");
//        grado.setNivel("6");
//        iGradoNegocio.registrar(grado);
//
//        Seccion seccion = new Seccion();
//        seccion.setCodigo(1L);
//        seccion.setDescripcion("Sección 1");
//        iSeccionNegocio.registrar(seccion);
//
//        GradoSeccion gradoSeccion = new GradoSeccion();
//        gradoSeccion.setCodigo(1L);
//        gradoSeccion.setIdGrado(grado.getCodigo());
//        gradoSeccion.setIdSeccion(seccion.getCodigo());
//        gradoSeccion.setAnnio(2023);
//        gradoSeccion.setIdTutor(docente.getCodigo());
//        iGradoSeccionNegocio.registrar(gradoSeccion);
//
//        Nota nota = new Nota();
//        nota.setCodigo(1L);
//        nota.setDescripcion("TAREA 1");
//        nota.setCalificacion(18);
//        Nota nota2 = new Nota();
//        nota2.setCodigo(2L);
//        nota2.setDescripcion("TAREA 2");
//        nota2.setCalificacion(20);
//        Nota nota3 = new Nota();
//        nota3.setCodigo(3L);
//        nota3.setDescripcion("PC 1");
//        nota3.setCalificacion(16);
//
//        iNotaNegocio.registrar(nota);
//        iNotaNegocio.registrar(nota2);
//        iNotaNegocio.registrar(nota3);
//
//        GradoSeccionCurso gradoSeccionCurso = new GradoSeccionCurso();
//        gradoSeccionCurso.setCodigo(1L);
//        gradoSeccionCurso.setIdGrado(grado.getCodigo());
//        gradoSeccionCurso.setIdSeccion(seccion.getCodigo());
//        gradoSeccionCurso.setAnnio(2023);
//        gradoSeccionCurso.setIdDocente(docente.getCodigo());
//        gradoSeccionCurso.setIdCurso(curso.getCodigo());
//        iGradoSeccionCursoNegocio.registrar(gradoSeccionCurso);
//
//        Matricula matricula = new Matricula();
//        matricula.setCodigo(1L);
//        matricula.setEstudiante(estudiante);
//        matricula.setGradoSeccionCurso(gradoSeccionCurso);
//        matricula.setCalificaciones(List.of(nota, nota2, nota3));
//        matricula.setFecha_matricula(new Date());
//        gradoSeccionCurso.setMatriculas(List.of(matricula));
//
//        iMatriculaNegocio.registrar(matricula);
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