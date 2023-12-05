package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.rendimacadem.entity.Curso;
import pe.edu.upc.rendimacadem.entity.Docente;
import pe.edu.upc.rendimacadem.repository.ICursoRepository;
import pe.edu.upc.rendimacadem.repository.IDocenteRepository;

import java.util.List;

public class DocenteNegocio implements IDocenteNegocio{

    @Autowired
    IDocenteRepository iDocenteRepository;

    @Override
    public Docente registrar(Docente docente) {
        return iDocenteRepository.save(docente);
    }

    @Override
    public Docente buscar(Long codigo) throws Exception {
        return iDocenteRepository.findById(codigo).orElseThrow(
                () ->new Exception("No se encontró con el código ingresado"));

    }

    @Override
    public List<Docente> listado() {
        return iDocenteRepository.findAll();
    }
}
