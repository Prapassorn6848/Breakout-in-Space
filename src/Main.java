import javax.swing.* ;
import java.awt.* ;

public class Main {
      public static void main(String[] args) {
            JFrame window = new JFrame();
            Gameplay gameplay = new Gameplay();
            window.setBounds(600, 100, 800, 700);
            window.setTitle("Breakout In Space");
            window.setResizable(false);
            window.setVisible(true);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.add(gameplay);
      }
}
