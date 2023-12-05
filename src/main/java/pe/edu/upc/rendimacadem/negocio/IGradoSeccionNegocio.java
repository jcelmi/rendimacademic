package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.GradoSeccion;

import java.util.List;

public interface IGradoSeccionNegocio {
    public GradoSeccion registrar(GradoSeccion regg);
    public GradoSeccion buscar(Long codigo) throws Exception;
    public List<GradoSeccion> listado();
}
