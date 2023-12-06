package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.GradoSeccionCurso;

import java.util.List;

public interface IGradoSeccionCursoNegocio {
    public GradoSeccionCurso registrar(GradoSeccionCurso regg);
    public GradoSeccionCurso buscar(Long codigo) throws Exception;
    public List<GradoSeccionCurso> listado();
    public void eliminar(Long codigo);
}
