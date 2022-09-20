/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithevent;

import java.util.EventListener;

/**
 *
 * @author prosf
 */
public interface ScoreListener extends EventListener {
    public void scoreChange(ScoreEvent e);
}

