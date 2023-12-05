package pe.edu.upc.rendimacadem.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.GradoSeccion;
import pe.edu.upc.rendimacadem.repository.IGradoSeccionRepository;

import java.util.List;

@Service
public class GradoSeccionNegocio implements IGradoSeccionNegocio{
    @Autowired
    IGradoSeccionRepository iGradoSeccionRepository;
    @Override
    public GradoSeccion registrar(GradoSeccion grado) {
        return iGradoSeccionRepository.save(grado);
    }

    @Override
    public GradoSeccion buscar(Long codigo) throws Exception {
        return iGradoSeccionRepository.findById(codigo).orElseThrow(
            () ->new Exception("No se encontró con el código ingresado"));

    }

    @Override
    public List<GradoSeccion> listado() {
        return iGradoSeccionRepository.findAll();
    }
}
