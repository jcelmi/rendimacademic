package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="gradoseccioncurso")
@NoArgsConstructor
@Data
public class GradoSeccionCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private Long idGrado;
    private Long idSeccion;
    private Long idCurso;
    private Long idDocente;
    private int annio;

}
