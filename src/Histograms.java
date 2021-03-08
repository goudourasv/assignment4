/* File:Histograms.java
 *--------------
 *This File reads a list of exam scores
 * and displays a histogram of those numbers.*/


import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;
import java.util.ArrayList;

public class Histograms extends ConsoleProgram {
    private ArrayList<String> firstScore;
    private ArrayList<String> secondScore;
    private ArrayList<String> thirdScore;
    private ArrayList<String> fourthScore;
    private ArrayList<String> fifthScore;
    private ArrayList<String> sixthScore;
    private ArrayList<String> seventhScore;
    private ArrayList<String> eighthScore;
    private ArrayList<String> ninthScore;
    private ArrayList<String> tenthScore;
    private ArrayList<String> perfecto;


    public Histograms() {
        firstScore = new ArrayList<>();
        secondScore = new ArrayList<>();
        thirdScore = new ArrayList<>();
        fourthScore = new ArrayList<>();
        fifthScore = new ArrayList<>();
        sixthScore = new ArrayList<>();
        seventhScore = new ArrayList<>();
        eighthScore = new ArrayList<>();
        ninthScore = new ArrayList<>();
        tenthScore = new ArrayList<>();
        perfecto = new ArrayList<>();

    }


    public void run(){
        try {
            BufferedReader rd = new BufferedReader(new FileReader("MidtermScores.txt"));
            while(true){
                String line = rd.readLine();
                if(line == null) break;
                classifyMidtermScore(line);
            }
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }

        println("00-09: " + addStarsForScore(firstScore.size()));
        println("10-19: " + addStarsForScore(secondScore.size()));
        println("20-29: " + addStarsForScore(thirdScore.size()));
        println("30-39: " + addStarsForScore(fourthScore.size()));
        println("40-49: " + addStarsForScore(fifthScore.size()));
        println("50-59: " + addStarsForScore(sixthScore.size()));
        println("60-69: " + addStarsForScore(seventhScore.size()));
        println("70-79: " + addStarsForScore(eighthScore.size()));
        println("80-89: " + addStarsForScore(ninthScore.size()));
        println("90-99: " + addStarsForScore(tenthScore.size()));
        println("100: " + addStarsForScore(perfecto.size()));
    }

    private String addStarsForScore(int num) {
        String result = "";
        if (num>0) {
            for (int i = 0; i <= num; i++) {
                result += "*";
            }
        }
        return result;
    }

    private void classifyMidtermScore(String line) {
        try {
            String str = line;
            int score = Integer.parseInt(str);

            if(score>=0 && score<=9){
                firstScore.add(line);
            }else if(score>=10 && score<=19){
                secondScore.add(line);
            }else if(score>=20 && score<=29){
                thirdScore.add(line);
            }else if(score>=30 && score<=39){
                fourthScore.add(line);
            }else if(score>=40 && score<=49){
                fifthScore.add(line);
            }else if(score>=50 && score<=59){
                sixthScore.add(line);
            }else if(score>=60 && score<=69){
                seventhScore.add(line);
            }else if(score>=70 && score<=79){
                eighthScore.add(line);
            }else if(score>=80 && score<=89){
                ninthScore.add(line);
            }else if(score>=90 && score<=99){
                tenthScore.add(line);
            }else if(score == 100){
                perfecto.add(line);
            }

        }catch (NumberFormatException e){
            println("Cannot parse line");
        }
    }
}
