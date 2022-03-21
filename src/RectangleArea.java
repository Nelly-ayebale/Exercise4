import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
    float length, width, area;
    public void getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This is a program that calculates the area of a rectangle.");
        System.out.print("Enter the length in cm: \n");
        length = Float.parseFloat(br.readLine());
        System.out.print("Enter the width in cm: \n");
        width = Float.parseFloat(br.readLine());

    }

    public void computeField() throws IOException{
        area = length*width;
    }
    public void fieldDisplay(){
        System.out.println("The area of the rectangle is:"+ area);
    }


}
class RectangleDemo{
    public static void main(String[] args) throws IOException {
        RectangleArea rec = new RectangleArea();
        rec.getData();
        rec.computeField();
        rec.fieldDisplay();
    }
}