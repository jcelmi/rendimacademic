package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.rendimacadem.entity.Estudiante;

import pe.edu.upc.rendimacadem.repository.IEstudianteRepository;

import java.util.List;

@Service
public class EstudianteNegocio implements IEstudianteNegocio{
    @Autowired
    IEstudianteRepository iEstudianteRepository;

    @Override
    public Estudiante registrar(Estudiante estudiante) {
        return iEstudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante buscar(Long codigo) throws Exception {
        return iEstudianteRepository.findById(codigo).orElseThrow(
            () ->new Exception("No se encontró con el código ingresado"));

    }

    @Override
    public List<Estudiante> listado() {
        return iEstudianteRepository.findAll();
    }

    public void eliminar(Long codigo) {
        iEstudianteRepository.deleteById(codigo);
    }
}
