import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3 extends JFrame {
    private JTextArea textArea;
    private JButton boldButton, italicButton;

    public Task3() {
        super("JaWord");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);


        boldButton = new JButton("Жирный");
        italicButton = new JButton("Курсив");


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(boldButton);
        buttonPanel.add(italicButton);


        createMenu();


        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);


        setupButtonListeners();
    }

    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("Файл");

        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");

        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);


        JMenu editMenu = new JMenu("Правка");

        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);


        JMenu helpMenu = new JMenu("Справка");
        JMenuItem aboutItem = new JMenuItem("О программе");
        helpMenu.add(aboutItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);


        setupMenuListeners(saveItem, exitItem, copyItem, cutItem, pasteItem, aboutItem);
    }

    private void setupMenuListeners(JMenuItem save, JMenuItem exit, JMenuItem copy,
                                    JMenuItem cut, JMenuItem paste, JMenuItem about) {

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Task3.this,
                        "Функция сохранения", "Сохранение",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });


        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(Task3.this,
                        "Вы уверены, что хотите выйти?", "Выход",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });


        copy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });


        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });


        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        // О программе
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Task3.this,
                        "Программа с меню\nПрактическая работа №10",
                        "О программе", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void setupButtonListeners() {
        // Кнопка "Жирный"
        boldButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font currentFont = textArea.getFont();
                int newStyle = currentFont.getStyle() ^ Font.BOLD; // Переключаем жирный стиль
                textArea.setFont(new Font(currentFont.getFamily(), newStyle, currentFont.getSize()));
            }
        });


        italicButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font currentFont = textArea.getFont();
                int newStyle = currentFont.getStyle() ^ Font.ITALIC; // Переключаем курсив
                textArea.setFont(new Font(currentFont.getFamily(), newStyle, currentFont.getSize()));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task3().setVisible(true);
            }
        });
    }
}