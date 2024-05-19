import java.awt.*;
import java.awt.event.*;

public class Calculator {

    public static void main(String[] args) {
        new AWTCalc();
    }
}

class AWTCalc implements ActionListener {

    Frame fr = new Frame("Richard and Jesmyr's Calculator");
    Label l1 = new Label("FIRST NUMBER");
    Label l2 = new Label("SECOND NUMBER");
    Label l3 = new Label("RESULT");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    Button b6 = new Button("ADD +");
    Button b2 = new Button("SUB -");
    Button b3 = new Button("MULTI *");
    Button b4 = new Button("DIVIDE ÷");
    Button b5 = new Button("CLOSE X");

    AWTCalc() {
        // Set font for labels and buttons
        Font font = new Font("Arial", Font.BOLD, 14);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        b6.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        b5.setFont(font);

        // Set bounds for labels
        l1.setBounds(50, 100, 150, 20);
        l2.setBounds(50, 140, 150, 20);
        l3.setBounds(50, 180, 150, 20);

        // Set bounds for text fields
        t1.setBounds(220, 100, 150, 20);
        t2.setBounds(220, 140, 150, 20);
        t3.setBounds(220, 180, 150, 20);

        // Set bounds for buttons
        b6.setBounds(50, 250, 70, 30);
        b2.setBounds(130, 250, 70, 30);
        b3.setBounds(210, 250, 70, 30);
        b4.setBounds(290, 250, 70, 30);
        b5.setBounds(370, 250, 70, 30);

        // Add components to frame
        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(t1);
        fr.add(t2);
        fr.add(t3);
        fr.add(b6);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
        fr.add(b5);

        // Add action listeners to buttons
        b6.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        // Set frame properties
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(500, 350);
        fr.setLocation(500, 200);
        fr.setBackground(Color.LIGHT_GRAY);

        // Add window closing functionality
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());

            if (e.getSource() == b2) {
                t3.setText(String.valueOf(n1 - n2));
            }

            if (e.getSource() == b3) {
                t3.setText(String.valueOf(n1 * n2));
            }

            if (e.getSource() == b4) {
                t3.setText(String.valueOf(n1 / n2));
            }

            if (e.getSource() == b6) {
                t3.setText(String.valueOf(n1 + n2));
            }

            if (e.getSource() == b5) {
                System.exit(0);
            }
        } catch (NumberFormatException ex) {
            t3.setText("Syntax Error");
        }
    }
}
  