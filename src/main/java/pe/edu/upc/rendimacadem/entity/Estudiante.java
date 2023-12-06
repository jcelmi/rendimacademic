package pe.edu.upc.rendimacadem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="estudiante")
@NoArgsConstructor
@Data
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private Date fecRegistro;
    private String fecNacimiento;
}
