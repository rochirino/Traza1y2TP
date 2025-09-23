package Traza1;
import lombok.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString(exclude = "sucursales")
@SuperBuilder
public class Empresa {
    private Long id;
    private String nombre;
    private String razonSocial;
    private Long cuil;


    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();
}