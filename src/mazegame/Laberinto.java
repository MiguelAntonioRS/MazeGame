package mazegame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Miguel Antonio
 */
public class Laberinto {
    int[][]lab= new int[13][23];
    int fila = 0;
    int columna = 0;
    int numeroFilas = 13;
    int numeroColumnas = 23;
    int anchoBloque = 40;
    int altoBloque = 40;
    
    public void paint(Graphics grafico){
            int [][] laberinto = obtieneLaberinto();
        
            for(fila = 0;fila<numeroFilas;fila++){
                for(columna = 0;columna<numeroColumnas;columna++){
                    if(laberinto[fila][columna]==1){
                    if(MazeGame.obtieneNivel()==1){grafico.setColor(Color.DARK_GRAY);}
                    if(MazeGame.obtieneNivel()==2){grafico.setColor(Color.GREEN);}
                    if(MazeGame.obtieneNivel()>=3){grafico.setColor(Color.BLUE);}
                
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
            }
        }
        grafico.drawString("Inicio", 5, 62);
        grafico.drawString("Fin", 850, 462);
    }
    
    public int[][] obtieneLaberinto(){
        
        if(MazeGame.obtieneNivel()==1){
            int laberinto[][]=
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1},
                {1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1},
                {1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,1},
                {1,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,1},
                {1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1},
                {1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1},
                {1,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1},
                {1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1},
                {1,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1},
                {1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1},
                {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab =laberinto;
        }
        if(MazeGame.obtieneNivel()==2){
            int laberinto[][]=
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                {1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1},
                {1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
                {1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1},
                {1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,1},
                {1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1},
                {1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
                {1,1,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1},
                {1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,1},
                {1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1},
                {1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab =laberinto;
        }
        if(MazeGame.obtieneNivel()==3){
            int laberinto[][]=
            {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
                    {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                    {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
                    {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                    {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,1},
                    {1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1},
                    {1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab =laberinto;
        }
        
        return lab;
    }
}
