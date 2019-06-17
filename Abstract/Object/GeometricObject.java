import java.util.Date;

/**
 * Bedirhan KAPLAN
 */
public abstract class GeometricObject 
{
    private String color ="White";
    private Date dateCreated;

    public GeometricObject()
    {
        dateCreated = new Date();
        this.color=color;
    }
	public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    public Date getDateCreated() 
    {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }
    @Override
    public String toString() 
    {
        return "Created Circle on " + dateCreated + "\nColor: " + color;
    }
    public abstract double calcArea();
}