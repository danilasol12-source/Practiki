import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task2 extends JFrame {
    private JComboBox<String> countryComboBox;
    private JTextArea infoTextArea;


    private String[] countries = {
            "Выберите страну",
            "Россия",
            "США",
            "Германия",
            "Япония",
            "Бразилия"
    };

    private String[] countryInfo = {
            "",
            "Столица: Москва\nНаселение: ~146 млн\nЯзык: русский",
            "Столица: Вашингтон\nНаселение: ~331 млн\nЯзык: английский",
            "Столица: Берлин\nНаселение: ~83 млн\nЯзык: немецкий",
            "Столица: Токио\nНаселение: ~126 млн\nЯзык: японский",
            "Столица: Бразилия\nНаселение: ~214 млн\nЯзык: португальский"
    };

    public Task2() {
        super("Информация о странах");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);


        JLabel label = new JLabel("Выберите страну:");
        countryComboBox = new JComboBox<>(countries);
        infoTextArea = new JTextArea(10, 30);
        infoTextArea.setEditable(false);


        JScrollPane scrollPane = new JScrollPane(infoTextArea);


        setLayout(new BorderLayout(10, 10));


        JPanel topPanel = new JPanel();
        topPanel.add(label);
        topPanel.add(countryComboBox);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = countryComboBox.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < countryInfo.length) {
                    infoTextArea.setText(countryInfo[selectedIndex]);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Task2().setVisible(true);
            }
        });
    }
}
