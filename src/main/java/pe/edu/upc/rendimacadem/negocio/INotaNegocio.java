package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Nota;

import java.util.List;

public interface INotaNegocio {
    public Nota registrar(Nota nota);
    public Nota buscar(Long codigo) throws Exception;
    public List<Nota> listado();
}
