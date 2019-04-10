/**
 * A program that use simple methods with parameters.
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class Part1
{

    /**
      * A program that use simple methods with parameters.
      */
    public static void main(String[] args)
    {
        // The method call below passes the following information
        //     1. The first parameter is the name (a string)
        //     2. The second parameter is the year of studies (an integer)
        //     3. The third parameter is the number of courses taken (an integer)
        //     3. The third parameter is the GPA (a double)

        printInfo("Ruben", 3, 12, 2.6);
    }


    /**
     * Prints the given information about an individual student.
     *
     * @param name the name of the student.
     * @param year the year of studies of the student.
     * @param courses the number of courses taken.
     * @param gpa the GPA of the student.
     */
    public static void printInfo(String name, int year, int courses,  double gpa)
    {
        System.out.println ("The student's name is " + name);
        System.out.println ("The student is in year " + year + " of studies.");
        System.out.println ("The student has taken " + courses + " courses");
        System.out.println ("The student's GPA is " + gpa);
    }

}
