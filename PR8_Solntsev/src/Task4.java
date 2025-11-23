import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task4 extends JPanel {
    private static int frames = 60;
    private static int delay = 17;
    private int currentFrame = 0;
    private Timer timer;

    public Task4() {
        setPreferredSize(new Dimension(400, 400));

        timer = new Timer(delay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Очистка фона
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Вращение и отрисовка
        double angle = Math.toRadians(currentFrame * 6);
        g2d.rotate(angle, centerX, centerY);

        // Циклическое изменение цвета
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
        g2d.setColor(colors[(currentFrame / 15) % colors.length]);

        // Пульсирующий размер
        int size = 50 + (int)(20 * Math.sin(angle));
        g2d.fillRect(centerX - size/2, centerY - size/2, size, size);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Вращение");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Task4());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}