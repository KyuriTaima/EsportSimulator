/*
 * Sulwen de la Croix
 * 25/07/2017
 * Esport-Simulator.
 */
package esport.simulator;

/**
 *
 * @author Sulwen
 */
public class Manager extends TeamMember{
    
    //Atributes
    
     private Object[] schedule = new Object[365][24]; //String: sleep, travel, stream || Game: scrim, competition
    private int compMaking;
    private int teamSpirit;
    private int encouragement;
    private int decisionMaking;
    private int ingeniosity;
    
    //Constructor

    public Manager(int compMaking, int teamSpirit, int encouragement, int decisionMaking, int ingeniosity, String firstName, String surrname, String nickname, boolean gender, int age, int[] languageSpoken, String nationality, int attachement, String hairColor, String eyeColor) {
        super(firstName, surrname, nickname, age, languageSpoken, nationality, attachement, gender, hairColor, eyeColor);        
        this.compMaking = compMaking;
        this.teamSpirit = teamSpirit;
        this.encouragement = encouragement;
        this.decisionMaking = decisionMaking;
        this.ingeniosity = ingeniosity;
    }
    
    
    
}
