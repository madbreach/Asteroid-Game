import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Circle{

	private static final int RADIUS = 200;
	private double rotation;
	static double x;
	Point center;
	
	public Bullet(Point center, double rotation) {

		super(center, RADIUS); // define RADIUS in Bullet class

		this.rotation = rotation;
		
		this.center = center;
		
		x = center.x;

		}
	
	public void move() {

		center.x += 2 * Math.cos(Math.toRadians(rotation));

		center.y += 2 * Math.sin(Math.toRadians(rotation));

		}
	
	

	@Override
	public void paint(Graphics brush, Color color) {
		brush.setColor(color);
		brush.fillOval((int) center.x, (int) center.y, radius, radius);
	}


}
