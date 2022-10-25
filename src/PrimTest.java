import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimTest {

    @Test
    void esPrim() {
        assertEquals(true, Prim.esPrim(7));
    }

    @Test
    void esPrim1() {
        assertEquals(false, Prim.esPrim(10));
    }
}