/******************************************************************************
 *  Compilation:  javac BulgingSquares.java
 *  Execution:    java BulgingSquares
 *  Dependencies: StdDraw.java, java.awt.Color
 *
 *  Program draws an optical illusion from Akiyoshi Kitaoka. The center appears 
 *  to bulge outwards even though all squares are the same size. 
 *
 *  meu_prompt > java BulgingSquares
 *
 *  Exercise 14 http://introcs.cs.princeton.edu/java/15inout/
 * 
 ******************************************************************************/

// Standard draw. This class provides a basic capability for creating
// drawings with your programs. It uses a simple graphics model that
// allows you to create drawings consisting of points, lines, and
// curves in a window on your computer and to save the drawings to a
// file.
// https://www.ime.usp.br/~pf/sedgewick-wayne/stdlib/documentation/index.html
// http://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
import edu.princeton.cs.algs4.StdDraw; // StdDraw.setXscale, StdDraw.setYscale, ...

import java.awt.Color; // StdDraw.WHITE, StdDraw.BLACK

public class BulgingSquares {
    // constantes... vixe! use se desejar
    private static final double XMIN   = -75;
    private static final double XMAX   =  75;
    private static final double YMIN   = -75;
    private static final double YMAX   =  75;
    private static final double MARGIN =   2;
    private static final double RADIUS_MAX =   5;
    private static final double DIAM_MAX   = 2*RADIUS_MAX;
    private static final double RADIUS_MIN = 1.5;
    private static final double DIAM_MIN   = 2*RADIUS_MIN;
    
    public static void main(String[] args) {
        // set the scale of the coordinate system
        StdDraw.setXscale(XMIN-MARGIN, XMAX+MARGIN);
        StdDraw.setYscale(YMIN-MARGIN, YMAX+MARGIN);
        StdDraw.enableDoubleBuffering();
        
        // clear the background
        StdDraw.clear(StdDraw.WHITE);

        // Escreva sua solução a seguir
        StdDraw.setPenColor(StdDraw.BLACK);

        // Desenhando os quadrados maiores
        for (double i = XMIN + RADIUS_MAX; i < XMAX; i += DIAM_MAX) {
            for (double j = YMAX - RADIUS_MAX; j > YMIN; j -= DIAM_MAX) {
                if (StdDraw.getPenColor() == StdDraw.WHITE) {
                    StdDraw.filledSquare(i, j, RADIUS_MAX);
                    StdDraw.setPenColor(StdDraw.BLACK);
                }

                else {
                    StdDraw.filledSquare(i, j, RADIUS_MAX);
                    StdDraw.setPenColor(StdDraw.WHITE);
                }
            }
        }

        // Desenhando os quadrados menores
        
        // copy offscreen buffer to onscreen
        StdDraw.show();
    }

} 
