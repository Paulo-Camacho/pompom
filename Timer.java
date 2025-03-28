package pompom;

import java.util.Scanner;
//import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


public class Timer
{
    public void menu()
    {
        int windowX = 1920;
        int windowY = 1080;

       JFrame frame = new JFrame( "Pomodoro" );
       frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       frame.setSize(windowX, windowY);

       frame.setLayout(new FlowLayout());

       // Adding buttons to each region
       frame.add(new JButton("North"), BorderLayout.NORTH);
       frame.add(new JButton("South"), BorderLayout.SOUTH);
       frame.add(new JButton("East"), BorderLayout.EAST);
       frame.add(new JButton("West"), BorderLayout.WEST);
       frame.add(new JButton("Center"), BorderLayout.CENTER);

       frame.setVisible(true);
    }

    public void start(double seconds)
    {
        System.out.println("INIT TIMER");

        // TIMER
        for (int i = 0; i <= seconds; ++i)
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
