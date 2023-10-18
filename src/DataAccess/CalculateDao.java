package DataAccess;

import Common.Validation;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public class CalculateDao {
    private static CalculateDao instance = null;
    
    public static CalculateDao Instance(){
        if(instance == null){
            synchronized (CalculateDao.class){
                if(instance == null){
                    instance = new CalculateDao();
                }
            }
        }
        return instance;
    }
    public void calculatorRectangle() {
        double width = Validation.getDouble("Please input width of Rectangle: ");
        double length = Validation.getDouble("Please input length of Rectangle: ");
        Rectangle r = new Rectangle(width, length);
        r.printResult();
    }

    public void calculatorCirlce() {
        double radius = Validation.getDouble("Please input radius of Circle: ");
        Circle c = new Circle(radius);
        c.printResult();
    }

    public void calculatorTriangle() {
        double a = Validation.getDouble("Please input side A of Triangle: ");
        double b = Validation.getDouble("Please input side B of Triangle: ");
        double c = Validation.getDouble("Please input side C of Triangle: ");
        Triangle t = new Triangle(a, b, c);
        t.printResult();
    }
}
