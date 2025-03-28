package pompom;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {
    Timer pom = new Timer();

    private boolean debugPressed = false;  // This flag will be used to control flow

    public void menu() {
        int windowX = 1920;
        int windowY = 1080;

        JFrame frame = new JFrame("pomodoro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(windowX, windowY);

        JButton debug = new JButton("debug");
        frame.setLayout(new GridLayout(1, 1));
        frame.getContentPane().add(debug);

        // Set up the ActionListener
        debug.addActionListener(new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e)
                {
                debugPressed = true;  // Set the flag to true when button is clicked
                System.out.println( "Debug button was clicked" );
                display( );  // Optionally, call display directly
            }
        });

        frame.setVisible( true );
    }

    public void display( )
    {
        if (debugPressed)
            {
            System.out.println( "Starting debug pomodoro timer" );
            pom.start( 0.1 );
            // Implement the actions to take when debug mode is activated
        }
        else
        {
            System.out.println("Normal operation, continue as usual.");
        }
    }
}
