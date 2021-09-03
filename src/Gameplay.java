import javax.swing.JPanel ;
import java.awt.Color ;
import java.awt.Graphics ;
import java.awt.Rectangle ;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
import java.awt.event.KeyEvent ;
import java.awt.event.KeyListener ;
import javax.swing.Timer ;
import java.awt.Graphics2D;
import java.awt.Font ;
import java.awt.Toolkit ;
import java.awt.Image ;


public class Gameplay extends JPanel implements KeyListener, ActionListener {
        private boolean play = false ;
        private int score = 0 ;
        private int high_scores = 0 ;
        private int totalBricks = 21 ;
        private Timer timer ;
        private int delay = 8 ;
        private int playerX = 310 ;
        private int ballposX = 380 ;
        private int ballposY = 410 ;
        private int ballXdir = -1 ;
        private int ballYdir = -2 ;
        private Map map ;
        private Sound Sound_background, Sound_hit ;

        public Gameplay() {
              map = new Map(3,7) ;
              addKeyListener(this);
              setFocusable(true) ;
              setFocusTraversalKeysEnabled(false);
              timer = new Timer(delay, this);
              Sound_background = new Sound("data/Sound_bg.wav");
              Sound_background.play();
              timer.start();
        }

        public void paint(Graphics g) {
              Toolkit toolkit = Toolkit.getDefaultToolkit() ;
              // Background
              Image background = toolkit.getImage("data/BG.png");
              g.drawImage(background,0,0,this) ;

              //drawing Map
              map.draw((Graphics2D)g) ;

              //boader
              g.setColor(Color.BLACK);
              g.fillRect(0, 0, 3, 692) ;
              g.fillRect(0, 0, 792, 3) ;
              g.fillRect(780, 0, 3, 692) ;

              //high scores
              Image trophy = toolkit.getImage("data/trophy.png");
              g.drawImage(trophy,365,12,70,60,this) ;

              Image highscore = toolkit.getImage("data/highscore.png");
              g.drawImage(highscore,440,2,this) ;
              if (high_scores == 0){
                Image high_score0 = toolkit.getImage("data/highscore_0.png");
                g.drawImage(high_score0,700,31,this) ;
              }
              if (high_scores == 5){
                Image high_score5 = toolkit.getImage("data/highscore_5.png");
                g.drawImage(high_score5,700,31,this) ;
              }
              if (high_scores == 10){
                Image high_score10 = toolkit.getImage("data/highscore_10.png");
                g.drawImage(high_score10,700,31,this) ;
              }
              if (high_scores == 15){
                Image high_score15 = toolkit.getImage("data/highscore_15.png");
                g.drawImage(high_score15,700,31,this) ;
              }
              if (high_scores == 20){
                Image high_score20 = toolkit.getImage("data/highscore_20.png");
                g.drawImage(high_score20,700,31,this) ;
              }
              if (high_scores == 25){
                Image high_score25 = toolkit.getImage("data/highscore_25.png");
                g.drawImage(high_score25,700,31,this) ;
              }
              if (high_scores == 30){
                Image high_score30 = toolkit.getImage("data/highscore_30.png");
                g.drawImage(high_score30,700,31,this) ;
              }
              if (high_scores == 35){
                Image high_score35 = toolkit.getImage("data/highscore_35.png");
                g.drawImage(high_score35,700,31,this) ;
              }
              if (high_scores == 40){
                Image high_score40 = toolkit.getImage("data/highscore_40.png");
                g.drawImage(high_score40,700,31,this) ;
              }
              if (high_scores == 45){
                Image high_score45 = toolkit.getImage("data/highscore_45.png");
                g.drawImage(high_score45,700,31,this) ;
              }
              if (high_scores == 50){
                Image high_score50 = toolkit.getImage("data/highscore_50.png");
                g.drawImage(high_score50,700,31,this) ;
              }
              if (high_scores == 55){
                Image high_score55 = toolkit.getImage("data/highscore_55.png");
                g.drawImage(high_score55,700,31,this) ;
              }
              if (high_scores == 60){
                Image high_score60 = toolkit.getImage("data/highscore_60.png");
                g.drawImage(high_score60,700,31,this) ;
              }
              if (high_scores == 65){
                Image high_score65 = toolkit.getImage("data/highscore_65.png");
                g.drawImage(high_score65,700,31,this) ;
              }
              if (high_scores == 70){
                Image high_score70 = toolkit.getImage("data/highscore_70.png");
                g.drawImage(high_score70,700,31,this) ;
              }
              if (high_scores == 75){
                Image high_score75 = toolkit.getImage("data/highscore_75.png");
                g.drawImage(high_score75,700,31,this) ;
              }
              if (high_scores == 80){
                Image high_score80 = toolkit.getImage("data/highscore_80.png");
                g.drawImage(high_score80,700,31,this) ;
              }
              if (high_scores == 85){
                Image high_score85 = toolkit.getImage("data/highscore_85.png");
                g.drawImage(high_score85,700,31,this) ;
              }
              if (high_scores == 90){
                Image high_score90 = toolkit.getImage("data/highscore_90.png");
                g.drawImage(high_score90,700,31,this) ;
              }
              if (high_scores == 95){
                Image high_score95 = toolkit.getImage("data/highscore_95.png");
                g.drawImage(high_score95,700,31,this) ;
              }
              if (high_scores == 100){
                Image high_score100 = toolkit.getImage("data/highscore_100.png");
                g.drawImage(high_score100,700,31,this) ;
              }
              if (high_scores == 105){
                Image high_score105 = toolkit.getImage("data/highscore_105.png");
                g.drawImage(high_score105,700,31,this) ;
              }

              //scores
              Image scores = toolkit.getImage("data/score.png");
              g.drawImage(scores,10,0,this) ;
              if (score == 0){
                Image score0 = toolkit.getImage("data/0.png");
                g.drawImage(score0,200,31,this) ;
              }
              if (score == 5){
                Image score5 = toolkit.getImage("data/5.png");
                g.drawImage(score5,200,31,this) ;
              }
              if (score == 10){
                Image score10 = toolkit.getImage("data/10.png");
                g.drawImage(score10,203,31,this) ;
              }
              if (score == 15){
                Image score15 = toolkit.getImage("data/15.png");
                g.drawImage(score15,203,31,this) ;
              }
              if (score == 20){
                Image score20 = toolkit.getImage("data/20.png");
                g.drawImage(score20,203,31,this) ;
              }
              if (score == 25){
                Image score25 = toolkit.getImage("data/25.png");
                g.drawImage(score25,203,31,this) ;
              }
              if (score == 30){
                Image score30 = toolkit.getImage("data/30.png");
                g.drawImage(score30,203,31,this) ;
              }
              if (score == 35){
                Image score35 = toolkit.getImage("data/35.png");
                g.drawImage(score35,203,31,this) ;
              }
              if (score == 40){
                Image score40 = toolkit.getImage("data/40.png");
                g.drawImage(score40,203,31,this) ;
              }
              if (score == 45){
                Image score45 = toolkit.getImage("data/45.png");
                g.drawImage(score45,203,31,this) ;
              }
              if (score == 50){
                Image score50 = toolkit.getImage("data/50.png");
                g.drawImage(score50,203,31,this) ;
              }
              if (score == 55){
                Image score55 = toolkit.getImage("data/55.png");
                g.drawImage(score55,203,31,this) ;
              }
              if (score == 60){
                Image score60 = toolkit.getImage("data/60.png");
                g.drawImage(score60,203,31,this) ;
              }
              if (score == 65){
                Image score65 = toolkit.getImage("data/65.png");
                g.drawImage(score65,203,31,this) ;
              }
              if (score == 70){
                Image score70 = toolkit.getImage("data/70.png");
                g.drawImage(score70,203,31,this) ;
              }
              if (score == 75){
                Image score75 = toolkit.getImage("data/75.png");
                g.drawImage(score75,203,31,this) ;
              }
              if (score == 80){
                Image score80 = toolkit.getImage("data/80.png");
                g.drawImage(score80,203,31,this) ;
              }
              if (score == 85){
                Image score85 = toolkit.getImage("data/85.png");
                g.drawImage(score85,203,31,this) ;
              }
              if (score == 90){
                Image score90 = toolkit.getImage("data/90.png");
                g.drawImage(score90,203,31,this) ;
              }
              if (score == 95){
                Image score95 = toolkit.getImage("data/95.png");
                g.drawImage(score95,203,31,this) ;
              }
              if (score == 100){
                Image score100 = toolkit.getImage("data/100.png");
                g.drawImage(score100,210,31,this) ;
              }
              if (score == 105){
                Image score105 = toolkit.getImage("data/105.png");
                g.drawImage(score105,210,31,this) ;
              }

              // Paddle
              Image paddle = toolkit.getImage("data/paddle.png");
              g.drawImage(paddle, playerX, 600, 150, 60, this) ;

              // Ball
              Image ball = toolkit.getImage("data/ball.png");
              g.drawImage(ball, ballposX, ballposY, 50, 35, this) ;

              if (totalBricks <= 0) {
                    play = false ;
                    ballXdir = 0 ;
                    ballYdir = 0 ;
                    Image won = toolkit.getImage("data/won.png");
                    g.drawImage(won, 245, 290, this) ;
                    Image pic_restart2 = toolkit.getImage("data/restart.png");
                    g.drawImage(pic_restart2, 200, 330, this) ;
                }

              if (ballposY > 672) {
                  if(score > high_scores) {
                      high_scores = score ;
                  }
                  play = false ;
                  ballXdir = 0 ;
                  ballYdir = 0 ;
                  Sound_background.stop();
                  Image pic_gameover = toolkit.getImage("data/gameover.png");
                  g.drawImage(pic_gameover, 250, 280, this) ;
                  Image pic_restart1 = toolkit.getImage("data/restart.png");
                  g.drawImage(pic_restart1, 200, 320, this) ;
              }
            g.dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
              timer.start();
              if(play) {
                  if(new Rectangle(ballposX, ballposY, 50, 35).intersects(new Rectangle(playerX, 610, 150, 60)) ) {
                        ballYdir = -ballYdir ;
                  }
                  for (int i = 0; i<map.map.length; i++) {
                      for (int j = 0; j<map.map[0].length; j++) {
                          if (map.map[i][j] > 0) {
                                int brickX = j * map.brickWidth + 80 ;
                                int brickY = i * map.brickHight + 70 ;
                                int brickWidth = map.brickWidth ;
                                int brickHight = map.brickHight ;
                                Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHight) ;
                                Rectangle ballRect = new Rectangle(ballposX, ballposY, 50, 35) ;
                                Rectangle brickRect = rect ;

                          if (ballRect.intersects(brickRect)) {
                                Sound_hit = new Sound("data/hit.wav");
                                Sound_hit.play();
                                map.setBrickValue(0, i, j) ;
                                totalBricks-- ;
                                score += 5;
                                if(ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
                                    ballXdir = -ballXdir ;
                                }
                                else {
                                    ballYdir = -ballYdir ;
                                }
                          break ;
                        }
                        }
                    }
                }
                ballposX += ballXdir ;
                ballposY += ballYdir ;
                if (ballposX < 0) {
                    ballXdir = -ballXdir ;
                }
                if (ballposY < 0) {
                    ballYdir = -ballYdir ;
                }
                if (ballposX > 749) {
                    ballXdir = -ballXdir ;
                }
            }
        repaint();
      }

      @Override
        public void keyPressed(KeyEvent e) {
              if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (playerX >= 650) {
                        playerX = 650 ;
                    }
                    else {
                        moveRight();
                    }
              }

              if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (playerX < 10) {
                        playerX = 10 ;
                    }
                    else {
                        moveLeft();
                    }
              }

              if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if(!play) {
                        play = true ;
                        ballposX = 380 ;
                        ballposY = 410 ;
                        ballXdir = -1 ;
                        ballYdir = -2 ;
                        playerX = 310 ;
                        score = 0 ;
                        totalBricks = 21 ;
                        map = new Map(3, 7) ;
                        Sound_background.play();
                        repaint();
                    }
            }
      }
        public void moveRight() {
            play = true ;
            playerX +=20 ;
        }
        public void moveLeft() {
            play = true ;
            playerX -=20 ;
        }

        @Override
        public void keyReleased(KeyEvent e) {}
        @Override
        public void keyTyped(KeyEvent e) {}

}
