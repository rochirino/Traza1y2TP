package Traza2;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter


public class Articulo {
    protected Long id;
    protected String denominacion;
    protected Double precioVenta;

    @Builder.Default
    protected Set<ImagenArticulo> imagenes = new HashSet<>();
    protected UnidadMedida unidadMedida;
    private Categoria categoria;
}

    
    
    