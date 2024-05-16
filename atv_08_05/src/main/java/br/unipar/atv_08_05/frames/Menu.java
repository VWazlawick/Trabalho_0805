/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_08_05.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author victo
 */
public class Menu extends JFrame{
    private JFrame exportacao; 
    private JFrame importacao;
    
    public Menu(){
        setTitle("Menu");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        exportacao = new ExportacaoFrame();
        importacao = new TelaManipulacaoArquivo();
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuExportacao = new JMenu("Exportação");
        JMenu menuImportacao = new JMenu("Importação");
        
        JMenuItem menuItem1 = new JMenuItem("Exportação");
        JMenuItem menuItem2 = new JMenuItem("Importação");
        
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFrame(exportacao);
            }
        });
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFrame(importacao);
            }
        });
        
        menuExportacao.add(menuItem1);
        menuImportacao.add(menuItem2);
        
        menuExportacao.setMnemonic(KeyEvent.VK_ALT);
        menuImportacao.setMnemonic(KeyEvent.VK_ALT);
        
        menuBar.add(menuExportacao);
        menuBar.add(menuImportacao);
        
        setJMenuBar(menuBar);
    }
    private void abrirFrame(JFrame frame) {
//        getContentPane().removeAll();
//        getContentPane().add(frame);
//        revalidate();
//        repaint();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }
}

