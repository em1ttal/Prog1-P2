import static org.junit.jupiter.api.Assertions.*;

class DiesSetmanaTest {

    @org.junit.jupiter.api.Test
    void nomDiesSetmana() {
        assertEquals("Monday", DiesSetmana.nomDiesSetmana(1));
    }

    @org.junit.jupiter.api.Test
    void nomDiesSetmana1() {
        assertEquals("Error", DiesSetmana.nomDiesSetmana(9));
    }

    @org.junit.jupiter.api.Test
    void nomDiesSetmana2() {
        assertEquals("Saturday", DiesSetmana.nomDiesSetmana(6));
    }

    @org.junit.jupiter.api.Test
    void nomDiesSetmana3() {
        assertEquals("Error", DiesSetmana.nomDiesSetmana(0));
    }
}