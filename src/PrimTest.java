import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimTest {

    @Test
    void esPrim() {
        assertTrue(Prim.esPrim(7));
    }

    @Test
    void esPrim1() {
        assertFalse(Prim.esPrim(10));
    }
}