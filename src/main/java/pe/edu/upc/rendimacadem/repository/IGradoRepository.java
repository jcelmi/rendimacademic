package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.Grado;

public interface IGradoRepository extends JpaRepository<Grado,Long> {
}
