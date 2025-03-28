package pompom;

import java.util.Scanner;
import javax.swing.JFrame;

public class Gui
{
    public void display( )
    {
        Scanner userIn = new Scanner(System.in);
        System.out.println("ENTER");
        while (!userIn.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a number for seconds:");
            userIn.next(); // consume the invalid input
        }
        double length  = userIn.nextDouble( ) * 60;
        Timer clock = new Timer( );
        clock.start( length );

        userIn.close( ); // Close the scanner to free resources


    }
}
