package geometria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GeometriaTest {

    Geometria geo = new Geometria();

    @Test
    public void testAreaCuadrado() {
        assertEquals(25, geo.areaCuadrado(5));
    }

    @Test
    public void testAreaCirculo() {
        assertEquals(Math.PI * 4 * 4, geo.areaCirculo(4), 0.0001);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(12.0, geo.areaTriangulo(6, 4));
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, geo.areaRectangulo(5, 4));
    }

    @Test
    public void testAreaPentagono() {
        assertEquals(30.0, geo.areaPentagono(10, 6));
    }
}
