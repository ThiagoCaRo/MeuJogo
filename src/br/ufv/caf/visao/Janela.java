package br.ufv.caf.visao;

import javax.swing.*;

public class Janela {
    private PainelJogo painelJogo;
    public Janela(PainelJogo painelJogo){
        this.painelJogo = painelJogo;
    }
    public void configuraJanela(){
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setTitle("Joguinho fuleira");
        janela.add(this.painelJogo);
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
