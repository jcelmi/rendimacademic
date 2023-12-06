package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.Nota;

public interface INotaRepository extends JpaRepository<Nota,Long> {
}
