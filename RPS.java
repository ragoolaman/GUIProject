package GUI;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rps {
    int playerScoreAmount = 0;
    int enemyScoreAmount = 0;
    int playerChoice;
    int enemyChoice;
	
    JPanel titlePanel, scorePanel, buttonPanel;
    JLabel playerLabel, enemyLabel, playerScore, enemyScore;
    JButton rockButton, paperButton, scissorsButton, nextButton;
    
    public JPanel createContentPane (){
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(250, 30);
        totalGUI.add(titlePanel);
        
        playerLabel = new JLabel("player Team");
        playerLabel.setLocation(0, 0);
        playerLabel.setSize(120, 30);
        playerLabel.setHorizontalAlignment(0);
        playerLabel.setForeground(Color.red);
        titlePanel.add(playerLabel);
        
        enemyLabel = new JLabel("enemy Team");
        enemyLabel.setLocation(130, 0);
        enemyLabel.setSize(120, 30);
        enemyLabel.setHorizontalAlignment(0);
        enemyLabel.setForeground(Color.blue);
        titlePanel.add(enemyLabel);
        
        scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(10, 40);
        scorePanel.setSize(260, 30);
        totalGUI.add(scorePanel);
        
        enemyScore = new JLabel(""+enemyScoreAmount);
        enemyScore.setLocation(130, 0);
        enemyScore.setSize(120, 30);
        enemyScore.setHorizontalAlignment(0);
        scorePanel.add(enemyScore);
        
        playerScore = new JLabel(""+playerScoreAmount);
        playerScore.setLocation(0, 0);
        playerScore.setSize(120, 30);
        playerScore.setHorizontalAlignment(0);
        scorePanel.add(playerScore);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(260, 70);
        totalGUI.add(buttonPanel);
        
        rockButton = new JButton("player Score!");
        rockButton.setLocation(0, 0);
        rockButton.setSize(120, 30);
        rockButton.addActionListener((ActionListener)this);
        buttonPanel.add(rockButton);
        
        paperButton = new JButton("player Score!");
        paperButton.setLocation(0, 0);
        paperButton.setSize(120, 30);
        paperButton.addActionListener((ActionListener)this);
        buttonPanel.add(paperButton);
        
        scissorsButton = new JButton("enemy Score!");
        scissorsButton.setLocation(130, 0);
        scissorsButton.setSize(120, 30);
        scissorsButton.addActionListener((ActionListener)this);
        buttonPanel.add(scissorsButton);
        
        nextButton = new JButton("next Score");
        nextButton.setLocation(0, 40);
        nextButton.setSize(250, 30);
        nextButton.addActionListener((ActionListener)this);
        buttonPanel.add(nextButton);
        
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rockButton)
        {
        	playerChoice = 1;
        }
        else if(e.getSource() == paperButton)
        {
        	playerChoice = 2;
        }
        else if(e.getSource() == scissorsButton)
        {
        	playerChoice = 3;
        }
        else if(e.getSource() == nextButton)
        {
            playerChoice = 0;
            enemyChoice = 0;
        }
    }
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame rps = new JFrame("[=] JButton Scores! [=]");
        rps demo = new rps();
        rps.setContentPane(demo.createContentPane());

        rps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rps.setSize(280, 190);
        rps.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
