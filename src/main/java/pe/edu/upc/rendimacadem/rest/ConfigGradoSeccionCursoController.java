package pe.edu.upc.rendimacadem.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.upc.rendimacadem.entity.*;
import pe.edu.upc.rendimacadem.negocio.*;

import java.util.List;

@RestController
@RequestMapping("/config")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ConfigGradoSeccionCursoController {
    // crud grado

    @Autowired
    private IGradoNegocio iGradoNegocio;
    Logger logger = LoggerFactory.getLogger(ConfigGradoSeccionCursoController.class);
    @GetMapping("/grados")
    public List<Grado> listaGrado(){
        logger.error("Error critico en la aplicación: " );
        List<Grado> grados= iGradoNegocio.listado() ;


        return iGradoNegocio.listado();
    }
    @PostMapping("/grado")
    public Grado registrarGrado(@RequestBody Grado obj){
        return iGradoNegocio.registrar(obj);
    }
    @GetMapping("/grado/{codigo}")
    public Grado buscarGrado(@PathVariable(value = "codigo")Long codigo){
        try {
            return iGradoNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }

    // crud seccion
    @Autowired
    private ISeccionNegocio iSeccionNegocio;
    @GetMapping("/seciciones")
    public List<Seccion> ListaSeccion(){
        return iSeccionNegocio.listado();
    }
    @PostMapping("/seccion")
    public Seccion registrarSeccion(@RequestBody Seccion obj){
        return iSeccionNegocio.registrar(obj);
    }
    @GetMapping("/seccion/{codigo}")
    public Seccion buscarSeccion(@PathVariable(value = "codigo")Long codigo){
        try {
            return iSeccionNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }

    // crud curso
    @Autowired
    private ICursoNegocio iCursoNegocio;
    @GetMapping("/cursos")
    public List<Curso> listaCurso(){
        return iCursoNegocio.listado();
    }
    @PostMapping("/curso")
    public Curso registrarCurso(@RequestBody Curso obj){
        return iCursoNegocio.registrar(obj);
    }
    @GetMapping("/curso/{codigo}")
    public Curso buscarCurso(@PathVariable(value = "codigo")Long codigo){
        try {
            return iCursoNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }

    // crud GradoSeccion
    @Autowired
    private IGradoSeccionNegocio iGradoSeccionNegocio;
    @GetMapping("/gradosecciones")
    public List<GradoSeccion> listaGradoSeccion(){
        return iGradoSeccionNegocio.listado();
    }
    @PostMapping("/gradoseccion")
    public GradoSeccion registrarGradoSeccion(@RequestBody GradoSeccion obj){
        return iGradoSeccionNegocio.registrar(obj);
    }
    @GetMapping("/gradoseccion/{codigo}")
    public GradoSeccion buscarGradoSeccion(@PathVariable(value = "codigo")Long codigo){
        try {
            return iGradoSeccionNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }

    // crud GradoSeccionCurso
    @Autowired
    private IGradoSeccionCursoNegocio iGradoSeccionCursoNegocio;
    @GetMapping("/gradoseccioncursos")
    public List<GradoSeccionCurso> listaGradoSeccionCurso(){
        return iGradoSeccionCursoNegocio.listado();
    }
    @PostMapping("/gradoseccioncurso")
    public GradoSeccionCurso registrarGradoSeccionCurso(@RequestBody GradoSeccionCurso obj){
        return iGradoSeccionCursoNegocio.registrar(obj);
    }
    @GetMapping("/gradoseccioncurso/{codigo}")
    public GradoSeccionCurso buscarGradoSeccionCurso(@PathVariable(value = "codigo")Long codigo){
        try {
            return iGradoSeccionCursoNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }

    // crud Estudiante
    @Autowired
    private IEstudianteNegocio iEstudianteNegocio;
    @GetMapping("/estudiantes")
    public List<Estudiante> listaEstudiantes(){
        return iEstudianteNegocio.listado();
    }

    @PostMapping("/estudiante")
    public Estudiante registrarEstudiante(@RequestBody Estudiante obj){
        return iEstudianteNegocio.registrar(obj);
    }
    @GetMapping("/estudiante/{codigo}")
    public Estudiante buscarEstudiante(@PathVariable(value = "codigo")Long codigo){
        try {
            return iEstudianteNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }

    // crud Docente
    @Autowired
    private IDocenteNegocio iDocenteNegocio;
    @GetMapping("/docentes")
    public List<Docente> listaDocentes(){
        return iDocenteNegocio.listado();
    }
    @PostMapping("/docente")
    public Docente registrarDocente(@RequestBody Docente obj){
        return iDocenteNegocio.registrar(obj);
    }
    @GetMapping("/docente/{codigo}")
    public Docente buscarDocente(@PathVariable(value = "codigo")Long codigo){
        try {
            return iDocenteNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }
}
