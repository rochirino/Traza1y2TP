import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
    
    
    