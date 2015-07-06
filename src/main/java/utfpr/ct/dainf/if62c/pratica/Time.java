/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author kiqdestro
 */
public class Time {
    private HashMap<String, Jogador> jogadores = new HashMap<>();
    public String getJogadores;
    
    public HashMap <String, Jogador> getJogadores(){
        HashMap<String, Jogador> jogadores = new HashMap<>();
        jogadores = this.jogadores;
        return jogadores;
    }
    
    public void addJogador(String s, Jogador j){
        jogadores.put(s, j);
    }
}
