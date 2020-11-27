/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerframe;

import javax.swing.JFrame;

/**
 *
 * @author leonel
 */
public class PrimerFrame extends JFrame{
    public PrimerFrame()
    {
        setTitle("Hola Leonel");
        setSize(400, 100);
        addWindowListener(new PrimerWindowListener());
        getContentPane().add(new MiPanel());
    }
}
