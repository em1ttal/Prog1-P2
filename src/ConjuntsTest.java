import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuntsTest {

    @Test
    void conjuntsIguals() {
        assertTrue(Conjunts.conjuntsIguals(new int[]{3, 7, 6, 9, 1, 8, 2, 0}, new int[]{3, 7, 6, 9, 1, 8, 2, 0}, 8));
    }

    @Test
    void conjuntsIguals1() {
        assertFalse(Conjunts.conjuntsIguals(new int[]{5, 1, 2, 0}, new int[]{3, 7, 0}, 4));
    }
}