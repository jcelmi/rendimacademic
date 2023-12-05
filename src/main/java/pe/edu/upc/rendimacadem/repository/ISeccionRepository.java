package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.Seccion;

public interface ISeccionRepository extends JpaRepository<Seccion,Long> {
}
