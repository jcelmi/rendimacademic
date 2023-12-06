package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.GradoSeccionCurso;
import pe.edu.upc.rendimacadem.repository.IGradoSeccionCursoRepository;

import java.util.List;

@Service
public class GradoSeccionCursoNegocio implements IGradoSeccionCursoNegocio{
    @Autowired
    IGradoSeccionCursoRepository iGradoSeccionCursoRepository;
    @Override
    public GradoSeccionCurso registrar(GradoSeccionCurso gradoSeccionCurso) {
        return iGradoSeccionCursoRepository.save(gradoSeccionCurso);
    }

    @Override
    public GradoSeccionCurso buscar(Long codigo) throws Exception {
        return iGradoSeccionCursoRepository.findById(codigo).orElseThrow(
            () ->new Exception("No se encontró con el código ingresado"));

    }

    @Override
    public List<GradoSeccionCurso> listado() {
        return iGradoSeccionCursoRepository.findAll();
    }
    public void eliminar(Long codigo) {
        iGradoSeccionCursoRepository.deleteById(codigo);
    }
}
