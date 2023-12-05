package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gradoseccion")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GradoSeccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private Long idGrado;
    private Long idSeccion;
    private Long idTutor;
    private int annio;
}
