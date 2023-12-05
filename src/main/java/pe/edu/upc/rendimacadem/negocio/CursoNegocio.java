package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.Curso;
import pe.edu.upc.rendimacadem.repository.ICursoRepository;

import java.util.List;

@Service
public class CursoNegocio implements ICursoNegocio{
    @Autowired
    ICursoRepository iCursoRepository;

    @Override
    public Curso registrar(Curso curso) {
        return iCursoRepository.save(curso);
    }

    @Override
    public Curso buscar(Long codigo) throws Exception {
        return iCursoRepository.findById(codigo).orElseThrow(
            () ->new Exception("No se encontró con el código ingresado"));

    }

    @Override
    public List<Curso> listado() {
        return iCursoRepository.findAll();
    }
}
