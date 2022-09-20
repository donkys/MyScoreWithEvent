/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithevent;

import java.util.EventObject;

/**
 *
 * @author prosf
 */
public class ScoreEvent extends EventObject{
    
    private int uaeScore, thaiScore;
    
    public ScoreEvent(Object o, int thai,int uae) {
        super(o);
        thaiScore = thai;
        uaeScore = uae;
        
    }
    public int getThaiScore(){
        return thaiScore;
    }
    public int getUAEScore(){
        return uaeScore;
    }
    
}
