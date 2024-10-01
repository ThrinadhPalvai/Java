import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo {

    public static void main(String[] args) {
        
        // Create a new JFrame with a title
        JFrame frame = new JFrame("FlowLayout Example");
        
        // Set the layout manager for the content pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        frame.setContentPane(contentPane);
        
        // Add buttons to the content pane
        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("Button 2"));
        contentPane.add(new JButton("Button 3"));
        contentPane.add(new JButton("Button 4"));
        contentPane.add(new JButton("Button 5"));
        contentPane.add(new JButton("Button 6"));
        
        // Set the size of the frame and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
