package mazegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author Miguel Antonio
 */
public class Personaje {
    Laberinto lab = new Laberinto();
    int x = 40;
    int y = 40;
    int ancho = 40;
    int alto = 40;
    int movimiento = 40;
    
    public void paint(Graphics grafico){
        grafico.setColor(Color.RED);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.BLACK);
        grafico.drawOval(x, y, ancho, alto);
        
        grafico.setColor(Color.WHITE);
        grafico.fillOval(x+7, y+8, 13, 13);
        grafico.fillOval(x+21, y+8, 13, 13);
        grafico.setColor(Color.BLACK);
        grafico.fillOval(x+11, y+12, 5, 5);
        grafico.fillOval(x+25, y+12, 5, 5);
        
        grafico.setColor(Color.BLACK);
        grafico.drawOval(x+7, y+24, 27, 7);
    }
    
    public void teclaPresionada(KeyEvent evento){
        int[][]laberinto = lab.obtieneLaberinto();
        
        if(evento.getKeyCode()==37){
            if(laberinto[y/40][(x/40)-1]!=1){
                x = x - movimiento;
            }
        }
        if(evento.getKeyCode()==39){
            if(laberinto[y/40][(x/40)+1]!=1){
                x = x + movimiento;
            }
        }
        if(evento.getKeyCode()==40){
            if(laberinto[(y/40)+1][x/40]!=1){
                y = y + movimiento;
            }
        }
        if(evento.getKeyCode()==38){
            if(laberinto[(y/40)-1][x/40]!=1){
                y = y - movimiento;
            }
        }
        //Si llega al final
        if(x==840 && y==440){
            MazeGame.cambiaNivel();
            x = 40;
            y = 40;
        }
    }
}
