package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="matriculas")
@NoArgsConstructor
@Data
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private Date fecha_matricula;

    @OneToOne()
    private Estudiante estudiante;

    @OneToOne()
    private GradoSeccionCurso gradoSeccionCurso;

    @OneToMany()
    private List<Nota> calificaciones;
}
