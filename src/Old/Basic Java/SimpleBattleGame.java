import java.util.Scanner;

class SimpleBattle {
    private int[] enemyPosition;
    private int hitNum;
    private int killNum;

    void welcomeIntro() {
        System.out.println("\n\nAgent Alex: Sir, We're infront of the unlucky 13!\nIt's a building of hell, Sir. Over!\n\nSurgent Parvin: Sir, This building has 13 doors.\nAs long as I know, total 3 enemies are still alive, maybe coming from different doors. Over!\n\nAgent Alex: Oh my God! Loadshedding...Reported!\n\nInspector Suman: Sirrrr, it's veryyy darkkkk everywhere! Reported!!!\n\nSurgent Parvin: Sir, We should go back immediately! They've destroyed electricity system.\nIt's Impossible to find them out! I can see nothing. Let's go back, Sir! Over!\n\nInspector Suman: I can hear something, some people are coming from this building! Reported!\n\nYou: It's very dark. You all take cover. Let me go forward. Over!\n\n");
    }

    int setChoice(int choice) {
        System.out.print("Choose door number to shoot blindly: ");
        Scanner inputChoice = new Scanner(System.in);
        choice = inputChoice.nextInt();
        System.out.println("\n");
        return choice;
    }

    int guessMatching(int choice) {
        int temp = killNum;
        hitNum++;

        for(int i=0; i<enemyPosition.length; i++) {
            if(enemyPosition[i] == choice) {
                killNum++;
                enemyPosition[i] = -999;
                if(killNum==1) {
                    System.out.println(killNum + " Enemy Has Been Killed!");
                } else {
                    System.out.println(killNum + " Enemies Has Been Killed!");
                }
                System.out.println("Remaining Bullets: " + (10-hitNum) + "\n");
                break;
            }
        }
        if(temp == killNum) {
            System.out.println("Missed!");
            System.out.println("Remaining Bullets: " + (10-hitNum) + "\n");
            for(int i = 0; i<enemyPosition.length; i++) {
                if(enemyPosition[i] != 0) {
                    if(enemyPosition[i] > choice) {
                        System.out.println("Surgent Parvin: Sir, I'm hearing enemies sound from the right side! Kill, Sir, Kill! Reported!\n");
                    } else {
                        System.out.println("Inspector Suman: Sir, Most probably enemies are on your left side! Ya Allah Save Us! Over!\n");
                    }
                    break;
                }
            }
        }
        if(killNum == enemyPosition.length) {
            System.out.println("Game Over!");
            System.out.println("Total Attempt: " + hitNum);
            System.out.println("Score: " + (10-hitNum)*10 + "\n");
        }
        return killNum;
    }

    void setEnemyPosition(int[] loc) {
        int i = 0;
        while (i<loc.length) {
            loc[i] = (int)(Math.random()*14);
            //Just for Debug
            //System.out.println("loc[" + i + "] = " + loc[i]);
            if(loc[i] != 0) {
                i++;
            }
        }
        enemyPosition = loc; 
    }
    
}

public class SimpleBattleGame {
    public static void main(String[] args) {

        int choice = 0;
        int test;
        int[] location = new int[3];
        
        SimpleBattle game = new SimpleBattle();
        
        game.setEnemyPosition(location);
        
        //Just for Debug
        //System.out.println("location[0] = " + location[0]);
        //System.out.println("location[1] = " + location[1]);
        //System.out.println("location[2] = " + location[2]);
        
        game.welcomeIntro();
        
        int i = 0;
        while(i<10) {
            choice = game.setChoice(choice);
            test = game.guessMatching(choice);
            if(test == 3) {
                break;
            }
            if(test < 3 && i == 9) {
                System.out.println("You Lost!");
                break;
            }
            i++;
        }
    }
}
