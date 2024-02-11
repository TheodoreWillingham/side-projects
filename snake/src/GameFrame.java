import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Theo's Slither Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); // makes the frame appear in the middle of the screen
    }
}
