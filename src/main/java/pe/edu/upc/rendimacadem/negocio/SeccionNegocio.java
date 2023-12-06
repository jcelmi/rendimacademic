package pe.edu.upc.rendimacadem.negocio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.rendimacadem.entity.Seccion;
import pe.edu.upc.rendimacadem.repository.ISeccionRepository;

import java.util.List;

@Service
public class SeccionNegocio implements ISeccionNegocio {
    @Autowired
    ISeccionRepository iSeccionRepository;
    @Override
    public Seccion registrar(Seccion seccion) {
        return iSeccionRepository.save(seccion);
    }

    @Override
    public Seccion buscar(Long codigo) throws Exception {
        return iSeccionRepository.findById(codigo).orElseThrow(
            () ->new Exception("No se encontró con el código ingresado"));
    }

    @Override
    public List<Seccion> listado() {
        return iSeccionRepository.findAll();
    }
    public void eliminar(Long codigo) {
        iSeccionRepository.deleteById(codigo);
    }
}
