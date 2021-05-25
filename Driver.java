import java.util.ArrayList;
public class Driver
{
    

private ArrayList<Quadrilateral> list = new ArrayList<Quadrilateral>();
   
    public static void main(String[] args)
    {
    Driver app = new Driver();
    }
    public Driver()
     {
        list.add(new Parallelogram("ABCD", new Point(3,4), new Point(0,0),new Point(8,0)));
        list.add(new Parallelogram("EFGH", new Point(-3,4), new Point(1,1),new Point(10,1)));
        list.add(new Trapezoid("IJKL", new Point(1,3), new Point(0,0),new Point(5,0), new Point(3,3)));
        list.add(new Parallelogram("MNOP", new Point(4,9), new Point(3,2),new Point(6,2)));
        list.add(new Trapezoid("QRST", new Point(3,5), new Point(2,2),new Point(9,2), new Point(6,5)));
       
        System.out.println("Label\tPerimeter\tArea\n");
    //<for you to complete the print statements- 4 points>

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}