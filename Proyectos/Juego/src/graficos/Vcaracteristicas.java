/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import clases.Personaje;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author leonel
 */
public class Vcaracteristicas extends JFrame
{
    public Vcaracteristicas(Personaje p)
    {
        setTitle("Caracteristicas");
        setSize(290, 200);
        setResizable(false);
        Capa1 capa1 = new Capa1(p);
        add(capa1);
        
    }
}

class Capa1 extends JPanel
{
    private Personaje p;
    
    public Capa1(Personaje p)
    {
        this.p = p;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString(p.getNombre(), 15, 16);
        g.drawString("Vida: " + (int)p.getVida() + "/" + (int)p.getVidaTotal(),
                15, 31);
        g.drawString("Mana: " + (int)p.getMana() + "/" + (int)p.getManaTotal(),
                150, 31);
        g.drawString("Nivel: " + p.getNivel(), 150, 16);
        g.drawLine(15, 46, 275, 46);
        g.drawString("Exp: " + (int)p.getExp(), 15, 61);
        g.drawLine(15, 65, 275, 65);
        g.drawString("Estado: ", 15, 80);
        g.drawString("Ataque: " + (int)p.getAtaqueMin() + " - " + (int)p.getAtaqueMax(),
                15, 95);
    }
}
