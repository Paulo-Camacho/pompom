package pompom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Timer;

public class Gui implements ActionListener {
    private JFrame frame;
    private JButton debug;
        private JButton rPom;
    private JLabel label;
    private JPanel panel;
    private Timer timer;

    private double time = 0.0;

    public Gui() {
        frame = new JFrame();

        debug = new JButton( "Debug" );
        rPom  = new JButton( "Run" );
        debug.addActionListener(this);
        rPom.addActionListener(this);

        label = new JLabel("INIT");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 50, 100));
        panel.setLayout(new GridLayout(3, 1));
        panel.add(debug);
        panel.add(rPom);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Check this out");
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
