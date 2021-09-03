import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Toolkit ;
import java.awt.Image ;

public class Map {
      public int map[][];
      public int brickWidth ;
      public  int brickHight ;

      public Map(int row, int col) {
          map = new int[row][col] ;
          for(int i = 0; i < map.length; i++) {
              for(int j = 0; j < map[0].length; j++) {
                  map[i][j] = 1;
              }
          }
          brickWidth = 640/col ;
          brickHight = 250/row ;
      }

      public void draw(Graphics2D g) {
          Toolkit toolkit = Toolkit.getDefaultToolkit() ;
          for(int i = 0; i < map.length; i++) {
              for(int j = 0; j < map[0].length; j++) {
                  if(map[i][j] > 0) {
                      Image image = toolkit.getImage("data/monster.gif");
                      g.drawImage(image, j * brickWidth + 80, i * brickHight + 70, brickWidth + 30, brickHight + 50, null) ;
                  }
              }
          }
      }

      public void setBrickValue(int value, int row, int col) {
        map[row][col] = value ;
      }
}
