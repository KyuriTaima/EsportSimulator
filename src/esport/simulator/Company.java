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
public class Company {
    
    //Atributes
    
    private String name;
    private int budget;
    private int difficulty; //difficulty to agree on sponsoring
    
    //Constructor

    public Company(String name, int budget, int difficulty) {
        this.name = name;
        this.budget = budget;
        this.difficulty = difficulty;
    }
    
}
