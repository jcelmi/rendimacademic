package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Nota;

import java.util.List;

public interface INotaNegocio {
    public Nota registrar(Long matriculaCodigo, Nota nota) throws Exception;
    public Nota buscar(Long codigo) throws Exception;
    public List<Nota> listado();
    public void eliminar(Long codigo);
    Nota actualizar(Long codigo, Nota nota) throws Exception;
}
