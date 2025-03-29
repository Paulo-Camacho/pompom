package pompom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;


public class Gui implements ActionListener
{
        private JFrame frame;
        private JButton debug;
        private JLabel label;
        private JPanel panel;


        Timer pDebug = new Timer();
        private int time = 0;



        public Gui( )
        {
                frame = new JFrame( );

                debug = new JButton( "debug " );
                debug.addActionListener(this);
                label = new JLabel( "INIT" );


                panel = new JPanel( );
                panel.setBorder(BorderFactory.createEmptyBorder( 30, 30, 10, 30 ) );
                panel.setLayout( new GridLayout( 0, 1 ) );
                panel.add( debug );
                panel.add( label );

                frame.add( panel, BorderLayout.CENTER );
                frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
                frame.setTitle( "Check this out" );
                frame.pack( );
                frame.setVisible(true);


        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
        double seconds = 0.1;
        for(int i = 0; i <= seconds * 60; ++i)
        {
            System.out.print( "\rThis is the " + i + "Th iteration" );
            label.setText( "Hello " );
            try
                {
                Thread.sleep(1000); // 1000 milliseconds = 1 second
                }
                catch (InterruptedException a)
                {
                System.out.println("SOMETHING WENT WRONG WITH SLEEP");
                }
        }
        System.out.println("TIMER AS STOPPED");
        }
}
