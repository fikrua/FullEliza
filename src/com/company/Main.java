package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[] str;
        String[] qulifer = {"Please tell me more","Many of my patients tell me the same thing","It is getting late, maybe we had better quit",
                "Why do you say that","You seem to think that","So, you are concerned that"};

        boolean done = false;

        System.out.print("Good day. What is your problem? ");

        while(!done){
            int randomValue = rand.nextInt(qulifer.length-1);

            System.out.print( "Enter your response here or Q to quit:");

            String response = scan.nextLine();

            str = response.split(" ");

            if(response.equalsIgnoreCase("q")){
                done = true;
                System.out.println(">>> end");
            }
            else {
                for (int i = 0; i < str.length; i++) {
                    if (str[i].equalsIgnoreCase("i"))
                        str[i] = "you";
                    else if (str[i].equalsIgnoreCase("me"))
                        str[i] = "you";
                    else if (str[i].equalsIgnoreCase("my"))
                        str[i] = "your";
                    else if (str[i].equalsIgnoreCase("am"))
                        str[i] = "are";
                    else
                        str[i] = str[i];
                }

                List<String> list = Arrays.asList(str);
                String names = String.join(" ", list);
                if (randomValue >= 3){
                    System.out.print(qulifer[randomValue]+" ");
                    System.out.println(names + "?");
                }
                else
                    System.out.println(qulifer[randomValue]+"!");
                done = false;
            }

        }
    }
}
