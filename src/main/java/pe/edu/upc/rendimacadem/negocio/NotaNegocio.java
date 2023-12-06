package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.Matricula;
import pe.edu.upc.rendimacadem.entity.Nota;
import pe.edu.upc.rendimacadem.repository.IMatriculaRepository;
import pe.edu.upc.rendimacadem.repository.INotaRepository;

import java.util.List;

@Service
public class NotaNegocio implements INotaNegocio {
    @Autowired
    INotaRepository inotaRepository;
    @Autowired
    IMatriculaRepository iMatriculaRepository;

    @Override
    public Nota registrar(Long matriculaCodigo, Nota nota) throws Exception {
        Nota newNota = inotaRepository.save(nota);
        Matricula matricula = iMatriculaRepository.findById(matriculaCodigo)
                                .orElseThrow(() -> new Exception("No se encontró con el código de matrícula ingresado"));
        List<Nota> notasActuales = matricula.getCalificaciones();
        notasActuales.add(newNota);
        matricula.setCalificaciones(notasActuales);
        iMatriculaRepository.save(matricula);
        return newNota;
    }

    @Override
    public Nota buscar(Long codigo) throws Exception {
        return inotaRepository.findById(codigo).orElseThrow(
                () ->new Exception("No se encontró con el código ingresado"));
    }

    @Override
    public List<Nota> listado() {
        return inotaRepository.findAll();
    }

    public void eliminar(Long codigo) {
        inotaRepository.deleteById(codigo);
    }

    @Override
    public Nota actualizar(Long codigo, Nota nota) throws Exception {
        Nota notaActual = inotaRepository.findById(codigo).orElseThrow(() -> new Exception("No se encontró con el código ingresado"));
        notaActual.setDescripcion(nota.getDescripcion());
        notaActual.setCalificacion(nota.getCalificacion());
        inotaRepository.save(notaActual);
        return notaActual;
    }
}
