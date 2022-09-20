/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithevent;

/**
 *
 * @author prosf
 */
public class SubscriberThaiFan implements ScoreListener{

    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("Live Result: Thai " + e.getThaiScore() + "-" + e.getUAEScore()+ " UAE");
    }
    
}
