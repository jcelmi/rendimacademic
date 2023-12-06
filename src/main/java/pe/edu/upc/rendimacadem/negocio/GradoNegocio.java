package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.Grado;
import pe.edu.upc.rendimacadem.repository.IGradoRepository;

import java.util.List;

@Service
public class GradoNegocio implements IGradoNegocio{
    @Autowired
    IGradoRepository iGradoRepository;
    @Override
    public Grado registrar(Grado grado) {
        return iGradoRepository.save(grado);
    }

    @Override
    public Grado buscar(Long codigo) throws Exception {
        return iGradoRepository.findById(codigo).orElseThrow(
            () ->new Exception("No se encontró con el código ingresado"));
    }

    @Override
    public List<Grado> listado() {
        return iGradoRepository.findAll();
    }

    @Override
    public void eliminar(Long codigo) {
        iGradoRepository.deleteById(codigo);
    }
}
