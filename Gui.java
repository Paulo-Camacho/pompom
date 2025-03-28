package pompom;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Gui
{
    public static void display()
    {
        JFrame frame = new JFrame("Button Demo");

        // Add a title in the Page Start section
        JLabel title = new JLabel("Button Demo", SwingConstants.CENTER);
        Font heading = new Font("Times Roman", Font.BOLD, 20);
        title.setFont(heading);
        title.setPreferredSize(new Dimension(300, 50));
        title.setOpaque(true);
        title.setBackground(Color.decode("#f0e9e9"));
        frame.getContentPane().add(title, BorderLayout.PAGE_START);

        // Add a flow pane in the main center section
        JPanel pane = new JPanel(new FlowLayout());
        pane.setPreferredSize(new Dimension(300, 400));
        pane.setBackground(Color.PINK);
        pane.setOpaque(true);
        frame.getContentPane().add(pane, BorderLayout.CENTER);

        // Add two buttons to our pane
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");

        // Adjust the size and color of the start button
        start.setPreferredSize(new Dimension(100, 30));
        start.setBackground(Color.green);

        // Adjust the size and color of the stop button
        stop.setPreferredSize(new Dimension(75, 25));
        stop.setBackground(Color.red);

        pane.add(start);
        pane.add(stop);

        // Show the Frame
        frame.pack();
        frame.setVisible(true);
    }
}
