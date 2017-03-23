//Memory game project
//Taylor E, Ashleigh M, Phil V.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MemoryGame extends JFrame
{
   private Container contents;
   private JLabel Level, Score, Timer;
   private JButton Start;
   private JPanel scorePanel, gamePanel, levelPanel, timerstartPanel;
   public MemoryGame()
   {
      super("Memory Game");
      contents=getContentPane();
      contents.setLayout(new BorderLayout());
      JButton Start = new JButton("Start");
      JLabel Timer = new JLabel("Placeholder");
      JPanel timerstartPanel = new JPanel(new GridLayout(2,1));
      timerstartPanel.add(Timer);
      timerstartPanel.add(Start);
      JLabel level=new JLabel("Level: PLACEHOLDER");
      JPanel levelPanel = new JPanel();
      levelPanel.add(level);
      JLabel score = new JLabel("Score: PLACEHOLDER");
      JPanel scorePanel=new JPanel();
      scorePanel.add(score);
      
      contents.add(scorePanel,BorderLayout.SOUTH);
      contents.add(levelPanel,BorderLayout.NORTH);
      contents.add(timerstartPanel,BorderLayout.EAST);
      setSize(450,150);
      setVisible(true);
      
   }
   
   public static void main(String[]args)
   {
      MemoryGame sm=new MemoryGame();
      sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
