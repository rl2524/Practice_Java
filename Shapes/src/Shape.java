import java.util.Scanner;

/**
 * Ask the user if they want to find the area or perimeter. Then asks for which shape, a rectangle or circle. Finally
 * displays the value and ask the user if they would like to continue.
 * @author Ramiro Rojas.
 */
public class Shape {
    /**
     * for user input
     */
    public static Scanner scrn = new Scanner(System.in);

    /**
     * Asks for the perimeter of the rectangle or circle and prints it. If the user input is invalid it displays
     * a message.
     * @param rOrc for rectangle or circle
     */
    public void Perimeter (String rOrc){
        double sum = 0;                                             //the final sum of the perimeter.
        if (rOrc.equals("r") || rOrc.equals("R")){
            System.out.println("Enter the length: ");
            double length = scrn.nextDouble();                      //user input for length
            System.out.println("Enter the width: ");
            double width = scrn.nextDouble();                       //user input for width
            if (length < 0.0 || width < 0.0){
                System.out.println("Enter a number 0 or greater");
            }else {
                sum = (2 * length) + (2 * width);                       //the algorithm for the perimeter
                System.out.println("The perimeter of the the Rectangle with a length of: " + length + " and width: "
                        + width + " is: " + sum);
            }

        }else if (rOrc.equals("C") || rOrc.equals("c")){
            System.out.println("Enter the radius: ");
            double radius = scrn.nextDouble();                      //the radius of the circle
            if (radius < 0.0){
                System.out.println("Enter a number 0 or greater");
            }else {
                sum  = 2 * Math.PI * radius;
                System.out.println("The circumference the circle with a radius of " + radius + " is: " + sum);
            }

        }else{
            System.out.println("You enter an invalid character. Please enter R/r or C/c");
        }
    }

    /**
     * Asks for  the area of the rectangle or circle and prints it. If user input is invalid it displays a message.
     * @param rOrc for rectangle or circle
     */
    public void Area (String rOrc){
        double sum = 0;
        if (rOrc.equals("r") || rOrc.equals("R")){
            System.out.println("Enter the length: ");
            double length = scrn.nextDouble();                      //user input for length
            System.out.println("Enter the width: ");
            double width = scrn.nextDouble();                       //user input for width
            if (width < 0.0 || length < 0.0){                                       //if number is less than 0 then returns a message
                System.out.println("Enter a number 0 or greater");
            }else {
                sum = length * width;                                  //algorithm for the area of the rectangle
                System.out.println("The Area of the the Rectangle with a length of: " + length + " and width: "
                        + width + " is: " + sum);
            }
        }else if (rOrc.equals("C") || rOrc.equals("c")){
            System.out.println("Enter the radius: ");
            double radius = scrn.nextDouble();                      //user input for the radius
            if (radius < 0.0){                                      //if number is less than 0 then returns a message
                System.out.println("Enter a number 0 or greater");
            }else {
                sum  = Math.PI * Math.pow(radius, 2);                   //algorithm for the area of a circle
                System.out.println("The Area the circle with a radius of " + radius + " is: " + sum);
            }

        }else{
            System.out.println("You enter an invalid character. Please enter R/r or C/c");
        }

    }

    /**
     * Asks for the user input for whether they want to find the area or perimeter. Then proceeds to ask for which
     * shape, the rectangle or circle. Finally ask the user if they would like to continue.
     * @param args none
     */
    public static void main(String[] args) {
        String userInput = "";
        Shape myShape = new Shape();

        do{
            System.out.print("Find Area or Perimeter? A / P: ");
            String AorP = scrn.next();
            if (AorP.equals("P")){

                do {

                    System.out.println("Enter R/r for Rectangle or C/c for Circle :");
                    userInput = scrn.next();

                    if (!(userInput.equals("R") || userInput.equals("r") || userInput.equals("C")
                            || userInput.equals("c"))){
                        System.out.println("Please enter a valid key.");
                    }
                    myShape.Perimeter(userInput);

                }while(userInput.equals("P"));
            } else if (AorP.equals("A")) {
                do {
                    System.out.println("Enter R/r for Rectangle or C/c for Circle :");
                    userInput = scrn.next();
                    if (!(userInput.equals("R") || userInput.equals("r") || userInput.equals("C")
                            || userInput.equals("c"))){
                        System.out.println("Please enter a valid key.");
                    }

                    myShape.Area(userInput);

                } while (userInput.equals("A"));
            }else {
                System.out.println("You enter an invalid key.");
            }
            System.out.println("Would you like to continue? Y/N: ");
            userInput = scrn.next();
        }while(userInput.equals("Y") || userInput.equals("y"));

        }


    }

