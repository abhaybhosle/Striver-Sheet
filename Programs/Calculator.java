package Programs;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        // Create a new JFrame (the main window)
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the button
        JPanel panel = new JPanel();

        // Create the "Add" button
        JButton addButton = new JButton("Add");

        // Add an action listener using an anonymous inner class
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display the message when the button is clicked
                JOptionPane.showMessageDialog(frame, "Performing addition operation");
            }
        });

        // Add the button to the panel
        panel.add(addButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
