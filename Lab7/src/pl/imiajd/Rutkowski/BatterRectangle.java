package pl.imiajd.Rutkowski;
import java.awt.Rectangle;

public class BatterRectangle extends Rectangle{

    public BatterRectangle(int a, int b, int c, int d) {
        this.setLocation(a, b);
        this.setSize(c, d);
    }

    public double getPerimeter()
    {
        return (double)(2 * (this.height + this.width));
    }

    public double getArea()
    {
        return (double)(this.width * this.height);
    }

    public static void main(String[] args) {
        BatterRectangle TEST = new BatterRectangle(4, 4, 6, 7);
        System.out.println(TEST.getArea());
        System.out.println(TEST.getPerimeter());
    }
}
