package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name="gradoseccioncurso")
@NoArgsConstructor
@AllArgsConstructor
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
    @OneToMany()
    private List<Matricula> matriculas;

}
