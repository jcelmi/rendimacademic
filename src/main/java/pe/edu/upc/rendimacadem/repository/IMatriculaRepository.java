package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.GradoSeccionCurso;
import pe.edu.upc.rendimacadem.entity.Matricula;

import java.util.List;

public interface IMatriculaRepository extends JpaRepository<Matricula,Long> {
    List<Matricula> findByGradoSeccionCurso(GradoSeccionCurso gradoSeccionCurso);
}

