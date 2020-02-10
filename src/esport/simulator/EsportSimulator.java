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
public class EsportSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        int fanbase = 10000;
        int position = 3;
        int teamSpirit = 85;
        int farming = 96;
        int oneVone = 95;
        int shotcalling = 90;
        int mapawareness = 99;
        int outplays = 100;
        int fun = 45;
        int gameknowledge = 97;
        int towerdiving = 95;
        int endurance = 99;
        int reactivity = 95;
        int kiting = 90;
        int focusing = 98;
        int itemisation = 100;
        int positioning = 100;
        int tiltproof = 75;
        int champVariety = 85;
        String firstName = "Lee";
        String surrname = "See-Wong";
        String nickname = "Faker";
        boolean gender = true;
        String hairColor = "brown";
        String eyeColor = "blue";
        int age = 20;
        int[] languageSpoken = {1,2};
        String nationality = "kr";
        int attachement = 100;
        
        
        
        
        
        Player player1 = new Player(schedule, fanbase,position,teamSpirit,farming,oneVone,shotcalling,mapawareness,outplays,fun,gameknowledge,towerdiving,endurance,reactivity,kiting,focusing,itemisation,positioning,tiltproof,champVariety,firstName,surrname,nickname, age, languageSpoken, nationality, attachement, gender,hairColor,eyeColor);
        System.out.println(player1.toString());
    }
    
}
