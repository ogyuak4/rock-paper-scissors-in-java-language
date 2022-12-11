package com.mycompany.rock_paper_scissors;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Rock_paper_scissors {

    public static void main(String[] args) {
        System.out.println("Welcome to rock paper scissors game!");
        int still_play=1;
        int inputt=0;
        int computer_choice;
        int total_game=0;
        int win_count=0;
        int lose_count=0;
        int tie_count=0;
        Random random =new Random();
        Scanner scanner = new Scanner(System.in);
        while(still_play==1) {
            System.out.println("if you want to choose rock, please press 0");
            System.out.println("if you want to choose paper, please press 1");
            System.out.println("if you want to choose scissors, please press 2");
            inputt= scanner.nextInt();
            if(inputt==0){
                System.out.println("you chose rock");
            }
            else if(inputt==1){
                System.out.println("you chose paper");
            }
            else if(inputt==2){
                System.out.println("you chose scissors");
            }
            
            else {
                System.out.println("you write wrong number, you dont deserve this game...");
                total_game-=1;
            }
            computer_choice=random.nextInt(3);
            if(computer_choice==inputt){
                tie_count+=1;
                System.out.println("it is a tie!");
                     
            }
            else if((computer_choice==0 && inputt==1) || (computer_choice==1 && inputt==2) || (computer_choice==2 && inputt==0)){
                win_count+=1;
                System.out.println("you win!!!");
            }
            
            else if((computer_choice==0 && inputt==2) || (computer_choice==1 && inputt==0) || (computer_choice==2 && inputt==1)){
                lose_count+=1;
                System.out.println("you lose!!");
            }
            else {
                System.out.println("you cant win cuz you cant even write a number properly");
            }
            total_game+=1;   
            System.out.println("if you want to play this game again, please write 1, if not write anything else.");
            still_play= scanner.nextInt();
            
        }
        System.out.println("total game count: " + total_game);
        System.out.println("total win count: " + win_count);
        System.out.println("total lose count: " + lose_count);
        System.out.println("total tie count: " + tie_count);
        double successrate ;
        successrate = 100 * win_count / total_game;
        System.out.println("success rate: %" + successrate);

        
        
        
    }
}
