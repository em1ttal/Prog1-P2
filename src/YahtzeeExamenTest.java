import static org.junit.jupiter.api.Assertions.*;

class YahtzeeExamenTest {

    @org.junit.jupiter.api.Test
    void esYahtzee() {
        int[][] daus = {{2,3,5},{6,1,4},{1,1,4},{2,3,6}};
        assertFalse(YahtzeeExamen.esYahtzee(daus,4,3));
    }

    @org.junit.jupiter.api.Test
    void esYahtzee1() {
        int[][] daus = {{2,3,5},{6,1,4},{2,1,4},{2,3,6}};
        assertTrue(YahtzeeExamen.esYahtzee(daus,4,3));
    }
}