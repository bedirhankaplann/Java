/**
 * Bedirhan Kaplan - Circle.class
 */
public class Circle extends GeometricObject
{
    private double radius;
    public Circle()
    {
        super();
    }
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    public double getRadius() 
    {
        return radius;
    }
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }
    public double calcArea()
    {
        return this.radius * this.radius * Math.PI;
    }
    public static boolean equals(Circle o, Circle o2)
    {
        if (o2 == o) 
        {
            return true;  
        } else 
        {
            return false;    
        }
    }

}