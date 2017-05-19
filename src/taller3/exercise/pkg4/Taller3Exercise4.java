
package taller3.exercise.pkg4;
import java.util.Scanner;
/**
 *
 * @author Sebastian Baldion
 */
public class Taller3Exercise4 {

    public static void main(String[] args) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un valor m");
        m = in.nextInt();
        n = m;
        
        int matrix[][] = new int[m][n];
        System.out.print("Ingrese "+m*n +" elemntos separados por enter o espacio\n");
        
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                matrix[c][d] = in.nextInt();
            }
        }
        
        int transpose[][] = new int[n][m];
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                transpose[d][c] = matrix[c][d];
            }
        }
        System.out.println("Transposición de la matriz:");

        for (c = 0; c < n; c++) {
            for (d = 0; d < m; d++) {
                System.out.print(transpose[c][d] + "\t");
            }
            System.out.print("\n");         
        }        
    }
}
