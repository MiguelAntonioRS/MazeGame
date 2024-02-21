package mazegame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.logging.Logger;

/**
 *
 * @author Miguel Antonio
 * hola
 */ 
public class MazeGame extends JPanel {

    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();
    public static int nivel = 1;

    public MazeGame() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setFocusable(true);
    }

    @Override
    public void paint(Graphics grafico) {
        laberinto.paint(grafico);
        personaje.paint(grafico);
    }

    public static int cambiaNivel() {
        return nivel++;
    }
    
    public static int obtieneNivel(){
        return nivel;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Estas listo?");
        JFrame miVentana = new JFrame("Maze Game");
        MazeGame game = new MazeGame();
        miVentana.add(game);
        miVentana.setSize(920, 540);
        miVentana.setLocation(300, 200);
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Logger.getLogger(MazeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }
            miVentana.repaint();
            
            if(obtieneNivel()>3){
                JOptionPane.showMessageDialog(null, "Ganaste!!!");
                System.exit(0);
            }
        }
    }
}
