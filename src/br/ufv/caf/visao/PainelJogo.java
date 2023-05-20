package br.ufv.caf.visao;

import javax.swing.*;
import java.awt.*;

public class PainelJogo extends JPanel {
    private final int tamanhoDeTileOriginal = 16; //Tiles default possuem tamanho 16x16
    private final int tamanhoDeTileFinal = tamanhoDeTileOriginal*3; // Significa que cada tile foi aumentada 3 vezes
    private final int larguraTela = 1280;
    private final int alturaTela = 720;

    public PainelJogo(){
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        this.setBackground(Color.cyan);
        this.setDoubleBuffered(true);
    }

}
