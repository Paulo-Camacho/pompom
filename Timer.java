package pompom;

import java.util.Scanner;


public class Timer
{
    public void start( double seconds )
    {
        System.out.println( "INIT TIMER" );
        // TIMER
        for(int i = 0; i <= seconds * 60; ++i)
        {
            System.out.println("\rThis is the " + i + "Th iteration");
            try
                {
                Thread.sleep(1000); // 1000 milliseconds = 1 second
                }
                catch (InterruptedException e)
                {
                System.out.println("SOMETHING WENT WRONG WITH SLEEP");
                }
        }
        System.out.println("TIMER AS STOPPED");
    }
}
