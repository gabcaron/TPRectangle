/**
 * Classe Rectangle
 * 
 * @author Gabin CARON
 */
public class Rectangle
{
    /**
     * Premier Point du Rectangle
     */
    private Point p1;

    /**
     * Deuxième Point du Rectangle
     */
    private Point p2;

    /**
     * Troisième Point du Rectangle
     */
    private Point p3;

    /**
     * Quatrième Point du Rectangle
     */
    private Point p4;

    /**
     * Constructeur de Rectangle (défaut)
     */
    public Rectangle()
    {
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
        p3 = new Point(0, 0);
        p4 = new Point(0, 0);
    }

    /**
     * Constructeur de Rectangle
     * 
     * Attribue les Points passés en paramètres au Rectangle
     * 
     * @param p1
     *     Premier Point
     * @param p2
     *     Deuxième Point
     * @param p3
     *     Troisième Point
     * @param p4
     *     Quatrième Point
     */
    public Rectangle(Point p1, Point p2, Point p3, Point p4)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public String toString()
    {
        return p1.toString() + " " + p2.toString() + "," + p3.toString() + " " + p4.toString();
    }
}