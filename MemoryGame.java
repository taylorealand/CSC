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
   private JPanel scorePanel, gamePanel, scorePanel, timerstartPanel;
   public MemoryGame()
   {
      super("Memory Game");
      contents=getContentPane();
      contents.setLayout(new BorderLayout());
      JButton Start = new JButton("Start");
      
   }

}
