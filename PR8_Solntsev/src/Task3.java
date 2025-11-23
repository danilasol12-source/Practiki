import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {

    public Task3(String imagePath) {
        setTitle("Картинка");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);
        if (imageIcon.getIconWidth() == -1) {
            imageLabel.setText("Cannot load image: " + imagePath);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }

        add(new JScrollPane(imageLabel));
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ImageDisplay <image_path>");
            return;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Task3(args[0]).setVisible(true);
            }
        });
    }
}
