import java.util.Scanner;

public class YahtzeeExamen {
    public static void main(String[] args) {
        int NUM_TIRADES = 4;
        int NUM_DAUS = 3;
        int[] RANG_DAU = {1,6};
        int[][] daus = new int[NUM_TIRADES][NUM_DAUS];
        char play;
        Scanner sc = new Scanner(System.in);
        /*
          El jugador puede jugar yahtzee hasta que no quiere o consigue yathzee
          Primer: Primer partido
          Siguente: partido numero i++
          Final: Jugador consigue yathzee o no quiere jugar mas
          Cerca: Consigue yathzee una vez, o no ya no quiere jugar
         */
        do{
            tiraDaus(daus,NUM_TIRADES,NUM_DAUS,RANG_DAU);
            mostrarPartides(daus,NUM_TIRADES,NUM_DAUS);
            if(esYahtzee(daus,NUM_TIRADES,NUM_DAUS)) {
                System.out.println("Yahtzee! cap tiratge conte nombres repetits");
                play = 'n';
            }
            else {
                System.out.print("No has aconseguit Yahtzee. Torna a intentar-ho (s/n)? ");
                play = sc.next().charAt(0);
                play = Character.toLowerCase(play);
                System.out.println();
            }
        } while(play != 'n');
    }

    /**
     * Tira los dados
     * @param daus matriz de dados
     * @param nT numero de vezes tirado
     * @param nD numero de dados a tirar
     * @param rD rango de valores de un dado
     */
    static void tiraDaus(int[][] daus, int nT, int nD, int[] rD) {
        /*
          Tira dados
          Primer: Primer dado de primera tira
          Siguente: Segundo dado de primera tira
          Final: Ultimo dado de ultima tira
          Recorregut
         */
        for (int i = 0; i < nT; i++) {
            for (int j = 0; j < nD; j++)
                daus[i][j] = (int) (Math.random() * rD[1]) + rD[0];
        }
    }

    /**
     * Compruba si cumple las condiciones para yahtzee
     * @param daus matriz de dados
     * @param nT numero de vezes tirado
     * @param nD numero de dados a tirar
     * @return si tenemos yahtzee o no
     */
    static boolean esYahtzee(int[][] daus, int nT, int nD) {
        /*
          Primer for itera las tiradas
          Segundo for itera el dado desde el principio
          Tercer for itera el dado justo despues
          Primer: Primer dado de primera tira comparado con segungo dado de primera tira
          Siguente: Primer dado de primera tira comparado con tercer dado de primera tira
          Final: Penultimo dado de primera tira comparado con ultimo dado de ultima tira
          Cerca: Si hay algun dado con el mismo valor en la misma tira, no tenemos yahtzee
         */
        for (int i = 0; i < nT; i++) {
            for (int j = 0; j < nD; j++) {
                for (int k = j+1; k < nD; k++) {
                    if(daus[i][j] == daus[i][k]) {
                        System.out.println("El tiratge " + (i+1) + " conte nombres repetits");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Muestra las tiras de los dados
     * @param daus matriz de dados
     * @param nT numero de vezes tirado
     * @param nD numero de dados a tirar
     */
    static void mostrarPartides(int[][] daus, int nT, int nD) {
        /*
          Muestra las tiras a pantalla
          Primer: Primer dado de primera tira
          Siguente: Segundo dado de primera tira
          Final: Ultimo dado de ultima tira
          Recorregut
         */
        for (int i = 0; i < nT; i++) {
            System.out.print("Tirada " + (i+1) + ": ");
            for (int j = 0; j < nD; j++)
                System.out.print(daus[i][j] + " ");
            System.out.println();
        }
    }
}

