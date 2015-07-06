
import java.util.HashMap;
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Principal {
    
    public static void main(String[] args){
        Time time1 = new Time();
        Time time2 = new Time();
    
        time1.addJogador("Goleiro", new Jogador (12, "Diego Cavalieri"));
        time1.addJogador("Atacante", new Jogador (7, "Hulk"));
        time1.addJogador("Zagueiro", new Jogador (32, "David Luiz"));
        
        time2.addJogador("Goleiro", new Jogador (1, "Manuel Neuer"));
        time2.addJogador("Atacante", new Jogador (25, "Thomas Müller"));
        time2.addJogador("Zagueiro", new Jogador (15, "Mats Hummels"));
        
        System.out.println("Posição     Time 1      Time 2");
        
        for (String s : time1.getJogadores().keySet()) {
            System.out.println(s+"      "+time1.getJogadores().get(s)+"     "+time2.getJogadores().get(s));
        }
    }

}