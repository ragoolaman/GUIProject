package GUI;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 implements  ActionListener{
    int redScoreAmount = 0;
    int blueScoreAmount = 0;
    int greenScoreAmount = 0;

    JPanel titlePanel, scorePanel, buttonPanel;
    JLabel redLabel, blueLabel, greenLabel, redScore, blueScore, greenScore;
    JButton redButton, greenButton, resetButton, blueButton, playButton;

    public JPanel createContentPane (){
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(400, 60);
        totalGUI.add(titlePanel);

       
        redLabel = new JLabel("player score");
        redLabel.setLocation(0, 0);
        redLabel.setSize(120, 30);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);
        
        greenLabel = new JLabel("enemy score");
        greenLabel.setLocation(259, 0);
        greenLabel.setSize(120, 30);
        greenLabel.setHorizontalAlignment(0);
        greenLabel.setForeground(Color.green);
        titlePanel.add(greenLabel);

        scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(10, 40);
        scorePanel.setSize(500, 60);
        totalGUI.add(scorePanel);

        redScore = new JLabel(""+redScoreAmount);
        redScore.setLocation(0, 0);
        redScore.setSize(120, 30);
        redScore.setHorizontalAlignment(0);
        scorePanel.add(redScore);
        
        greenScore = new JLabel(""+redScoreAmount);
        greenScore.setLocation(300, 0);
        greenScore.setSize(120, 30);
        greenScore.setHorizontalAlignment(0);
        scorePanel.add(greenScore);

        blueScore = new JLabel(""+blueScoreAmount);
        blueScore.setLocation(130, 0);
        blueScore.setSize(120, 30);
        blueScore.setHorizontalAlignment(0);
        scorePanel.add(blueScore);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(500, 70);
        totalGUI.add(buttonPanel);
        
        redButton = new JButton("Rock");
        redButton.setLocation(0, 0);
        redButton.setSize(120, 30);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);
        
        greenButton = new JButton("Paper");
        greenButton.setLocation(130, 0);
        greenButton.setSize(120, 30);
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        blueButton = new JButton("Scissors");
        blueButton.setLocation(259, 0);
        blueButton.setSize(120, 30);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        resetButton = new JButton("Reset Score");
        resetButton.setLocation(0, 40);
        resetButton.setSize(250, 30);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);
        
        playButton = new JButton("play");
        playButton.setLocation(260, 40);
        playButton.setSize(120, 30);
        playButton.addActionListener(this);
        buttonPanel.add(playButton);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == redButton)
        {
            redScoreAmount = redScoreAmount + 1;
            redScore.setText(""+redScoreAmount);
        }
        else if(e.getSource() == blueButton)
        {
            blueScoreAmount = blueScoreAmount + 1;
            blueScore.setText(""+blueScoreAmount);
        }
        else if(e.getSource() == greenButton)
        {
            greenScoreAmount = greenScoreAmount + 1;
            greenScore.setText(""+greenScoreAmount);
        }
        else if(e.getSource() == resetButton)
        {
            redScoreAmount = 0;
            blueScoreAmount = 0;
            greenScoreAmount = 0;
            redScore.setText(""+redScoreAmount);
            blueScore.setText(""+blueScoreAmount);
            greenScore.setText(""+greenScoreAmount);
        }
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JButton Scores! [=]");
        Frame2 demo = new Frame2();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
