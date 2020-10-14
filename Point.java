/**
 * Classe Point
 * 
 * L'attribut x correspond à l'abscisse du Point dans un plan physique
 * L'attribut y correspond à l'ordonnée du Point dans un plan physique
 * 
 * @author Gabin CARON
 */
public class Point
{
    /**
     * Coordonnée x du Point
     */
    private int x;

    /**
     * Coordonnée y du Point
     */
    private int y;

    /**
     * Constructeur de Point
     * 
     * Attribue les coordonnées passées en paramètres au Point
     * 
     * @param abs
     *    Coordonnée en abscisse
     * @param ord
     *    Coordonnée en ordonnée
     */
    public Point(int abs, int ord)
    {
        x = abs;
        y = ord;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int abs)
    {
        x = abs;
    }

    public void setY(int ord)
    {
        y = ord;
    }

    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}