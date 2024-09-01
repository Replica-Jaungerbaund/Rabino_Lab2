// Rabino_Lab2 (Tutored by Kylie)
import java.util.Scanner;

// Cylinder Class
class Cylinder{

  // Variables (can be Double)
  protected int radius;
  protected int height;

  // Area Constructors
  public Cylinder(int radius, int height){
    this.radius = radius;
    this.height = height;
  }
  // Area of the Cylinder
  public void allOfCylinderArea(){
    double area = area();
    System.out.println("Area of the Cylinder is: " + area);
  }
  // Computing for the Area
  private double area(){
    // Changed the formula according to Google
    return 2 * Math.PI * radius * (radius + height);
  }

}
// Cylinder Volume Subclass
class CylinderVol extends Cylinder{

  // Allowing subclass to access Main Class (Cylinder) references
  public CylinderVol(int radius, int height){
    super(radius, height);
  }
  // Volume of the Cylinder
  public void allOfCylinderVol(){
    double volume = volume();
    System.out.println("Volume of the Cylinder is: " + volume);
  }
  // Computing for the Volume (Changed formula according to Google)
  private double volume(){
    return Math.PI * radius * radius * height;
  }

}

// Main function
public class Rabino_Lab2{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // Radius input
      System.out.print("Enter radius: ");
      int radius = input.nextInt();
      // Height input
      System.out.print("Enter height: ");
      int height = input.nextInt();
      
      Cylinder merged = new Cylinder(radius, height);
      merged.allOfCylinderArea();
      
      CylinderVol megered = new CylinderVol(radius, height);
      megered.allOfCylinderVol();
  }
}
