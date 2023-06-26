import java.util.ArrayList;
import java.util.List;
abstract class Shape 
{
    public abstract void draw();
}
class Rectangle extends Shape 
{
    public void draw() 
	{	
        	System.out.println("Drawing a rectangle");
        }
}
class Circle extends Shape 
{
	public void draw() 
	{
        	System.out.println("Drawing a circle");
    	}
}
class TryAllObjects 
{
	public static void tryAll(List<? extends Shape> shapes) 
	{
        	for (int i = 0; i < shapes.size(); i++) 
		{
            		Shape shape = shapes.get(i);
            		shape.draw();
        	}
    	} 
}
class MyApp
{
	public static void main(String[] args) 
	{
		List<Shape> shapes= new ArrayList<Shape>();
    		Rectangle rec = new Rectangle();
     		shapes.add(rec);
		Circle cir = new Circle();
		shapes.add(cir);
        	TryAllObjects Try = new TryAllObjects();
		Try.tryAll(shapes);
	}
}