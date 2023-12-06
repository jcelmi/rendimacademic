package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Estudiante;

import java.util.List;

public interface IEstudianteNegocio {
    public Estudiante registrar(Estudiante estudiante);
    public Estudiante buscar(Long codigo) throws Exception;
    public List<Estudiante> listado();
    public void eliminar(Long codigo);
}
