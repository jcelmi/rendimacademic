package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Docente;

import java.util.List;

public interface IDocenteNegocio {
    public Docente registrar(Docente docente);
    public Docente buscar(Long codigo) throws Exception;
    public List<Docente> listado();
    public void eliminar(Long codigo);
}
