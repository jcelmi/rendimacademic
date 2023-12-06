package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.Nota;
import pe.edu.upc.rendimacadem.repository.INotaRepository;

import java.util.List;

@Service
public class NotaNegocio implements INotaNegocio {
    @Autowired
    INotaRepository inotaRepository;

    @Override
    public Nota registrar(Nota nota) {
        return inotaRepository.save(nota);
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
}
