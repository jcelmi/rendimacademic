package pe.edu.upc.rendimacadem.negocio;

import pe.edu.upc.rendimacadem.entity.Grado;

import java.util.List;

public interface IGradoNegocio {
    public Grado registrar(Grado grado);
    public Grado buscar(Long codigo) throws Exception;
    public List<Grado> listado();
}
