/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author leonel
 */
public class MiPanel extends JPanel{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        //Figuras geometricas
        g.setColor(Color.red);
        g.drawRect(20, 20, 360, 60);
        
        g.setColor(Color.cyan);
        int[] xcoords = {25, 35, 365, 375, 375, 25};
        int[] ycoords = {35, 25, 25, 35, 75, 75};
        g.drawPolygon(xcoords, ycoords, 6);
        g.fillPolygon(xcoords, ycoords, 6);
        
        g.setColor(Color.lightGray);
        g.drawOval(100, 30, 90, 60);
        g.fillOval(100, 30, 90, 60);
        
        //Mensaje de Texto
        Font f = new Font("Helvetica", Font.BOLD, 25);
        g.setFont(f);
        g.setColor(Color.white);
        g.drawString("Hola Leonel", 250, 60);
        g.setColor(Color.black);
        g.drawString("Hola Leonel", 248, 58);
    }
}
