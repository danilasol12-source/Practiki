import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Task4 extends JFrame {
    private JTextField display;
    private JList<String> historyList;
    private DefaultListModel<String> historyModel;
    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;
    private List<String> history;

    public Task4() {
        super("Умный Калькулятор");
        history = new ArrayList<>();
        initializeUI();
    }

    private void initializeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(500, 400);
        setLocationRelativeTo(null);

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        add(display, BorderLayout.NORTH);


        JPanel mainPanel = new JPanel(new BorderLayout());


        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "CE", "^", "√"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }


        JPanel historyPanel = new JPanel(new BorderLayout());
        historyPanel.setBorder(BorderFactory.createTitledBorder("История операций"));
        historyPanel.setPreferredSize(new Dimension(200, 0));

        historyModel = new DefaultListModel<>();
        historyList = new JList<>(historyModel);
        historyList.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(historyList);
        historyPanel.add(scrollPane, BorderLayout.CENTER);


        JButton clearHistoryButton = new JButton("Очистить историю");
        clearHistoryButton.addActionListener(e -> clearHistory());
        historyPanel.add(clearHistoryButton, BorderLayout.SOUTH);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(historyPanel, BorderLayout.EAST);

        add(mainPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                handleNumberInput(command);
            } else if (command.equals("C")) {
                clearAll();
            } else if (command.equals("CE")) {
                clearEntry();
            } else if (command.equals("=")) {
                calculateResult();
            } else if (command.equals("x^y")) {
                setOperator("^");
            } else if (command.equals("√")) {
                calculateSquareRoot();
            } else {
                setOperator(command);
            }
        }
    }

    private void handleNumberInput(String number) {
        if (startNewNumber) {
            display.setText(number.equals(".") ? "0." : number);
            startNewNumber = false;
        } else {
            if (number.equals(".") && display.getText().contains(".")) {
                return; // Не добавляем вторую точку
            }
            display.setText(display.getText() + number);
        }
    }

    private void setOperator(String newOperator) {
        if (!operator.isEmpty() && !startNewNumber) {
            calculateResult();
        }
        firstNumber = Double.parseDouble(display.getText());
        operator = newOperator;
        startNewNumber = true;
    }

    private void calculateResult() {
        if (operator.isEmpty()) return;

        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;
        String operation = "";

        try {
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    operation = firstNumber + " + " + secondNumber + " = " + result;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    operation = firstNumber + " - " + secondNumber + " = " + result;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    operation = firstNumber + " * " + secondNumber + " = " + result;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        display.setText("Ошибка: деление на 0");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    operation = firstNumber + " / " + secondNumber + " = " + result;
                    break;
                case "^":
                    result = Math.pow(firstNumber, secondNumber);
                    operation = firstNumber + " ^ " + secondNumber + " = " + result;
                    break;
            }

            display.setText(formatResult(result));
            addToHistory(operation);

        } catch (Exception ex) {
            display.setText("Ошибка");
        }

        operator = "";
        startNewNumber = true;
    }

    private void calculateSquareRoot() {
        double number = Double.parseDouble(display.getText());
        if (number < 0) {
            display.setText("Ошибка: корень из отрицательного числа");
            return;
        }
        double result = Math.sqrt(number);
        display.setText(formatResult(result));
        addToHistory("√" + number + " = " + result);
        startNewNumber = true;
    }

    private String formatResult(double result) {
        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%s", result);
        }
    }

    private void clearAll() {
        display.setText("0");
        firstNumber = 0;
        operator = "";
        startNewNumber = true;
    }

    private void clearEntry() {
        display.setText("0");
        startNewNumber = true;
    }

    private void addToHistory(String operation) {
        history.add(operation);
        historyModel.addElement(operation);

        int lastIndex = historyModel.size() - 1;
        if (lastIndex >= 0) {
            historyList.ensureIndexIsVisible(lastIndex);
        }
    }

    private void clearHistory() {
        historyModel.clear();
        history.clear();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
                    Task4 calculator = new Task4();
                    calculator.setVisible(true);


        });
    }
}
