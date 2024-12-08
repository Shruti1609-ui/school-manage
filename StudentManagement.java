package ui;

import controller.DatabaseConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentManagement {
    public StudentManagement() {
        JFrame frame = new JFrame("Student Management");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10, 50, 80, 25);
        panel.add(ageLabel);

        JTextField ageText = new JTextField(20);
        ageText.setBounds(100, 50, 165, 25);
        panel.add(ageText);

        JLabel gradeLabel = new JLabel("Grade:");
        gradeLabel.setBounds(10, 80, 80, 25);
        panel.add(gradeLabel);

        JTextField gradeText = new JTextField(20);
        gradeText.setBounds(100, 80, 165, 25);
        panel.add(gradeText);

        JButton addButton = new JButton("Add Student");
        addButton.setBounds(10, 110, 150, 25);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                int age = Integer.parseInt(ageText.getText());
                String grade = gradeText.getText();

                addStudent(name, age, grade);
                JOptionPane.showMessageDialog(panel, "Student added successfully!");
            }
        });
    }

    private void addStudent(String name, int age, String grade) {
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, grade);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
