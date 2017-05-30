/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utile.Pion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.MatteBorder;

/**
 *
 * @author cault
 */
public class VueDebutJeu extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    
    private final JFrame window;
    private final JPanel mainPanel;
    private final JPanel titlePanel;
    
    public VueDebutJeu() {
        this.window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 800);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width/2-window.getSize().width/2,dim.height/2-window.getSize().height/2);
        this.window.setVisible(true);
        this.window.setTitle("l'ile interdite");
        
        mainPanel = new JPanel(new BorderLayout());
        this.window.add(mainPanel);
        
        titlePanel = new JPanel( );
        
        
            mainPanel.add(titlePanel , BorderLayout.NORTH);
            JLabel title = new JLabel("l'ile interdite");
            title.setFont(new Font("Serif",Font.BOLD, 25));
            titlePanel.add(title);
         
        
        
        this.window.repaint();
    }
    
    
    public static void main(String[] args) {
        
        VueDebutJeu debutJeu = new VueDebutJeu();
        
        
    }
    
}
