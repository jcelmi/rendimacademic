package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Curso;

import java.util.List;

public interface ICursoNegocio {
    public Curso registrar(Curso curso);
    public Curso buscar(Long codigo) throws Exception;
    public List<Curso> listado();
    public void eliminar(Long codigo);
}
