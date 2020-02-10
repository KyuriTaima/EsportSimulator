/*
 * Sulwen de la Croix
 * 25/07/2017
 * Esport-Simulator.
 */
package esport.simulator;

import java.util.ArrayList;

/**
 *
 * @author Sulwen
 */
public class TeamMember {
    
    //Attributes
    
    private String firstName;
    private String surrname;
    private String nickname;
    private int age;
    private int[] languageSpoken = new int[10]; //fr, eng, de, kr, ru, dan, jp, es, br, chn
    private String nationality; //fr, eng, de, kr, jp, dan, es, ru, us, mex, nor, sue, bel, hol, pol, br, por, chn, tw, su
    private boolean gender; // true = man , false = woman
    private int attachement = 0;
    private ArrayList<String> nameList = new ArrayList();
    private ArrayList<Integer> relationshipLevel = new ArrayList();
    private int salary;
    private String hairColor; //brown, blond, red, bald, black, white, grey
    private String eyeColor; //blue, brown, green, grey
    
    public TeamMember(String firstName, String surrname, String nickname,int age, int[] languageSpoken, String nationality, int attachement, boolean gender, String hairColor, String eyeColor){
        this.firstName = firstName;
        this.surrname = surrname;
        this.nickname = nickname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "firstName=" + firstName + ", surrname=" + surrname + ", nickname=" + nickname + ", age=" + age + ", languageSpoken=" + languageSpoken + ", nationality=" + nationality + ", gender=" + gender + ", attachement=" + attachement + ", nameList=" + nameList + ", relationshipLevel=" + relationshipLevel + ", salary=" + salary + ", hairColor=" + hairColor + ", eyeColor=" + eyeColor + '}';
    }
    
    
}
