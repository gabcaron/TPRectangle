import java.util.Scanner;

/**
 * Classe Runner2
 * 
 * Classe principale du TP2
 * 
 * @author Gabin CARON
 */
public class Runner2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner( System.in );
        int l, h, n;

        System.out.println("Entrer l :");
        l = scan.nextInt();

        System.out.println("Entrer h :");
        h = scan.nextInt();
/*
        n = 5;

        Point [] points;
        points = new Point[n+2];
        points[0] = new Point(0, 0);
        points[1] = new Point(2, 5);
        points[2] = new Point(5, 17);
        points[3] = new Point(11, 4);
        points[4] = new Point(16, 6);
        points[5] = new Point(20, 1);
        points[6] = new Point(l, 0);
*/
        int aire_max = (n+1 - 0) * 0;
        
        aire_max = rech(points, 0, n+1, aire_max);

        System.out.println(aire_max);
    }

    public static int rech(Point T[], int left, int right, int area)
    {
        int m = (left+right)/2;

        if(T[m-1].getY() <= T[m+1].getY())
        {
            int aire_max = (m-left)*T[m].getY();
            if(aire_max > area)
            {
                return rech(T, left, m, aire_max); 
            } else {
                return area;
            }
        } else if(T[m+1].getY() < T[m-1].getY()){
            int aire_max = (right-m)*T[m].getY();
            if(aire_max > area)
            {
                return rech(T, m, right, aire_max);
            } else {
                return area;
            }
        } else {
            return area;
        }
    }
}
