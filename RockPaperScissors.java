package GUI;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class gui implements  ActionListener{
    int redScoreAmount = 0;
    int blueScoreAmount = 0;
    int greenScoreAmount = 0;

    JPanel titlePanel, scorePanel, buttonPanel;
    JLabel redLabel, blueLabel, greenLabel, redScore, blueScore, greenScore, results;
    JButton redButton, greenButton, resetButton, blueButton, playButton, nextButton;
    
    Random rand = new Random();
    int n = rand.nextInt(3) + 1;
    int pressCheck = 0;
    int setChoice = 0;
    int buttonCheck = 0;
    int resetCheck = 0;

    public JPanel createContentPane (){
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(410, 60);
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
        greenScore.setLocation(130, 0);
        greenScore.setSize(120, 30);
        greenScore.setHorizontalAlignment(0);
        scorePanel.add(greenScore);

        blueScore = new JLabel(""+blueScoreAmount);
        blueScore.setLocation(260, 0);
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
        redButton.setBackground(Color.WHITE);
        buttonPanel.add(redButton);
        
        greenButton = new JButton("Paper");
        greenButton.setLocation(130, 0);
        greenButton.setSize(120, 30);
        greenButton.addActionListener(this);
        greenButton.setBackground(Color.WHITE);
        buttonPanel.add(greenButton);

        blueButton = new JButton("Scissors");
        blueButton.setLocation(259, 0);
        blueButton.setSize(120, 30);
        blueButton.addActionListener(this);
        blueButton.setBackground(Color.WHITE);
        buttonPanel.add(blueButton);

        resetButton = new JButton("Reset Score");
        resetButton.setLocation(0, 40);
        resetButton.setSize(120, 30);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);
        
        playButton = new JButton("play");
        playButton.setLocation(260, 40);
        playButton.setSize(120, 30);
        playButton.addActionListener(this);
        buttonPanel.add(playButton);
        
        nextButton = new JButton("next");
        nextButton.setLocation(130,40);
        nextButton.setSize(120,30);
        nextButton.addActionListener(this);
        buttonPanel.add(nextButton);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == redButton && pressCheck == 0)
        {
            redButton.setBackground(Color.GREEN);
            pressCheck = pressCheck + 1;
            setChoice = 1;
        }
        else if(e.getSource() == blueButton && pressCheck == 0)
        {
            blueButton.setBackground(Color.GREEN);
            pressCheck = pressCheck + 1;
            setChoice = 2;
        }
        else if(e.getSource() == greenButton && pressCheck == 0)
        {
        	greenButton.setBackground(Color.GREEN);
            pressCheck = pressCheck + 1;
            setChoice = 3;
        }
        else if(e.getSource() == resetButton && resetCheck == 0)
        {
        	resetCheck = 1;
        	blueButton.setBackground(Color.WHITE);
        	greenButton.setBackground(Color.WHITE);
        	redButton.setBackground(Color.WHITE);
            System.out.println("Your final score is "+redScoreAmount);
            System.out.println("The enemy's final score is "+blueScoreAmount);
            if (redScoreAmount > blueScoreAmount) 
            {
            	System.out.println("You won!");
            } else if (redScoreAmount < blueScoreAmount) 
            {
            	System.out.println("You lost!");
            } else if (redScoreAmount == blueScoreAmount) 
            {
            	System.out.println("You tied!");
            }
        	setChoice = 0;
        	pressCheck = 0;
        	buttonCheck = 0;
        	redScoreAmount = 0;
            blueScoreAmount = 0;
            greenScoreAmount = 0;
            redScore.setText(""+redScoreAmount);
            blueScore.setText(""+blueScoreAmount);
            greenScore.setText(""+greenScoreAmount);
        }
        else if(e.getSource() == playButton && buttonCheck == 0) 
        {
            int n = rand.nextInt(3) + 1;
          
        	if (n == 1) 
        	{
        		redButton.setBackground(Color.RED);
        	} else if (n == 2) 
        	{
        		blueButton.setBackground(Color.RED);
        	} else if (n == 3) 
        	{
        		greenButton.setBackground(Color.RED);
        	}
        	if (n == 1 && setChoice == 2) 
        	{
        		blueScoreAmount = blueScoreAmount + 1;
                blueScore.setText(""+blueScoreAmount);
        	} else if (n == 2 && setChoice == 3) 
        	{
        		blueScoreAmount = blueScoreAmount + 1;
                blueScore.setText(""+blueScoreAmount);
        	} else if (n == 3 && setChoice == 1) 
        	{
        		blueScoreAmount = blueScoreAmount + 1;
                blueScore.setText(""+blueScoreAmount);
        	}
        	if (setChoice == 1 && n == 2) 
        	{
        		redScoreAmount = redScoreAmount + 1;
                redScore.setText(""+redScoreAmount);
        	} else if (setChoice == 2 && n == 3) 
        	{
        		redScoreAmount = redScoreAmount + 1;
                redScore.setText(""+redScoreAmount);
        	} else if (setChoice == 3 && n == 1) 
        	{
        		redScoreAmount = redScoreAmount + 1;
                redScore.setText(""+redScoreAmount);
        	} else if (n == setChoice) 
        	{
        		System.out.println("Tie!");
        	}
        	buttonCheck = 1;
        }
        if (e.getSource() == nextButton) 
        {
        	blueButton.setBackground(Color.WHITE);
        	greenButton.setBackground(Color.WHITE);
        	redButton.setBackground(Color.WHITE);
        	setChoice = 0;
        	pressCheck = 0;
        	buttonCheck = 0;
        }
    }


    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JButton Scores! [=]");
        gui demo = new gui();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(410, 200);
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
