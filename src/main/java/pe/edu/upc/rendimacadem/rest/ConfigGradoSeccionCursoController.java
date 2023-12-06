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
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class ConfigGradoSeccionCursoController {
    // crud grado
    @Autowired
    private IGradoNegocio iGradoNegocio;
    Logger logger = LoggerFactory.getLogger(ConfigGradoSeccionCursoController.class);
    @GetMapping("/grados")
    public List<Grado> listaGrado(){
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

    @DeleteMapping("/grado-del/{codigo}")
    public void eliminarGrado(@PathVariable(value = "codigo")Long codigo){
        iGradoNegocio.eliminar(codigo);
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

    @DeleteMapping("/seccion-del/{codigo}")
    public void eliminarSeccion(@PathVariable(value = "codigo")Long codigo){
        iSeccionNegocio.eliminar(codigo);
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

    @DeleteMapping("/curso-del/{codigo}")
    public void eliminarCurso(@PathVariable(value = "codigo")Long codigo){
        iCursoNegocio.eliminar(codigo);
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

    @DeleteMapping("gradoseccion-del/{codigo}")
    public void eliminarGradoSeccion(@PathVariable(value = "codigo")Long codigo){
        iCursoNegocio.eliminar(codigo);
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
    @DeleteMapping("gradoseccioncurso-del/{codigo}")
    public void eliminarGradoSeccionCurso(@PathVariable(value = "codigo")Long codigo){
        iCursoNegocio.eliminar(codigo);
    }

    // crud Estudiantes
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
    @DeleteMapping("estudiante-del/{codigo}")
    public void eliminarEstudiante(@PathVariable(value = "codigo")Long codigo){
        iEstudianteNegocio.eliminar(codigo);
    }
    // crud Docentes
    @Autowired
    private IDocenteNegocio iDocentesNegocio;
    @GetMapping("/docentes")
    public List<Docente> listaDocentes(){
        return iDocentesNegocio.listado();
    }
    @PostMapping("/docente")
    public Docente registrarDocente(@RequestBody Docente obj){
        return iDocentesNegocio.registrar(obj);
    }
    @GetMapping("/docente/{codigo}")
    public Docente buscarDocente(@PathVariable(value = "codigo")Long codigo){
        try {
            return iDocentesNegocio.buscar(codigo);
        } catch (Exception e) {
            //Escribiendo en el log
            logger.error("Error critico en la aplicación: " + e);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe el registro con el codigo buscado", e);
        }
    }
    @DeleteMapping("docente-del/{codigo}")
    public void eliminarDocente(@PathVariable(value = "codigo")Long codigo){
        iDocentesNegocio.eliminar(codigo);
    }
}
