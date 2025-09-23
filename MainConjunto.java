import Traza1.*;
import Traza2.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainConjunto {
    public static void main(String[] args) {
        // TRAZA 1
        Pais argentina = Pais.builder().nombre("Argentina").build();

        Provincia buenosAires = Provincia.builder()
                .id(1L).nombre("Buenos Aires").pais(argentina).build();

        Localidad caba = Localidad.builder()
                .id(1L).nombre("CABA").provincia(buenosAires).build();

        Domicilio domicilio1 = Domicilio.builder()
                .id(1L).calle("Calle 1").numero(100).cp(1000).piso(1).nroDpto(1)
                .localidad(caba).build();

        Sucursal sucursal1 = Sucursal.builder()
                .id(1L).nombre("Sucursal 1")
                .horarioApertura(LocalTime.of(9, 0))
                .horarioCierre(LocalTime.of(18, 0))
                .esCasaMatriz(true)
                .domicilio(domicilio1).build();

        Empresa empresa1 = Empresa.builder()
                .id(1L)
                .nombre("Empresa 1")
                .razonSocial("Razon Social 1")
                .cuil(12345678901L)
                .sucursales(new HashSet<>(Set.of(sucursal1)))
                .build();

        sucursal1.setEmpresa(empresa1);

        System.out.println("Empresa creada: " + empresa1);

        // TRAZA 2
        Categoria bebidas = Categoria.builder()
                .id(1L).denominacion("Bebidas").build();

        UnidadMedida litros = UnidadMedida.builder()
                .id(1L).denominacion("Litros").build();

        ArticuloInsumo cocaCola = ArticuloInsumo.builder()
                .id(1L)
                .denominacion("Coca Cola 1.5L")
                .precioCompra(500.0)
                .precioVenta(800.0)
                .stockActual(100)
                .stockMinimo(20)
                .esParaElaborar(false)
                .unidadMedida(litros)
                .categoria(bebidas)
                .build();

        System.out.println("Insumo creado: " + cocaCola);


        //Conjunto traza 1 y 2
        StockSucursal stock1 = StockSucursal.builder()
                .id(1L)
                .sucursal(sucursal1)
                .articulo(cocaCola)
                .cantidad(50)
                .build();

        System.out.println("Stock cargado en sucursal: " + stock1);
    }
}