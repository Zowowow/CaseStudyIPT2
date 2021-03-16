public class BasicGeometry {


    public static void main(String[] args) {

         Formulas fmla = new Formulas();

         //Made By Renzo Aldridge Quiballo
         //start
         System.out.println(fmla.areaOfCircle(4.0));
         System.out.println(fmla.areaOfTriangle(5.0,7.0));
         System.out.println(fmla.areaOfSquare(6.5));
         System.out.println(fmla.areaOfRectangle(4.5,3.5));
         //end

	//Made By Marvelous Patrick Malungcut
         //start
         System.out.println(fmla.perimeterOfCircle(7.0));
         System.out.println(fmla.perimeterOfSquare(6.0));
         System.out.println(fmla.perimeterOfRectangle(10.0,9.0));
         System.out.println(fmla.perimeterOfParallelogram(4.0,6.5));
         //end
    }

}
class Formulas{

    //Made by Renzo Aldridge Quiballo
    //start
    public double areaOfCircle(double r){
        double pi =  3.1415;
        double area = (pi(rr));
        return area;
    }
    public double areaOfTriangle(double b, double h){
        double area = (bh)/2;
        return area;
    }
    public double areaOfSquare(double a){
        double area = (aa);
        return area;
    }
    public double areaOfRectangle(double b, double h){
        double area = (bh);
        return area;
    }
    //end
	//Made by Marvelous Patrick Malungcut
    //start
    public double perimeterOfCircle(double r){
        double pi =  3.1415;
        double perim = ((2pi)(r));
        return perim;
    }
    public double perimeterOfSquare(double a){
        double perim = (4a);
        return perim;
    }
    public double perimeterOfRectangle(double b, double h){
        double perim = 2(b + h);
        return perim;
    }
    public double perimeterOfParallelogram(double b, double h){
        double perim = 2(b + h);
        return perim;
    }
    //end
}

