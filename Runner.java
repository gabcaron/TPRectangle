import java.util.Scanner;

/**
 * Classe Runner
 * 
 * Classe principale du TP2
 * 
 * @author Gabin CARON
 */
public class Runner
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner( System.in );
        int l, h, n;

        System.out.println("Entrer l :");
        l = scan.nextInt();

        System.out.println("Entrer h :");
        h = scan.nextInt();

        /*n = 5;

        Point [] points;
        points = new Point[n+2];
        points[0] = new Point(0, 0);
        points[1] = new Point(2, 5);
        points[2] = new Point(5, 17);
        points[3] = new Point(11, 4);
        points[4] = new Point(16, 6);
        points[5] = new Point(20, 1);
        points[6] = new Point(l, 0);*/

        int aire_max = 0;
        Rectangle r = new Rectangle();

        for(int i=0; i<points.length; i++)
        {
            int left = points[i].getX();
            for(int j=points.length-1; j>i; j--)
            {
                int right = points[j].getX();

                int min_top = h;
                for(int k=0; k<points.length; k++)
                {
                    if(points[k].getX()>left && points[k].getX()<right)
                    {
                        if(points[k].getY()>0 && points[k].getY()<min_top)
                        {
                            min_top = points[k].getY();
                        }
                    }
                }

                int aire = (right - left) * min_top;

                if(aire > aire_max)
                {
                    aire_max = aire;
                    r = new Rectangle(new Point(left, 0), new Point(left, min_top), new Point(right, min_top), new Point(right, 0));
                }

            }
        }

        System.out.println(aire_max);
        System.out.println(r.toString());
    }
}