 import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Graphics2D;
    import java.awt.Image;
    import java.awt.RenderingHints;
    import java.awt.event.KeyEvent;
    import java.awt.event.KeyListener;
 import javax.swing.JPanel;
 @SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, KeyListener {
public static int width = 300;
public static int height = 400;
private Thread thread;
private Image image;
private Graphics2D g;

private Food food;
private Snake snake;

public GamePanel() {
    setPreferredSize(new Dimension(width, height));
    setFocusable(true);
}

public void addNotify() {
    super.addNotify();
    if (thread == null) {
        thread = new Thread(this);
        thread.start();
    }
    addKeyListener(this);
}

public void run() {
    image = createImage(width, height);
    g = (Graphics2D) image.getGraphics();
    RenderingHints reneringHints = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
    g.setRenderingHints(reneringHints);

    food = new Food();
    snake = new Snake();
    while (true) {
        gameRender();
        gameUpdate();
        gameDraw();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

private void gameDraw() {
    Graphics2D g2 = (Graphics2D) getGraphics();
    g2.drawImage(image, 0, 0, this);
    g2.dispose();
}

private void gameRender() {
    g.setColor(Color.black);
    g.fillRect(0, 0, width, height);
    food.draw(g);
    snake.draw(g);
}

private void gameUpdate() {
    food.update();
    snake.update();
}

public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT) {
          snake.setLeft(true);
    }
    if (key == KeyEvent.VK_RIGHT) {
        snake.setRight(true);
    }
    if (key == KeyEvent.VK_UP) {
        snake.setUp(true);
    }
    if (key == KeyEvent.VK_DOWN) {
        snake.setDown(true);
    }
}

public void keyReleased(KeyEvent e) {
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_LEFT) {
          snake.setLeft(false);
    }
    if (key == KeyEvent.VK_RIGHT) {
        snake.setRight(false);
    }
    if (key == KeyEvent.VK_UP) {
        snake.setUp(false);
    }
    if (key == KeyEvent.VK_DOWN) {
        snake.setDown(false);
    }
}

public void keyTyped(KeyEvent e) {
}

  }