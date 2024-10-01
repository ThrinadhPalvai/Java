import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel nameLabel = new JLabel("Name:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(nameLabel, constraints);

        JTextField nameTextField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nameTextField, constraints);

        JLabel emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(emailLabel, constraints);

        JTextField emailTextField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(emailTextField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(passwordLabel, constraints);

        JPasswordField passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(passwordField, constraints);

        JLabel genderLabel = new JLabel("Gender:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(genderLabel, constraints);

        ButtonGroup genderButtonGroup = new ButtonGroup();
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        JRadioButton otherRadioButton = new JRadioButton("Other");
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        genderButtonGroup.add(otherRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        genderPanel.add(otherRadioButton);
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(genderPanel, constraints);

        JLabel countryLabel = new JLabel("Country:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(countryLabel, constraints);

        String[] countries = {"Select a country", "India", "USA", "UK", "Australia", "Canada"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(countryComboBox, constraints);

        JButton registerButton = new JButton("Register");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(registerButton, constraints);

        frame.add(panel);
        frame.setVisible(true);
    }
}
