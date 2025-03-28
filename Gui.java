package pompom;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class Gui
{
    public void menu()
    {
        int windowX = 1920;
        int windowY = 1080;

       JFrame frame = new JFrame( "pomodoro" );
       frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       frame.setSize( windowX, windowY );

       JButton debug = new JButton( "debug" );
       frame.setLayout(new GridLayout( 1, 1 ));
       frame.getContentPane().add( debug );

       debug.addActionListener(null);

        frame.setVisible(true);



    }


    public void display( )
    {
        Scanner userIn = new Scanner( System.in );
        System.out.println( "ENTER" );
        while (!userIn.hasNextDouble())
        {
            System.out.println( "Invalid input. Please enter a number for seconds:" );
            userIn.next();
        }
        double length  = userIn.nextDouble( ) * 60;
        Timer clock = new Timer( );
        clock.start( length );
        userIn.close( );
    }
}
