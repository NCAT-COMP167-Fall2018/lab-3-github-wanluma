/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author wma
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 200;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
        
        String tweeterName = keyboard.nextLine();
        
        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        
        
    
        
        
        
        
        int numTweets = 0;
        
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            tweets[numTweets] = keyboard.nextLine();
            numTweets++;
            
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i]);
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
                    Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        String formattedDate=dateFormat.format(date);

        System.out.println("This is the time when your Tweet was created: "+ formattedDate);

    
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
        
        System.out.println("Your twitter feed is full");
    }
    
}