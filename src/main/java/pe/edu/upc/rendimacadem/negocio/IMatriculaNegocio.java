package pe.edu.upc.rendimacadem.negocio;
import pe.edu.upc.rendimacadem.entity.Matricula;
import pe.edu.upc.rendimacadem.entity.Nota;

import java.util.List;

public interface IMatriculaNegocio {
    public Matricula registrar(Matricula matricula);
    public Matricula buscar(Long codigo) throws Exception;
    public List<Matricula> buscarPorGradoSeccionCurso(Long gradoSeccionCursoCodigo) throws Exception;
    public List<Matricula> listado();

    List<Nota> getMatriculaNotas(Long codigo) throws Exception;
}
