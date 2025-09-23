import Traza1.Sucursal;
import Traza2.Articulo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockSucursal {
    private Long id;
    private Sucursal sucursal;
    private Articulo articulo;
    private Integer cantidad;
}