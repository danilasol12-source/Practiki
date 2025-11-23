import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Task1() {
        setTitle("Football Match Result");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        lastScorerLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        winnerLabel.setFont(new Font("Arial", Font.BOLD, 14));

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResult("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResult("Real Madrid");
            }
        });




        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);

        JPanel labelPanel = new JPanel(new GridLayout(3, 1));
        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        add(buttonPanel, BorderLayout.NORTH);
        add(labelPanel, BorderLayout.CENTER);
    }

    private void updateResult(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { public void run() {new Task1().setVisible(true);}});
    }
}
