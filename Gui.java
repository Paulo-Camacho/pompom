package pompom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;

public class Gui implements ActionListener {

    private JFrame frame;
    private JButton debug;
    private JLabel label;
    private JPanel panel;
    private Timer timer;
    private int windowX = 1920;
    private int windowY = 1080;

    private double time = 0.0;

    public Gui() {
        frame = new JFrame();


        frame.setLocationRelativeTo(null);
        // buttons
        debug = new JButton( "Debug" );
        debug.setPreferredSize(new Dimension(250, 250));
        debug.setFont(new Font("Arial", Font.PLAIN, 25));
        label = new JLabel( "INIT" );
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setPreferredSize(new Dimension(250, 250));

        debug.addActionListener(this);

        panel = new JPanel();
        // Y, X, some sort of padding
        panel.setBorder(BorderFactory.createEmptyBorder(500, 500, 500, 500));
        panel.setLayout(new GridLayout( 1, 3 ));
        panel.add(debug);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle( "Pomodoro Timer" );
        frame.pack();
        frame.setVisible(true);

        // Setup timer to update label every second
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                time++;
                label.setText("Seconds elapsed: " + time);
                if (time >= 5) { // Stop after 60 seconds
                    timer.stop();
                    label.setText("TIMER HAS STOPPED");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time = 0.0; // Reset time
        label.setText("INIT"); // Reset label text
        timer.start(); // Start the timer
    }

}
