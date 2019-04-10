import java.util.Scanner;

/**
 * 
 *
 * @author Qurrat-al-Ain Siddiqui
 * 
 */
public class Part2
{
    public Part2()
    {
        double average = calculateAverage();
        
        System.out.println(average);
        
        printMessage(average);
    }

    public double calculateAverage()
    {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        int numberModules = keyboard.nextInt();
        
        while (count <= numberModules)
        {
            double grade = keyboard.nextDouble();
            sum += grade;
            count ++;
        }
        
        double average = sum / numberModules;
        return average;
    }
    
    public void printMessage(double average)
    {
        if (average < 50.0)
        {
            System.out.println("fail");
        }else if (average < 80.0)
        {
            System.out.println("pass");
        }else
        {
            System.out.println("excelent");
        }    
    }
}
