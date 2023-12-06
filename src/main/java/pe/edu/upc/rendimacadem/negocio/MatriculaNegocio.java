package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.GradoSeccionCurso;
import pe.edu.upc.rendimacadem.entity.Matricula;
import pe.edu.upc.rendimacadem.entity.Nota;
import pe.edu.upc.rendimacadem.repository.IGradoSeccionCursoRepository;
import pe.edu.upc.rendimacadem.repository.IMatriculaRepository;

import java.util.List;

@Service
public class MatriculaNegocio implements IMatriculaNegocio {
    @Autowired
    IMatriculaRepository iMatriculaRepository;

    @Autowired
    IGradoSeccionCursoRepository iGradoSeccionCursoRepository;

    @Override
    public Matricula registrar(Matricula nota) {
        return iMatriculaRepository.save(nota);
    }

    @Override
    public Matricula buscar(Long codigo) throws Exception {
        return iMatriculaRepository.findById(codigo).orElseThrow(
                () ->new Exception("No se encontró con el código ingresado"));
    }

    @Override
    public List<Nota> getMatriculaNotas(Long codigo) throws Exception {
        Matricula matricula = iMatriculaRepository.findById(codigo).orElseThrow(
                () ->new Exception("No se encontró con el código ingresado"));

        return matricula.getCalificaciones();
    }

    @Override
    public List<Matricula> buscarPorGradoSeccionCurso(Long gradoSeccionCursoCodigo) throws Exception {
        GradoSeccionCurso gradoSeccionCurso = iGradoSeccionCursoRepository.findById(gradoSeccionCursoCodigo)
                .orElseThrow(() ->new Exception("No se encontró con el código ingresado"));

        return iMatriculaRepository.findByGradoSeccionCurso(gradoSeccionCurso);
    }

    @Override
    public List<Matricula> listado() {
        return iMatriculaRepository.findAll();
    }
}
