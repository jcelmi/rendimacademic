package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Seccion;

import java.util.List;

public interface ISeccionNegocio {
    public Seccion registrar(Seccion seccion);
    public Seccion buscar(Long seccion) throws Exception;
    public List<Seccion> listado();
    public void eliminar(Long codigo);
}
