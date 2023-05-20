package br.ufv.caf;

import br.ufv.caf.visao.*;
import javax.swing.*;

public class Jogo {
    public static void main(String[] args){
        PainelJogo painel = new PainelJogo();
        Janela janelaJogo = new Janela(painel);
        janelaJogo.configuraJanela();
    }
}
