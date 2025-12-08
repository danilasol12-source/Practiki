import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task1 extends JFrame {
    private JTextField jta1 = new JTextField(10);
    private JTextField jta2 = new JTextField(10);
    private JButton addButton = new JButton("Сложить");
    private JButton subtractButton = new JButton("Вычесть");
    private JButton multiplyButton = new JButton("Умножить");
    private JButton divideButton = new JButton("Делить");

    public Task1() {
        super("Калькулятор");
        setLayout(new GridLayout(4, 1, 5, 5)); // 4 строки, 1 столбец, отступы 5px
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("1-е число:"));
        panel1.add(jta1);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("2-е число:"));
        panel2.add(jta2);

        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(addButton);
        panel3.add(subtractButton);

        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(multiplyButton);
        panel4.add(divideButton);



        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('/');
            }
        });

        setVisible(true);
    }

    private void calculate(char operation) {
        try {
            double x1 = Double.parseDouble(jta1.getText().trim());
            double x2 = Double.parseDouble(jta2.getText().trim());
            double result = 0;
            String operationSymbol = "";

            switch(operation) {
                case '+':
                    result = x1 + x2;
                    operationSymbol = "+";
                    break;
                case '-':
                    result = x1 - x2;
                    operationSymbol = "-";
                    break;
                case '*':
                    result = x1 * x2;
                    operationSymbol = "*";
                    break;
                case '/':
                    if(x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Ошибка: деление на ноль!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = x1 / x2;
                    operationSymbol = "/";
                    break;
            }

            String message = String.format("Result = %.1f", result);
            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.INFORMATION_MESSAGE);

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка в числах!", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Task1();
    }
}