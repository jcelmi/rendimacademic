package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="calificaciones")
@NoArgsConstructor
@Data
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private int calificacion;
    private String descripcion;
}
