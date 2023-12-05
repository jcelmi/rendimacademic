package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="grado")
@NoArgsConstructor
@Data
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descipcion;
    private String nivel;
}
