/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithevent;

import java.util.ArrayList;

/**
 *
 * @author prosf
 */
public class ScoreSource {
    private int thaiS, uaeS;
    private ArrayList<ScoreListener> listeners;
    public ScoreSource() {
	listeners = new ArrayList<>();
    }
    public void setSourceLine(int thai, int uae) {
        thaiS = thai;
        uaeS = uae;
        fireScoreEvent(new ScoreEvent(this, thaiS, uaeS));
    }

    public int getThaiS() {
        return thaiS;
    }

    public int getUaeS() {
        return uaeS;
    }

    public void addScoreListener(ScoreListener l) {
            listeners.add(l);
    }
    public void removeScoreListener(ScoreListener l) {
            listeners.remove(l);
    }
    public void fireScoreEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
            ScoreListener l = listeners.get(i);
            l.scoreChange(e);
        }
    }
}
