/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscorewithevent;

import java.util.Scanner;

/**
 *
 * @author prosf
 */
public class MyScoreWithEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        ScoreSource source = new ScoreSource();
        SubscriberThaiFan subscriber1 = new SubscriberThaiFan();
        SubscriberUAEFan subscriber2 = new SubscriberUAEFan();
        
        source.addScoreListener(subscriber1);
        source.addScoreListener(subscriber2);
        
        int th, uae;

        while (true) {
            try {
                String tmp = inp.nextLine().trim();
                if (tmp.split("\\s+").length == 2) {
                    th = Integer.parseInt(tmp.split("\\s+")[0]);
                    uae = Integer.parseInt(tmp.split("\\s+")[1]);
                } else {
                    th = Integer.parseInt(tmp);
                    uae = Integer.parseInt(inp.nextLine());
                }
                System.out.println("Enter Score Thai " + th + "-" + uae + " UAE");
            } catch (Exception e) {
                break;
            }
            source.setSourceLine(th, uae);
        }
    }
    
}
