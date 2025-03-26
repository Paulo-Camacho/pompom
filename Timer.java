package pompom;
import java.util.Scanner;

public class Timer
{
    private int seconds;

    public Timer( int seconds )
    {
        this.seconds = seconds;
    }

    public void start()
    {
        System.out.println( "Please enter the amount of timer you would like to run the Timer" );
        Scanner sInput = new Scanner(System.in);
        int seconds = sInput.nextInt();
        for(int i = 0; i <= seconds; ++i)
        {
            System.out.println("This is the " + i + "Th iteration");
            try {
                Thread.sleep(1000); // 1000 milliseconds = 1 second
            } catch (InterruptedException e) {
                // This block is where you can handle any interrupts that occur while sleeping
                System.out.println("The sleep was interrupted.");
            }

            }
    }

}
